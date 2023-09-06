/* Sortu bloke anonimo bat, teklatu bidez izen bat eskatzen duena eta pantailan 
hurrengo mezua bistaratzen duena:  ?Kaixo izena!? */

SET SERVEROUTPUT ON;
SET VERIFY OFF;


DECLARE
    IZENA VARCHAR2(30):= '&Izena';
BEGIN
    DBMS_OUTPUT.PUT_LINE(IZENA);
END;
/
/* Teklatu bidez sarturiko bi zenbaki oso gehitzen dituen bloke anonimoa sortu */

DECLARE
    ZENB1 NUMBER:= &Zenbaki1;
    ZENB2 NUMBER:= &Zenbaki2;
BEGIN
    DBMS_OUTPUT.PUT_LINE(ZENB1 + ZENB2); 
END;
/
/* Teklatu bidez sartutako zenbaki jakin bat positiboa, negatiboa edo zero den 
esaten digun bloke anonimoa sortu */

DECLARE
    ZENBAKIA NUMBER:= &Zenbakia;
BEGIN
    IF ZENBAKIA<0 THEN
        DBMS_OUTPUT.PUT_LINE('Zenbakia Negatiboa da');
    ELSIF ZENBAKIA>0 THEN
        DBMS_OUTPUT.PUT_LINE('Zenbakia positiboa da');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Zenbakia 0 da');
    END IF;
END;
/
/* Teklatu bidez sartutako zenbaki baten biderkatzeko taula ateratzen duen bloke
anonimoa idatzi. */

DECLARE
    ZENBAKIA NUMBER:= &Zenbakia;
BEGIN
    FOR I IN 1..10
    LOOP  
    DBMS_OUTPUT.PUT_LINE(I || '. ' || ZENBAKIA * I);
    END LOOP;
END;
/
/* Jaiotze-data eskatzen dizun eta asteko zein egunetan jaio zinen eta zenbat 
urte dituzun erakusten dizun bloke anonimoa idatzi. Asteko eguna zein den 
jakiteko ezin da TO_CHAR funtzioa ?DAY? parametroarekin erabili. */

DECLARE
    JAIOTEGUNA VARCHAR2(10) := '&jaioteguna';
    DATA DATE;
    ASTEGUNA VARCHAR2(15);
    URTEAK NUMBER;
BEGIN
    DATA := TO_DATE(JAIOTEGUNA,'DD/MM/YYYY');
    CASE TO_CHAR(DATA,'D')
      WHEN 1 THEN ASTEGUNA := 'ASTELEHENA';
      WHEN 2 THEN ASTEGUNA := 'ASTEARTEA';
      WHEN 3 THEN ASTEGUNA := 'ASTEAZKENA';
      WHEN 4 THEN ASTEGUNA := 'OSTEGUNA';
      WHEN 5 THEN ASTEGUNA := 'OSTIRALA';
      WHEN 6 THEN ASTEGUNA := 'LARUNBATA';
      WHEN 7 THEN ASTEGUNA := 'IGANDEA';
    END CASE;
    URTEAK := TRUNC(MONTHS_BETWEEN(SYSDATE, DATA) / 12);
    DBMS_OUTPUT.PUT_LINE('Zure jaiotze eguna ' || ASTEGUNA || ' da eta ' || URTEAK || ' urte dituzu');
END;
/
/* Egin bloke anonimo bat PL/SQL-n, zenbaki oso bat eskatzen duena eta pantaila
bidez honako izartxo-patroi hau erakusten duena */
/* WHILE EGITURAREKIN */
DECLARE
	ZENBAKIA NUMBER := &zenbakia;
    I NUMBER := 1;
    J NUMBER := 1;
BEGIN
    WHILE I < ZENBAKIA LOOP
      J := 1;
      WHILE J <= I LOOP
         DBMS_OUTPUT.PUT('*');
         J := J + 1;
      END LOOP;
      DBMS_OUTPUT.NEW_LINE();
      I := I + 1;
    END LOOP;
    WHILE I > 0 LOOP
        J := 1;
        WHILE J <= I LOOP
            DBMS_OUTPUT.PUT('*');
            J := J + 1;
        END LOOP;
        DBMS_OUTPUT.NEW_LINE();
        I := I - 1;
    END LOOP;
END;
/
/* FOR EGITURAREKIN */

DECLARE
	ZENBAKIA NUMBER := &zenbakia;
    I NUMBER := 1;
    J NUMBER := 1;
