/* Sortu bloke anonimo bat, teklatu bidez izen bat eskatzen duena eta pantailan 
hurrengo mezua bistaratzen duena:  “Kaixo izena!” */

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
jakiteko ezin da TO_CHAR funtzioa ‘DAY’ parametroarekin erabili. */

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

DECLARE

BEGIN

EXCEPTION

END;