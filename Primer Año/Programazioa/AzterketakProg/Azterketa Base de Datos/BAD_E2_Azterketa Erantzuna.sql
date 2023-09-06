-- 1. Lehenik eta behin AZTERKETA izeneko erabiltzailea sortu eta dagozkion baimenak esleitu behar dizkiozu. Erabiltzaile honen eskeman datu baseko taulak sortu eta datuak txertatu behar dituzu emandako scripta erabiliz
CREATE USER AZTERKETA IDENTIFIED BY AZTERKETA;
GRANT ALL PRIVILEGES TO AZTERKETA;

-- 2. Egiaztatu ahal izan duzunez, scripta exekutatu ondoren, bi taula sortu gabe geratu dira. Hurrengo ezaugarriak dituzten DENDA eta ITALIARPELIKULA izeneko taulak sortu:
CREATE TABLE DENDA (
    ID NUMBER(1) PRIMARY KEY,
    IFZ VARCHAR2(9) UNIQUE,
    IZENA VARCHAR2(50) NOT NULL,
    HERRIA VARCHAR2(50)
    --CONSTRAINT PK_DENDA PRIMARY KEY (ID),
    --CONSTRAINT UQ_DENDA_IFZ UNIQUE(IFZ)
);
CREATE TABLE ITALIARPELIKULA (
    ID NUMBER(5) PRIMARY KEY, 
	IZENBURUA VARCHAR2(255) NOT NULL, 	
	URTEA VARCHAR2(4), 	
	ID_JATORRIZKO_HIZKUNTZA NUMBER(2), 
	ALOKAIRU_IRAUPENA NUMBER(1) DEFAULT 3,
	ALOKAIRU_TARIFA NUMBER(4,2) DEFAULT 4.99, 
	IRAUPENA NUMBER(3) NOT NULL, 	
	SAILKAPENA VARCHAR2(10) NOT NULL, 	    
    --CONSTRAINT PK_ITALIARPELIKULA PRIMARY KEY (ID),
    CONSTRAINT FK_ITALIARPELIKULA_HIZKUNTZA FOREIGN KEY (ID_JATORRIZKO_HIZKUNTZA) REFERENCES HIZKUNTZA(ID),
 	CONSTRAINT CK_SAILKAPENA CHECK (SAILKAPENA IN ('NC-17', 'R', 'PG', 'G'))
);

-- 3. Sortu berri duzuen ITALIARPELIKULA taulan, PELIKULA taulan biltegiratuta dauden italiako pelikulak sartu
INSERT INTO ITALIARPELIKULA
--(ID, IZENBURUA, URTEA, ID_JATORRIZKO_HIZKUNTZA, ALOKAIRU_IRAUPENA, ALOKAIRU_TARIFA, IRAUPENA, SAILKAPENA)
SELECT ID, IZENBURUA, URTEA, ID_JATORRIZKO_HIZKUNTZA, ALOKAIRU_IRAUPENA, ALOKAIRU_TARIFA, IRAUPENA, SAILKAPENA
FROM PELIKULA WHERE ID_HIZKUNTZA = (SELECT ID FROM HIZKUNTZA WHERE IZENA = 'Italian');

-- 4. Hurrengo datuak txertatu: 
-- 4.1. DENDA izeneko taulan bi denda txertatu (1 eta 2 IDak eduki behar dituzte).
INSERT INTO DENDA VALUES (1,'A11111111','BOOM Gran Via','Bilbo');
INSERT INTO DENDA (ID,IFZ,IZENA,HERRIA) VALUES (2,'B22222222','BOOM Puente','Portugalete');
-- 4.2. BEZERO izeneko taulan hurrengo datuak dituen bezeroa txertatu (ID: 600; ID_DENDA: 2; IZENA: San Jorge; SORTZE-DATA: gaurko eguna)
INSERT INTO BEZERO(ID,ID_DENDA,IZENA,SORTZE_DATA) VALUES (600,2,'San Jorge',SYSDATE);