BEGIN
    FOR I IN 1..ZENBAKIA 
    LOOP
        FOR J IN 1..I
        LOOP
            DBMS_OUTPUT.PUT('*');
        END LOOP;
        DBMS_OUTPUT.NEW_LINE;
    END LOOP;
    FOR I IN REVERSE 1..ZENBAKIA-1 
    LOOP
        FOR J IN 1..I
        LOOP
            DBMS_OUTPUT.PUT('*');
        END LOOP;
        DBMS_OUTPUT.NEW_LINE;
    END LOOP;    
END;
/
/* PL/SQL erabiliz gidoi bat idatzi teklatu bidez bezeroaren kodea jasotzen duena 
eta bezeroaren izena (letra larriz) bueltatzen duena. (LOREZAINTZA datu-basea erabili)*/

DECLARE
    KODEA BEZEROAK.BEZEROKODEA%TYPE := &kodea;
    IZENA BEZEROAK.BEZEROIZENA%TYPE;    
BEGIN
    SELECT UPPER(BEZEROIZENA) INTO IZENA 
    FROM BEZEROAK 
    WHERE BEZEROKODEA = KODEA;
    
    DBMS_OUTPUT.PUT_LINE('IZENA: ' || IZENA);   
END;
/
/* PL/SQL erabiliz gidoi bat idatzi teklatu bidez bezeroaren kodea jasotzen duena 
eta bezero horren informazio guztia ateratzen duena. Sartutako bezeroaren kodea
ez bada existitzen 'Bezero hori ez dago datu-basean' mezua erakutsiko du */

SET SERVEROUTPUT ON;
SET VERIFY OFF;


DECLARE
    KODEA NUMBER:= &Kodea;
    BEZERO BEZEROAK%ROWTYPE;
BEGIN
    SELECT * INTO BEZERO
    FROM BEZEROAK
    WHERE BEZEROKODEA=KODEA;
    
    DBMS_OUTPUT.PUT_LINE('KODEA: ' || BEZERO.BEZEROKODEA);   
    DBMS_OUTPUT.PUT_LINE('IZENA: ' || BEZERO.BEZEROIZENA);   
    DBMS_OUTPUT.PUT_LINE('KONTAKTU IZENA: ' || BEZERO.KONTAKTUIZENA);   
    DBMS_OUTPUT.PUT_LINE('KONTAKTU ABIZENA: ' || BEZERO.KONTAKTUABIZENA);  
    DBMS_OUTPUT.PUT_LINE('TELEFONOA: ' || BEZERO.TELEFONOA); 
    DBMS_OUTPUT.PUT_LINE('FAX: ' || BEZERO.FAX);
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Ez dago daturik');   
END;
/

/* Sortu bloke anonimo bat PL/SQLn, "FR-100" kodea duen "Nektarina" fruta-arbolaren
salmenta-prezioa handitzeko, baldintza hauetan oinarrituta: stockaren kantitatea
10 baino txikiagoa bada, prezioa %30a igoko da. Stockaren kantitatea 11 eta 40
artekoa bada, prezioa %10a igoko da. Bestela, %5a igoko da */

DECLARE
    STOCK PRODUKTUAK.STOCKKOPURUA%TYPE;
    GEHIKUNTZA NUMBER;
BEGIN
    SELECT STOCKKOPURUA INTO STOCK
    FROM PRODUKTUAK
    WHERE PRODUKTUKODEA = 'FR-100';
    
    CASE
        WHEN STOCK < 10 THEN GEHIKUNTZA:= 1.3;
        WHEN 11<STOCK AND STOCK<40 THEN GEHIKUNTZA:= 1.1;
        ELSE GEHIKUNTZA:= 1.05;
    END CASE;
    
    UPDATE PRODUKTUAK SET SALMENTAPREZIOA = SALMENTAPREZIOA*GEHIKUNTZA WHERE PRODUKTUKODEA = 'FR-100';
    COMMIT;
END;
/

/* PL/SQL erabiliz bloke anonimo bat sortu ?Flores Marivi? eta ?Aloha? bezeroen
kreditu muga trukatzeko */

DECLARE
   KREDITUMUGA_MARIVI   BEZEROAK.KREDITUMUGA%TYPE;
BEGIN
  SELECT KREDITUMUGA INTO KREDITUMUGA_MARIVI
  FROM BEZEROAK 
  WHERE  BEZEROIZENA = 'Flores Marivi';
  UPDATE BEZEROAK SET KREDITUMUGA = (SELECT KREDITUMUGA FROM BEZEROAK WHERE BEZEROIZENA = 'Aloha') WHERE BEZEROIZENA = 'Flores Marivi';
  UPDATE BEZEROAK SET KREDITUMUGA = KREDITUMUGA_MARIVI WHERE BEZEROIZENA = 'Aloha';
  COMMIT;
