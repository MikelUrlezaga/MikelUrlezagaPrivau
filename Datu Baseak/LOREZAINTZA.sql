/* Sortu bloke anonimo bat, teklatu bidez izen bat eskatzen duena eta pantailan 
hurrengo mezua bistaratzen duena:  “Kaixo izena!” */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    IZENA VARCHAR2(15):='&IZENA';
BEGIN
    DBMS_OUTPUT.PUT_LINE('Zure izena: '|| IZENA );
END;

/* Teklatu bidez sarturiko bi zenbaki oso gehitzen dituen bloke anonimoa sortu */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    ZENBAKIA1 NUMBER :=&zenbakia1;
    ZENBAKIA2 NUMBER :=&zenbakia2;
BEGIN
    DBMS_OUTPUT.PUT_LINE((zenbakia1 + zenbakia2));
END;

/* Teklatu bidez sartutako zenbaki jakin bat positiboa, negatiboa edo zero den 
esaten digun bloke anonimoa sortu */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    ZENBAKIA VARCHAR2(10) := &Zenakia;
BEGIN
IF ZENBAKIA > 0 THEN
    DBMS_OUTPUT.PUT_LINE('ZENBAKI POSITIBOA DA');
ELSIF ZENBAKIA = 0 THEN
    DBMS_OUTPUT.PUT_LINE('ZURE ZENBAKIA 0 DA');
ELSE
    DBMS_OUTPUT.PUT_LINE('ZENBAKI NEGATIBOA DA');
END IF;
END;

/* Teklatu bidez sartutako zenbaki baten biderkatzeko taula ateratzen duen bloke
anonimoa idatzi. */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    ZENBAKIA VARCHAR2(10) := &Zenbakia;
BEGIN
    FOR I IN 1..10
    LOOP
        DBMS_OUTPUT.PUT_LINE(ZENBAKIA * I);
    END LOOP;
    END;

/* Jaiotze-data eskatzen dizun eta asteko zein egunetan jaio zinen eta zenbat 
urte dituzun erakusten dizun bloke anonimoa idatzi. Asteko eguna zein den 
jakiteko ezin da TO_CHAR funtzioa ‘DAY’ parametroarekin erabili. */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

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
    DBMS_OUTPUT.PUT_LINE('Zure jaiotze data ' || ASTEGUNA || ' da eta ' || URTEAK || ' urte dituzu');
END;

/* Egin bloke anonimo bat PL/SQL-n, zenbaki oso bat eskatzen duena eta pantaila
bidez honako izartxo-patroi hau erakusten duena, EGIN MAXIMORARTE ETA YA */
/* WHILE EGITURAREKIN */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    ZENBAKIA NUMBER := &Zenbakia;
BEGIN
    WHILE ZENBAKIA <= 5
    LOOP
        DBMS_OUTPUT.PUT_LINE(ZENBAKIA);
        ZENBAKIA := ZENBAKIA+1;
    END LOOP;
END;

/* PL/SQL erabiliz gidoi bat idatzi teklatu bidez bezeroaren kodea jasotzen duena 
eta bezeroaren izena (letra larriz) bueltatzen duena. (LOREZAINTZA datu-basea erabili)*/

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    KODEA BEZEROAK.BEZEROKODEA%TYPE := &kodea;
    IZENA BEZEROAK.BEZEROIZENA%TYPE;    
BEGIN
    SELECT UPPER(BEZEROIZENA) INTO IZENA FROM BEZEROAK WHERE BEZEROKODEA = KODEA;
    DBMS_OUTPUT.PUT_LINE('IZENA: ' || IZENA);   
END;

/* PL/SQL erabiliz gidoi bat idatzi teklatu bidez bezeroaren kodea jasotzen duena 
eta bezero horren informazio guztia ateratzen duena. Sartutako bezeroaren kodea
ez bada existitzen 'Bezero hori ez dago datu-basean' mezua erakutsiko du */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    KODEA BEZEROAK.BEZEROKODEA%TYPE := &kodea;
    BEZERO BEZEROAK%ROWTYPE;    
BEGIN
    SELECT * INTO BEZERO FROM BEZEROAK WHERE BEZEROKODEA = KODEA;
    DBMS_OUTPUT.PUT_LINE('KODEA: ' || BEZERO.BEZEROKODEA);   
    DBMS_OUTPUT.PUT_LINE('IZENA: ' || BEZERO.BEZEROIZENA);   
    DBMS_OUTPUT.PUT_LINE('KONTAKTU IZENA: ' || BEZERO.KONTAKTUIZENA);   
    DBMS_OUTPUT.PUT_LINE('KONTAKTU ABIZENA: ' || BEZERO.KONTAKTUABIZENA);  
    DBMS_OUTPUT.PUT_LINE('TELEFONOA: ' || BEZERO.TELEFONOA); 
    DBMS_OUTPUT.PUT_LINE('FAX: ' || BEZERO.FAX); 