-- 5. Hurrengo aldaketak egin tauletan:
-- 5.1. BEZERO taulari murrizketa bat gehitu ID_DENDA zutabeko balioa DENDA taulako ID batekin bat egin dezan.
ALTER TABLE BEZERO ADD CONSTRAINT FK_BEZERO_DENDA FOREIGN KEY (ID_DENDA) REFERENCES DENDA(ID);
-- 5.2. PELIKULA taulako BERRITZE_KOSTUA zutabea aldatu bere lehenetsitako balioa 19,99 izan dadin.
ALTER TABLE PELIKULA MODIFY BERRITZE_KOSTUA DEFAULT 19.99;
-- 5.3. PELIKULA taulan EKOIZPEN_DATA izeneko zutabea gehitu (DATE datu mota).
ALTER TABLE PELIKULA ADD EKOIZPEN_DATA DATE;
-- 5.4. ITALIARPELIKULA taulatik HIZKUNTZA taularekiko duen murrizketa ezabatu.
ALTER TABLE ITALIARPELIKULA DROP CONSTRAINT FK_ITALIARPELIKULA_HIZKUNTZA;
-- 5.5. ITALIARPELIKULA taulatik ID_JATORRIZKO_HIZKUNTZA zutabea ezabatu.
ALTER TABLE ITALIARPELIKULA DROP COLUMN ID_JATORRIZKO_HIZKUNTZA;
-- 5.6. ITALIARPELIKULA taula ezabatu.
DROP TABLE ITALIARPELIKULA;

-- 6. Hurrengo kontsutak egin
-- 6.1 "B" letratik hasten den izena duten bezero aktiboen izen eta abizenak. (Bezero bat aktiboa da AKTIBO zutabean "B" balioa baldin badu)
SELECT IZENA, ABIZENAK FROM BEZERO WHERE IZENA LIKE 'B%' AND AKTIBO='B';
-- 6.2. "DAN HARRIS" aktoreak egindako pelikulen izenburua
SELECT P.IZENBURUA FROM PELIKULA P, AKTORE_PELIKULA AP, AKTORE A
WHERE P.ID = AP.ID_PELIKULA
AND AP.ID_AKTORE = A.ID
AND A.IZENA='DAN'
AND A.ABIZENAK='HARRIS';

SELECT P.IZENBURUA FROM PELIKULA P INNER JOIN AKTORE_PELIKULA AP
ON P.ID = AP.ID_PELIKULA 
INNER JOIN AKTORE A ON AP.ID_AKTORE = A.ID
WHERE A.IZENA='DAN'
AND A.ABIZENAK='HARRIS';
-- 6.3. "Drama" kategoriako pelikula kopurua
SELECT COUNT(*) FROM KATEGORIA_PELIKULA KP, KATEGORIA K
WHERE KP.ID_KATEGORIA = K.ID
AND K.IZENA='Drama';
-- 6.4. Pelikulen tarifa txikiena, handiena eta bataz-besteko iraupena bi dezimalekin.
SELECT MIN(ALOKAIRU_TARIFA) AS TXIKIENA, MAX(ALOKAIRU_TARIFA) AS HANDIENA, ROUND(AVG(IRAUPENA),2) AS BATAZBESTEKOA FROM PELIKULA;

-- 6.5. Inbentarioan dauden pelikulen izenburuen zerrenda eta pelikula kopurua, kopuruaren arabera beheranzko noranzkoan ordenatuta.
SELECT P.IZENBURUA, COUNT(*)
FROM PELIKULA P, INBENTARIO I
WHERE P.ID=I.ID_PELIKULA
GROUP BY P.ID, P.IZENBURUA
ORDER BY COUNT(*) DESC;
-- 6.6. 2005eko ekainean pelikula bat alokatu duten bezeroen izen desberdinak
SELECT DISTINCT B.IZENA FROM BEZERO B, ALOKAIRU A 
WHERE B.ID=A.ID_BEZERO 
-- AND ALOKAIRU_DATA>=TO_DATE('01/06/2005','DD/MM/YYYY') 
-- AND ALOKAIRU_DATA<=TO_DATE('30/06/2005','DD/MM/YYYY');
AND ALOKAIRU_DATA BETWEEN TO_DATE('01/06/2005','DD/MM/YYYY') AND TO_DATE('30/06/2005','DD/MM/YYYY');
-- 6.7. Pelikularen bat bueltatu barik duten bezeroen izen-abizenak eta emaila. Izen-abizenak konkatenatuta erdian espazio bategaz eta emaila letra minuskuletan
SELECT B.IZENA || ' ' || B.ABIZENAK AS IZENABIZENAK, LOWER(B.EMAILA)
FROM BEZERO B, ALOKAIRU A
WHERE B.ID = A.ID_BEZERO
AND A.BUELTATZE_DATA IS NULL;
-- 6.8. Hizkuntza bakoitzaren izena eta hizkuntza horretan dagoen pelikula kopurua. (Kontutan eduki pelikularik gabeko hizkuntzak egon daitezkeela, eta hauek ere zerrendan agertu behar direla)
SELECT H.IZENA, COUNT(P.ID)
FROM HIZKUNTZA H LEFT JOIN PELIKULA P
ON H.ID = P.ID_HIZKUNTZA
GROUP BY H.ID, H.IZENA;
-- 6.9. 30 alokairu baino gehiago dituzten pelikulen izenburua eta alokairu kopurua 
SELECT P.IZENBURUA, COUNT(*)
FROM PELIKULA P, ALOKAIRU A, INBENTARIO I
WHERE P.ID=I.ID_PELIKULA
AND I.ID_INBENTARIO = A.ID_INBENTARIO
GROUP BY P.ID, P.IZENBURUA
HAVING COUNT(*) > 30;
-- 6.10. Pelikula laburrenaren edo laburrenen izenburua
SELECT IZENBURUA FROM PELIKULA WHERE IRAUPENA=(SELECT MIN(IRAUPENA) FROM PELIKULA);
-- 6.11. "PG" edo "G" sailkapena duten eta ordubete baino gehiago irauten duten pelikulen izenburua, deskribapena eta eguneko tarifa. Deskribapenik ez badu "Deskribapenik ez du" erakutsi.
SELECT IZENBURUA, NVL(DESKRIBAPENA, 'Ez du deskribapenik'), ALOKAIRU_TARIFA/ALOKAIRU_IRAUPENA AS EGUNEKO_TARIFA
FROM PELIKULA WHERE SAILKAPENA IN ('PG','G') AND IRAUPENA>60;
-- 6.12. 2005eko Ekainaren 16an egindako alokairu bakoitzeko: bezeroaren izena, abizenak, bueltaze data (2000-01-30 formatuan), pelikularen izenburua eta sailkapena
SELECT B.IZENA, B.ABIZENAK, TO_CHAR(A.BUELTATZE_DATA,'YYYY-MM-DD') AS BUELTATZEDATA, P.IZENBURUA, P.SAILKAPENA
FROM BEZERO B, ALOKAIRU A, PELIKULA P, INBENTARIO I
WHERE B.ID=A.ID_BEZERO
AND I.ID_PELIKULA=P.ID
AND A.ID_INBENTARIO=I.ID_INBENTARIO
AND A.ALOKAIRU_DATA=TO_DATE('16/06/2005','DD/MM/YYYY');