END;
/

/* Sortu bloke anonimo bat PL/SQL-n, pantailatik sartutako bezero kode batetik 
abiatuta, bezeroak egindako ordainketa maximoa eta minimoa ORDAINKETA_MAXIMOA eta 
ORDAINKETA_MINIMOA izeneko bi aldagaitan uzten duena, eta bien arteko aldea mezu
batean bistaratzen duena. Kontsultak ezer itzultzen ez badu, RAISE_APPLICATION_ERROR
bat bidali beharko da, baliozko kode batekin eta 'Ez dago bezero horren ordainketei
buruzko informaziorik' mezuarekin.*/

DECLARE
    KODEA ORDAINKETAK.BEZEROKODEA%TYPE := &kodea;
    ORDAINKETA_MAXIMOA ORDAINKETAK.KOPURUA%TYPE;
    ORDAINKETA_MINIMOA ORDAINKETAK.KOPURUA%TYPE;
BEGIN
    SELECT MIN(KOPURUA), MAX(KOPURUA) INTO ORDAINKETA_MINIMOA, ORDAINKETA_MAXIMOA
    FROM ORDAINKETAK 
    WHERE BEZEROKODEA = KODEA;
    
    IF ORDAINKETA_MINIMOA IS NULL THEN
        RAISE_APPLICATION_ERROR(-20001,'Ez dago bezero horren ordainketei buruzko informaziorik');
    END IF;
    DBMS_OUTPUT.PUT_LINE('Ordainketa m?nimoa: ' || ORDAINKETA_MINIMOA);
    DBMS_OUTPUT.PUT_LINE('Ordainketa maximoa: ' || ORDAINKETA_MAXIMOA);
    DBMS_OUTPUT.PUT_LINE('Bien arteko diferentzia: ' || (ORDAINKETA_MAXIMOA - ORDAINKETA_MINIMOA));
EXCEPTION
    WHEN no_data_found THEN
    RAISE_APPLICATION_ERROR(-20001, 'No existe informaci?n de salario en ese departamento');
END;
/

/* PL/SQL erabiliz bloke anonimo bat sortu produktu baten kodea, izena eta gama
eskatzen dituena, eta datu horiek produktuen taulan sartzen dituena (stock kopuruan 
eta salmenta prezioan 0 sartu). Sartutako produktu kodea jada taulan badago "Produktu 
kode hori dagoeneko datu-basean dago" mezua erakutsiko du. Sartutako produktu 
kodeak gioi bat ez badauka "Produktuaren kodearen formatua ez da zuzena" mezua 
erakutsiko du.Sartutako gama produktu moten taulan ez badago "Produktu mota hori 
ez dago datu-basean" mezua erakutsiko du. Guzti hau egiteko salbuespenak erabili
behar dituzue */

DECLARE
    KODEA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&Kodea';   
    IZENA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&Izena';
    GAMA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&Gama';       
    FKPRODUKTUMOTAEXCEPTION EXCEPTION;
    KODEFORMATUOKERRAEXCEPTION EXCEPTION;
    PRAGMA EXCEPTION_INIT (FKPRODUKTUMOTAEXCEPTION,-02291);
BEGIN    
    IF INSTR(KODEA,'-') = 0 THEN
	-- IF KODEA NOT LIKE '%-%' THEN
        RAISE KODEFORMATUOKERRAEXCEPTION;
    END IF;
    INSERT INTO PRODUKTUAK (PRODUKTUKODEA, IZENA, GAMA, STOCKKOPURUA, SALMENTAPREZIOA) VALUES (KODEA,IZENA,GAMA,0,0);
    COMMIT;
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN DBMS_OUTPUT.PUT_LINE('Produktu kode hori dagoeneko datu-basean dago');
    WHEN KODEFORMATUOKERRAEXCEPTION THEN DBMS_OUTPUT.PUT_LINE('Produktuaren kodearen formatua ez da zuzena');
    WHEN FKPRODUKTUMOTAEXCEPTION THEN DBMS_OUTPUT.PUT_LINE('Produktu mota hori ez dago datu-basean');
