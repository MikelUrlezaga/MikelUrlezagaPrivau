
-- 1. Txertatu erregistro berri bat IRAKASLEGOA taulan, Oracle SQL Developer tresna grafikoa erabilita. Datuak honako hauek izan behar dira:
--	    Kodea: 1
--	    Izena: NURIA
--	    Abizenak: ANERO GONZALEZ
--	    NAN: 58328033X
--      Espezialitatea: MATEMATIKA
--      Jaiotze-data: 22/02/1972
--      Antzinatasuna: 9

INSERT INTO IRAKASLEGOA VALUES (1,'NURIA','ANERO GONZALEZ','58328033X', 'MATEMATIKA',TO_DATE('22/02/1972','DD/MM/YYYY'),9);

-- 2. Txertatu beste erregistro batzuk IRAKASLEGOA taulan, SQL sententziak erabiliz. Datuak honako hauek izan behar dira:	

INSERT INTO IRAKASLEGOA VALUES (2,'MARIA LUISA','FABRE BERDUN','51083099F', 'TEKNOLOGIA',TO_DATE('31/03/1975','DD/MM/YYYY'),4);

--INSERT INTO IRAKASLEGOA (KODEA, IZENA, ABIZENAK, NAN, ESPEZIALITATEA, JAIOTZE_DATA, ANTZINATASUNA) VALUES (2,'MARIA LUISA','FABRE BERDUN','51083099F', 'TEKNOLOGIA',TO_DATE('31/03/1975','DD/MM/YYYY'),4);

INSERT INTO IRAKASLEGOA (KODEA, IZENA, ABIZENAK, ESPEZIALITATEA, JAIOTZE_DATA, ANTZINATASUNA) VALUES (3,'JAVIER','JIMENEZ RUIZ','LENGUA',TO_DATE('04/05/1969','DD/MM/YYYY'),10);
INSERT INTO IRAKASLEGOA VALUES (4,'ESTEFANIA','HARO PEREZ','19964324W', 'INGELESA',TO_DATE('22/06/1973','DD/MM/YYYY'),5);
INSERT INTO IRAKASLEGOA (KODEA, IZENA, ABIZENAK) VALUES (5,'JOSE MARIA','ANERO PAYAN');

-- 3. Tresna grafikoa erabiliz IKASTAROAK taulako erregistroak aldatu, ikastaro bakoitzari irakasle bat esleitzeko. Ikastaro bakoitzari honako irakasle hauek esleitu behar dizkiozu:

UPDATE IKASTAROA SET IRAKASLE_KODEA=4 WHERE KODEA=1;
UPDATE IKASTAROA SET IRAKASLE_KODEA=2 WHERE KODEA=2;
UPDATE IKASTAROA SET IRAKASLE_KODEA=2 WHERE KODEA=3;
UPDATE IKASTAROA SET IRAKASLE_KODEA=1 WHERE KODEA=4;
UPDATE IKASTAROA SET IRAKASLE_KODEA=1 WHERE KODEA=5;
UPDATE IKASTAROA SET IRAKASLE_KODEA=3 WHERE KODEA=6;

-- 4. SQL sententzia bat erabiliz, "ESTEFANIA" irakaslearen erregistroa aldatu, jaiotze-datan "1974/06/22" eta antzinatasunean “4” esleituz.

UPDATE IRAKASLEGOA SET JAIOTZE_DATA = TO_DATE('1974/06/22','YYYY/MM/DD'), ANTZINATASUNA=4 WHERE IZENA='ESTEFANIA';

-- 5. Irakasle guztien antzinatasuna aldatu, erregistro guztietan antzinatasuna urte batez handituz. SQL sententzia bakarra erabiliz egin behar duzu.

UPDATE IRAKASLEGOA SET ANTZINATASUNA=NVL(ANTZINATASUNA,0)+1;

-- 6. Ezabatu IKASTAROAK taulatik, “6” kodea duen ikastaroaren erregistroa. Ekintza hau tresna grafikotik egin behar duzu.

DELETE FROM IKASTAROAK WHERE KODEA = 6;

-- 7. Ezabatu IKASLEGOA taulatik “3” kodea duen ikastaroari lotutako erregistroak. SQL sententzia bakarra erabiliz egin behar duzu.

DELETE FROM IKASLEGOA WHERE IKASTARO_KODEA=3;

-- 8. Txertatu IKASLEGO_BERRIA taulako erregistroak IKASLEGOA taulan. SQL sententzia bakarra erabiliz egin behar duzu. Kontuan izan IKASLEGOA taulan KODEA zutabea automatikoki betetzen dela, taula sortzean horretarako sekuentzia bat zehazten baitugu.

INSERT INTO IKASLEGOA(IZENA,ABIZENAK,SEXUA,JAIOTZE_DATA) SELECT IZENA,ABIZENAK,SEXUA,JAIOTZE_DATA FROM IKASLEGO_BERRIA;

-- 9. IKASTAROAK taulan, “2” KODEA duen ikastaroaren erregistroko IKASLE_MAX zutabea eguneratu (IKASLEGOA taulan dauden eta ikastaro hori esleituta duten ikasleen guztizko kopuruari dagokion balioa esleitu). SQL sententzia bakarra erabiliz egin behar duzu.

UPDATE IKASTAROAK SET IKASLE_MAX=(SELECT COUNT(KODEA) FROM IKASLEGOA WHERE IKASTARO_KODEA=2) WHERE KODEA=2;

-- 10. IKASLEGOA taulatik "NURIA" izena duen irakasleak ematen dituen ikastaro guztiei lotutako erregistro guztiak ezabatu. SQL sententzia bakarra erabiliz egin behar duzu.

DELETE FROM IKASLEGOA WHERE IKASTARO_KODEA=ANY(SELECT KODEA FROM IKASTAROAK WHERE IRAKASLE_KODEA=ANY(SELECT KODEA FROM IRAKASLEGOA WHERE IZENA='NURIA'));