-- 7. Datu-basean hurrengo aldaketak burutu
-- 7.1. Eguneratu 200 IDa duen bezeroaren informazioa (izena: SAN; abizenak: JORGE; Denda:1)
UPDATE BEZERO SET IZENA='SAN', ABIZENAK='JORGE', ID_DENDA=1 WHERE ID=200;
-- 7.2. Eguneratu pelikula guztien alokairu tarifa, %10a igoz.
UPDATE PELIKULA SET ALOKAIRU_TARIFA = ALOKAIRU_TARIFA*1.1;
-- 7.3. Ezabatu INBENTARIO taulatik "2" IDa duen dendakoak diren eta inoiz alokatuak izan ez diren aleak.
DELETE FROM INBENTARIO WHERE ID_DENDA=2 AND ID_INBENTARIO NOT IN(SELECT ID_INBENTARIO FROM ALOKAIRU);
-- 7.4. Ezabatu "KATIE ELLIOTT" bezeroa. Zuzenean ezabatu dezakezu? Zergaitik? Zer egin behar duzu ezabatu al izateko?
--Ezin da zuzenean ezabatu ALOKAIRU taulako ID_BEZERO zutabearekiko erreferentzia duelako. Ezabatu al izateko, murrizketa
--hori aldatu behar dugu, bezero taulatik erregistroren bat ezabatzean, alokairu taulakoak ezabatu daitezen edo zutabe
--horretan NULL balioa agertu daiten. Murrizketa aldatu barik egin al izateko, lehenengo ALOKAIRU taulako erregistroak
--ezabatu behar dira.
ALTER TABLE ALOKAIRU DROP CONSTRAINT FK_ALOKAIRU_BEZERO;
ALTER TABLE ALOKAIRU ADD CONSTRAINT FK_ALOKAIRU_BEZERO FOREIGN KEY(ID_BEZERO) REFERENCES BEZERO(ID) ON DELETE SET NULL;
--DELETE FROM ALOKAIRU WHERE ID_BEZERO=(SELECT ID FROM BEZERO WHERE IZENA='KATIE' AND ABIZENAK='ELLIOTT');
DELETE FROM BEZERO WHERE IZENA='KATIE' AND ABIZENAK='ELLIOTT';

-- 8. Sortu VPELIKULA izeneko ikuspegia, pelikula bakoitzaren IDa, izenburua, iraupena, sailkapena eta kategorien izenak edukiko ditu
CREATE VIEW VPELIKULA AS SELECT P.ID, P.IZENBURUA, P.IRAUPENA, P.SAILKAPENA, K.IZENA AS KATEGORIA FROM PELIKULA P, KATEGORIA_PELIKULA KP, KATEGORIA K WHERE P.ID=KP.ID_PELIKULA AND KP.ID_KATEGORIA=K.ID;