END;
/
/* PL/SQL erabiliz bloke anonimo bat idatzi, teklatu bidez jasotako produktu mota
baten produktuen kodea, izena eta hornitzailea bistaratzen dituena. */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    MOTA PRODUKTUAK.GAMA%TYPE:='&Mota';
    CURSOR CPRODUKTUAK IS SELECT * FROM PRODUKTUAK WHERE MOTA = GAMA;
BEGIN
    FOR PRODUKTU IN CPRODUKTUAK
    LOOP
        DBMS_OUTPUT.PUT_LINE('PRODUKTU KODEA: ' || PRODUKTU.PRODUKTUKODEA || ' IZENA: ' || PRODUKTU.IZENA || ' HORNITZAILEA: ' || PRODUKTU.HORNITZAILEA);
    END LOOP;
END;
/

/* PL/SQL erabiliz bloke anonimo bat idatzi, teklatu bidez bezero kodea jasotzen 
duena eta bezero horren izena, kontaktu izena eta kontaktu abizena (bi datu hauek
konkatenatuta eta espazio batekin banatuta) eta herria (letra larriz) bistaratzen 
dituena. Honetaz gain, bezero horrek egindako eskaeran zerrenda nahi dugu: kodea,
eskaera data (2023/03/09 formatuan, egoera eta azalpena (azalpenik ez badu, ?Ez 
du azalpenik? adierazi). */

DECLARE
    KODEA BEZEROAK.BEZEROKODEA%TYPE := &KODEA;
    IZENA BEZEROAK.BEZEROIZENA%TYPE;
    KONTAKTUA VARCHAR2(61);
    HERRIA BEZEROAK.HERRIA%TYPE;
    CURSOR CESKAERAK IS SELECT ESKAERAKODEA, TO_CHAR(ESKAERADATA,'YYYY/MM/DD') AS DATA, EGOERA, NVL(AZALPENA,'Ez du azalpenik') AS AZALPENA FROM ESKAERAK WHERE BEZEROKODEA = KODEA;
BEGIN
    SELECT BEZEROIZENA, KONTAKTUIZENA || ' ' || KONTAKTUABIZENA AS KONTAKTUA, UPPER(HERRIA) INTO IZENA, KONTAKTUA, HERRIA FROM BEZEROAK WHERE BEZEROKODEA = KODEA;
    DBMS_OUTPUT.PUT_LINE('BEZERO KODEA: ' || KODEA);
    DBMS_OUTPUT.PUT_LINE('BEZERO IZENA: ' || IZENA);
    DBMS_OUTPUT.PUT_LINE('KONTAKTUA: ' || KONTAKTUA);
    DBMS_OUTPUT.PUT_LINE('HERRIA: ' || HERRIA);
    DBMS_OUTPUT.PUT_LINE('***********************************');
    DBMS_OUTPUT.PUT_LINE('ESKAERAK');
    FOR ESKAERA IN CESKAERAK
    LOOP
        DBMS_OUTPUT.PUT_LINE('***********************************');
        DBMS_OUTPUT.PUT_LINE('ESKAERA KODEA: ' || ESKAERA.ESKAERAKODEA);
        DBMS_OUTPUT.PUT_LINE('ESKAERA DATA: ' || ESKAERA.DATA);
        DBMS_OUTPUT.PUT_LINE('ESKAERA EGOERA: ' || ESKAERA.EGOERA);
        DBMS_OUTPUT.PUT_LINE('ESKAERA AZALPENA: ' || ESKAERA.AZALPENA);
    END LOOP;    
END;
/
/* Pl/SQL erabiliz produktuen salmenta prezioa eguneratzen duen bloke anonimo bat 
idatzi. ?Frutales? motako produktuei %10a igo. ?Aromaticas? motako produktuei %15a 
igo baldin eta 20 ale baino gehiago badaude stockean, bestela %12a. ?Ornamentales?
motako produktuei %20 igo eta gainontzekoei %5a. */ 
DECLARE
    CURSOR CPRODUKTU IS SELECT * FROM PRODUKTUAK FOR UPDATE;
    GEHIKUNTZA NUMBER;