EXCEPTION
    WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('Bezero hori ez dago datu-basean');
END;

/* Sortu bloke anonimo bat PL/SQLn, "FR-100" kodea duen "Nektarina" fruta-arbolaren
salmenta-prezioa handitzeko, baldintza hauetan oinarrituta: stockaren kantitatea
10 baino txikiagoa bada, prezioa %30a igoko da. Stockaren kantitatea 11 eta 40
artekoa bada, prezioa %10a igoko da. Bestela, %5a igoko da */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    STOCK PRODUKTUAK.STOCKKOPURUA%TYPE;
    GEHIKUNTZA NUMBER;
BEGIN
    SELECT STOCKKOPURUA INTO STOCK FROM PRODUKTUAK WHERE PRODUKTUKODEA = 'FR-100';
    
    CASE
        WHEN STOCK < 10 THEN GEHIKUNTZA := 1.3;
        WHEN STOCK <= 40 THEN GEHIKUNTZA := 1.1;
        ELSE GEHIKUNTZA := 1.05;
    END CASE;
    DBMS_OUTPUT.PUT_LINE('STOCK: ' || STOCK || ' GEHIKUNTZA: ' || GEHIKUNTZA);
    UPDATE PRODUKTUAK SET SALMENTAPREZIOA = SALMENTAPREZIOA * GEHIKUNTZA WHERE PRODUKTUKODEA = 'FR-100';
    COMMIT;
END;

/* PL/SQL erabiliz bloke anonimo bat sortu “Flores Marivi” eta “Aloha” bezeroen
kreditu muga trukatzeko */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

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

/* Sortu bloke anonimo bat PL/SQL-n, pantailatik sartutako bezero kode batetik 
abiatuta, bezeroak egindako ordainketa maximoa eta minimoa ORDAINKETA_MAXIMOA eta 
ORDAINKETA_MINIMOA izeneko bi aldagaitan uzten duena, eta bien arteko aldea mezu
batean bistaratzen duena. Kontsultak ezer itzultzen ez badu, RAISE_APPLICATION_ERROR
bat bidali beharko da, baliozko kode batekin eta 'Ez dago bezero horren ordainketei
buruzko informaziorik' mezuarekin.*/

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    KODEA ORDAINKETAK.BEZEROKODEA%TYPE := &kodea;
    ORDAINKETA_MAXIMOA ORDAINKETAK.KOPURUA%TYPE;
    ORDAINKETA_MINIMOA ORDAINKETAK.KOPURUA%TYPE;
BEGIN
    SELECT MIN(KOPURUA), MAX(KOPURUA) INTO ORDAINKETA_MINIMOA, ORDAINKETA_MAXIMOA
    FROM ORDAINKETAK WHERE BEZEROKODEA = KODEA;
    IF ORDAINKETA_MINIMOA IS NULL THEN
        RAISE_APPLICATION_ERROR(-20001,'Ez dago bezero horren ordainketei buruzko informaziorik');
    END IF;
    DBMS_OUTPUT.PUT_LINE('Ordainketa mínimoa: ' || ORDAINKETA_MINIMOA);
    DBMS_OUTPUT.PUT_LINE('Ordainketa maximoa: ' || ORDAINKETA_MAXIMOA);
    DBMS_OUTPUT.PUT_LINE('Bien arteko diferentzia: ' || (ORDAINKETA_MAXIMOA - ORDAINKETA_MINIMOA));
EXCEPTION
    WHEN no_data_found THEN
    RAISE_APPLICATION_ERROR(-20001, 'No existe información de salario en ese departamento');
END;

/* PL/SQL erabiliz bloke anonimo bat sortu produktu baten kodea, izena eta gama
eskatzen dituena, eta datu horiek produktuen taulan sartzen dituena (stock kopuruan 
eta salmenta prezioan 0 sartu). Sartutako produktu kodea jada taulan badago "Produktu 
kode hori dagoeneko datu-basean dago" mezua erakutsiko du. Sartutako produktu 
kodeak gidoi bat ez badauka "Produktuaren kodearen formatua ez da zuzena" mezua 
erakutsiko du. Sartutako gama produktu moten taulan ez badago "Produktu mota hori 
ez dago datu-basean" mezua erakutsiko du. Guzti hau egiteko salbuespenak erabili
behar dituzue */

SET SERVEROUTPUT ON;
SET VERIFY OFF;

DECLARE
    KODEA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&kodea';   
    IZENA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&izena';
    GAMA PRODUKTUAK.PRODUKTUKODEA%TYPE := '&gama';       
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