BEGIN
	FOR PRODUKTU IN CPRODUKTU
	LOOP
		CASE PRODUKTU.GAMA
			WHEN 'Frutales' THEN GEHIKUNTZA := 1.1;
			WHEN 'Arom?ticas' THEN 
				IF PRODUKTU.STOCKKOPURUA > 20 THEN
					GEHIKUNTZA := 1.15;
				ELSE
					GEHIKUNTZA := 1.12;
				END IF;
			WHEN 'Ornamentales' THEN GEHIKUNTZA := 1.2;
			ELSE GEHIKUNTZA := 1.05;
		END CASE;
		--DBMS_OUTPUT.PUT_LINE('PRODUKTU: ' || PRODUKTU.PRODUKTUKODEA || ' GAMA: ' || PRODUKTU.GAMA || ' STOCK: ' || PRODUKTU.STOCKKOPURUA ||' GEHIKUNTZA: ' || GEHIKUNTZA);
		UPDATE PRODUKTUAK SET SALMENTAPREZIOA = SALMENTAPREZIOA * GEHIKUNTZA WHERE CURRENT OF CPRODUKTU;
	END LOOP;
    COMMIT;
END;
/
/* 1. Parametro gisa bi zenbaki pasatuta, handiena zein den edo berdinak diren 
esango digun prozedura bat sortu */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

CREATE OR REPLACE PROCEDURE ZENBAKI_HANDIENA_BERDIN (X NUMBER,A NUMBER) AS
BEGIN
    IF X < A THEN DBMS_OUTPUT.PUT_LINE(A || ' da handiena');
    ELSIF X > A THEN DBMS_OUTPUT.PUT_LINE(X || 'da handiena');
    ELSE DBMS_OUTPUT.PUT_LINE('Berdinak dira');
    END IF;
END;
/
EXECUTE ZENBAKI_HANDIENA_BERDIN(4,5);
/
/* 2. Entregatu ez diren eskaerak bistaratzen dituen prozedura garatu. Bistaratu 
beharreko datuak: Bezeroaren izena, eskaera kodea eta eskaera data (23-12-04 formatuan) */

CREATE OR REPLACE PROCEDURE ENTREGATU_GABEKO_ESKAERAK AS
	CURSOR CUR_ESKAERAK IS 
    SELECT B.BEZEROIZENA, E.ESKAERAKODEA, TO_CHAR(E.ESKAERADATA,'YY/MM/DD') AS DATA
    FROM BEZEROAK B, ESKAERAK E
    WHERE B.BEZEROKODEA = E.BEZEROKODEA
    AND E.ENTREGADATA IS NULL;
BEGIN
    FOR ESKAERA IN CUR_ESKAERAK
    LOOP
         DBMS_OUTPUT.PUT_LINE(ESKAERA.BEZEROIZENA || ' - ' || ESKAERA.ESKAERAKODEA || ' - ' || ESKAERA.DATA);
    END LOOP;
END;
/
EXECUTE ENTREGATU_GABEKO_ESKAERAK;
/
/* 3. Prozedura bat garatu bezero bakoitzaren izena eta egindako eskaera kopurua 
bistaratzen duena, eskaera kopuruarengatik beheranzko noranzkoan ordenatuta. */

CREATE OR REPLACE PROCEDURE BEZERO_ESKAERA_KOPURUA AS
        CURSOR CUR_ESKAERAK IS
    SELECT B.BEZEROIZENA, COUNT(E.ESKAERAKODEA) AS KOPURUA
    FROM BEZEROAK B LEFT JOIN ESKAERAK E
    ON B.BEZEROKODEA = E.BEZEROKODEA
    GROUP BY B.BEZEROKODEA, B.BEZEROIZENA;
BEGIN
    FOR ESKAERA IN CUR_ESKAERAK
    LOOP
        DBMS_OUTPUT.PUT_LINE(ESKAERA.BEZEROIZENA || ' - ' || ESKAERA.KOPURUA);
    END LOOP;
END;
/
EXECUTE BEZERO_ESKAERA_KOPURUA;
/
/* 4. Egin ezazu aurreko prozedura berdina, baina orain bezeroaren kodea jasoko
du parametro bezala. */

CREATE OR REPLACE PROCEDURE BEZERO_ESKAERA_KOPURUA(KODEA BEZEROAK.BEZEROKODEA%TYPE) AS
	BEZEROIZENA BEZEROAK.BEZEROIZENA%TYPE;
    KOPURUA NUMBER;
BEGIN
    SELECT B.BEZEROIZENA, COUNT(E.ESKAERAKODEA) AS KOPURUA INTO BEZEROIZENA, KOPURUA
    FROM BEZEROAK B LEFT JOIN ESKAERAK E
    ON B.BEZEROKODEA = E.BEZEROKODEA
    WHERE B.BEZEROKODEA = KODEA
    GROUP BY B.BEZEROKODEA, B.BEZEROIZENA;
    DBMS_OUTPUT.PUT_LINE(BEZEROIZENA || ' - ' || KOPURUA);
END;
/
EXECUTE BEZERO_ESKAERA_KOPURUA(6);
/
/* 5. Bost produktu garestienak bistaratzen dituen prozedura garatu. Erakutsi 
beharreko datuak: produktu kodea, produktuaren izena, salneurria. */

CREATE OR REPLACE PROCEDURE PRODUKTU_GARESTIENAK AS
	CURSOR CUR_PRODUKTUAK IS SELECT PRODUKTUKODEA, IZENA, SALMENTAPREZIOA FROM PRODUKTUAK ORDER BY SALMENTAPREZIOA DESC FETCH FIRST 5 ROWS ONLY;
BEGIN
    FOR PRODUKTU IN CUR_PRODUKTUAK
    LOOP
        DBMS_OUTPUT.PUT_LINE(PRODUKTU.PRODUKTUKODEA || ' ' || PRODUKTU.IZENA || ' ' || PRODUKTU.SALMENTAPREZIOA);         
    END LOOP;   
END;
/
SET SERVEROUTPUT ON;
SET VERIFY OFF;

EXECUTE PRODUKTU_GARESTIENAK;
/
CREATE OR REPLACE PROCEDURE PRODUKTU_GARESTIENAK AS
	CURSOR CUR_PRODUKTUAK IS SELECT PRODUKTUKODEA, IZENA, SALMENTAPREZIOA FROM PRODUKTUAK ORDER BY SALMENTAPREZIOA DESC;
BEGIN
    FOR PRODUKTU IN CUR_PRODUKTUAK
    LOOP
         DBMS_OUTPUT.PUT_LINE(PRODUKTU.PRODUKTUKODEA || ' ' || PRODUKTU.IZENA || ' ' || PRODUKTU.SALMENTAPREZIOA);
         IF CUR_PRODUKTUAK%ROWCOUNT = 5 THEN
            EXIT;
         END IF;
    END LOOP;   
END;
/
/* 6. Sortu prozedura bat bezeroen kreditu muga eguneratzen duena. Bezero baten 
kreditu muga 10.000 baino handiagoa bada, gehitu 5.000 bere kreditu mugari, eta
txikiagoa bada, gehitu 1.000. */

CREATE OR REPLACE PROCEDURE KRERDITU_MUGA AS
        CURSOR CBEZEROAK IS SELECT * FROM BEZEROAK FOR UPDATE;
    GEHIKUNTZA NUMBER;
BEGIN
    FOR BEZERO IN CBEZEROAK
    LOOP
        IF BEZERO.KREDITUMUGA > 10000 THEN
            GEHIKUNTZA:= 5000;
        ELSE
            GEHIKUNTZA:= 1000;
        END IF;
        UPDATE BEZEROAK SET KREDITUMUGA = KREDITUMUGA + GEHIKUNTZA WHERE CURRENT OF CBEZEROAK;
    END LOOP;
    COMMIT;
END;
/

SET SERVEROUTPUT ON;
SET VERIFY OFF;

EXECUTE KRERDITU_MUGA;
/
/* 7. Sortu prozedura bat sarrera parametro bezala herri bat, zenbatekoa eta 
ehunekoa jasotzen dituena eta herri horretako bezero guztien kreditu muga
igotzen duena. Igoera adierazitako ehunekoa edo zenbatekoa izango da
(kasu bakoitzean bezeroarentzat onuragarriena dena). */

CREATE OR REPLACE PROCEDURE BEZERO_KREDITUMUGA_EGUNERATU(HERRIAPARAM BEZEROAK.HERRIA%TYPE, ZENBATEKOA NUMBER, EHUNEKOA NUMBER) AS
	CURSOR CUR_BEZEROAK IS SELECT * FROM BEZEROAK WHERE HERRIA = HERRIAPARAM FOR UPDATE;
    KOPURUA NUMBER;
BEGIN
    FOR BEZERO IN CUR_BEZEROAK
    LOOP        
         UPDATE BEZEROAK SET KREDITUMUGA = GREATEST(BEZERO.KREDITUMUGA+ZENBATEKOA,BEZERO.KREDITUMUGA+BEZERO.KREDITUMUGA*EHUNEKOA/100) WHERE CURRENT OF CUR_BEZEROAK;         
    END LOOP;   
    COMMIT;
END;
/
EXECUTE BEZERO_KREDITUMUGA_EGUNERATU('Sydney',15000,10);
/
/* 8. BEZa kalkulatzeko funtzio bat sortu, honako ezaugarri hauekin:
/* 	  Funtzioari aplikatu beharreko kopurua eta BEZ mota pasatuko zaizkio. Honako hauek izan daitezke:
		1: Tasa orokorra % 21
		2: Tasa murriztua % 10
		3: Tasa supermurriztua % 4
	  Funtzioak zenbateko totala itzuliko du (zenbatekoa + aplikatutako BEZaren %) */

CREATE OR REPLACE FUNCTION BEZA (MOTA PLS_INTEGER, KOPURUA NUMBER) RETURN NUMBER AS
    GUZTIRA NUMBER := 0;
BEGIN
    CASE MOTA
        WHEN 1 THEN GUZTIRA := KOPURUA * 1.21;
        WHEN 2 THEN GUZTIRA := KOPURUA * 1.10;
        WHEN 3 THEN GUZTIRA := KOPURUA * 1.04;
    END CASE;
    RETURN GUZTIRA;
END;
/

SET SERVEROUTPUT ON;
SET VERIFY OFF; 

BEGIN
    DBMS_OUTPUT.PUT_LINE(BEZA(1,1000));
END;
/
SELECT BEZA(1,1000) FROM DUAL;
/

/* 9. Langile baten kodea emanda, langile horren izen-abizenak bueltatzen dituen
funtzioa sortu. Langilea existitzen ez bada, NO_DATA_FOUND salbuespena 
erabiliko dugu mezu hori erakusteko. */

CREATE OR REPLACE FUNCTION GETLANGILEIZENA (KODEA LANGILEAK.LANGILEKODEA%TYPE) RETURN VARCHAR2 AS 
    IZENABIZENAK VARCHAR2(152);
BEGIN
	SELECT IZENA || ' ' || ABIZENA1 || ' ' || ABIZENA2 INTO IZENABIZENAK
    FROM LANGILEAK
    WHERE LANGILEKODEA = KODEA;
    
	RETURN IZENABIZENAK;
EXCEPTION 
    WHEN NO_DATA_FOUND THEN
         DBMS_OUTPUT.PUT_LINE('Ez da existitzen kode hori duen langilerik');
    RETURN NULL;
END;  
BEGIN
    DBMS_OUTPUT.PUT_LINE(GETLANGILEIZENA(1));
    DBMS_OUTPUT.PUT_LINE(GETLANGILEIZENA(234));
END;
/
/* 10. Sarrerako parametro gisa bezero baten kodea duen funtzio bat sortu, bezero 
horren ordainketen batura itzuliko duena. Zuzen dabilela frogatzeko, 
funtzioak itzulitako emaitza pantaila bidez inprimatuko dugu. Bezero batek 
ordainketarik egin ez badu, salbuespen bat sortu behar dugu mezu horrekin. */

CREATE OR REPLACE FUNCTION GETORDAINKETAK (KODEA ORDAINKETAK.BEZEROKODEA%TYPE) RETURN NUMBER AS 
    TOTALA NUMBER;
BEGIN
	SELECT SUM(KOPURUA) INTO TOTALA FROM ORDAINKETAK WHERE BEZEROKODEA = KODEA;
    IF TOTALA IS NULL THEN
        RAISE_APPLICATION_ERROR(-20001, KODEA || ' kodea duen bezeroa ez da existitzen');
    END IF;
    RETURN TOTALA;
END;  
BEGIN
    DBMS_OUTPUT.PUT_LINE(GETORDAINKETAK(1));
    DBMS_OUTPUT.PUT_LINE(GETORDAINKETAK(234));
END;
/
/* 11. Esaldi bat jasotzen duen eta esaldi horrek dituen “zuri” kopurua bueltatzen
duen funtzio biltegiratua sortu. */
CREATE OR REPLACE FUNCTION ZURIAKZENBATU (ESALDIA VARCHAR2) RETURN NUMBER AS
	KONTADOREA NUMBER;
BEGIN
    KONTADOREA := 0;
    FOR I IN 1..LENGTH(ESALDIA)
    LOOP
        IF SUBSTR(ESALDIA, I, 1) = ' '  THEN
            KONTADOREA := KONTADOREA + 1;
        END IF;
    END LOOP;
    RETURN KONTADOREA;
END;
/
SELECT ZURIAKZENBATU('H   H') FROM DUAL;
/

/* 12. Sortu produktuen zerrenda bistaratzen duen biltegiratutako prozedura bat.
       Bistaratu beharreko datuak: kodea, izena, izenak dituen “zuri” kopurua. */
CREATE OR REPLACE PROCEDURE GETPRODUKTUAK AS
	CURSOR CUR_PRODUKTUAK IS SELECT PRODUKTUKODEA, IZENA, ZURIAKZENBATU(IZENA) AS KOPURUA FROM PRODUKTUAK;
BEGIN
    FOR PRODUKTU IN CUR_PRODUKTUAK
    LOOP
         DBMS_OUTPUT.PUT_LINE(PRODUKTU.PRODUKTUKODEA || ' ' || PRODUKTU.IZENA || ' ' || PRODUKTU.KOPURUA);         
    END LOOP;   
END;
/
EXECUTE GETPRODUKTUAK;
/

/* 1. Datu-basean  disparadore bat sortu, BEZEROAK taulan datuak txertatzeko edo ezabatzeko egiten diren eragiketak 
		auditatzeko, zehaztapen hauen arabera:
		- Lehenik eta behin, AUDITORETZA_BEZEROAK taula sortuko da, VARCHAR2 (200) motako zutabe bakarrarekin.
		- Manipulazioren bat gertatzen denean, errenkada bat txertatuko da taula horretan. Errenkadak informazio hau jasoko du, elkarri lotuta:
			- Eguna eta ordua.
			- Ezabatu edo txertatu diren BEZEROKODEA eta BEZEROIZENA.
			- Egin den eragiketa mota: 'TXERTATU' edo 'EZABATU'
			Adibidea: "2023/03/20 16:34 # 1 - DGPRODUCTIONS GARDEN # EZABATU" */
-- Taula sortu:

CREATE TABLE AUDITORETZA_BEZEROAK(
    GERTAERA VARCHAR2(200)
);

CREATE OR REPLACE TRIGGER BEZEROAKAUDITATU
   AFTER INSERT OR DELETE ON BEZEROAK
   FOR EACH ROW
BEGIN
   IF DELETING THEN 
      INSERT INTO AUDITORETZA_BEZEROAK VALUES(TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI') || ' # ' || :OLD.BEZEROKODEA || ' - ' || :OLD.BEZEROIZENA || ' # EZABATU');
   ELSIF inserting THEN
      INSERT INTO AUDITORETZA_BEZEROAK VALUES(TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI') || ' # ' || :NEW.BEZEROKODEA || ' - ' || :NEW.BEZEROIZENA || ' # TXERTATU');
   END IF;
END ;
/

/* 2. Sortu BEFORE DELETE motako disparadore bat BEZEROAK taularen gainean, ‘Sydney’ 
herriko erregistroak ezabatzea galarazten duena. */

CREATE OR REPLACE TRIGGER BEZEROAKEZABATU
BEFORE DELETE ON BEZEROAK 
FOR EACH ROW
BEGIN
    IF :OLD.HERRIA = 'Sydney' THEN
        RAISE_APPLICATION_ERROR(-20100,'Ezin da Sidney herriko bezerorik ezabatu');
    END IF;
END;
/

/* 3. Sortu disparadore bat BEZEROAK taulako KREDITUMUGA ez dela gutxitzen ziurtatzeko */
CREATE OR REPLACE TRIGGER KREDITUMUGAEZJEITSI
BEFORE UPDATE ON BEZEROAK
FOR EACH ROW
BEGIN
   IF  :OLD.KREDITUMUGA > :NEW.KREDITUMUGA THEN
         RAISE_APPLICATION_ERROR(-20101,'Ezin da bezero baten kreditu muga gutxitu!');
   END IF;
END;
/

/* 4. Sortu disparadore bat BEZEROAK taularen gainean, bezero bat txertatzean ez dadin utzi salerosketa langile batek bost bezero baino gehiagoko izaten. */
CREATE OR REPLACE TRIGGER SALEROSKETALANGILEMAXIMOA
BEFORE INSERT ON BEZEROAK
FOR EACH ROW
DECLARE
    KOPURUA NUMBER;
BEGIN
    IF :NEW.SALEROSKETALANGILEKODEA IS NOT NULL THEN
        SELECT COUNT(*) INTO KOPURUA
        FROM BEZEROAK WHERE SALEROSKETALANGILEKODEA = :NEW.SALEROSKETALANGILEKODEA;
        IF KOPURUA >= 5 THEN RAISE_APPLICATION_ERROR (-20102, :NEW.SALEROSKETALANGILEKODEA || ' kodea duen langileak ezin ditu bost bezero baino gehiago eduki!');
        END IF;
    END IF;
END;