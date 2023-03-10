/* Sortu bloke anonimo bat, teklatu bidez izen bat eskatzen duena eta pantailan 
hurrengo mezua bistaratzen duena:  “Kaixo izena!” */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
DECLARE
    IZENA VARCHAR2(20) := '&izena';
BEGIN
    DBMS_OUTPUT.PUT_LINE('Kaixo ' || IZENA || '!');
END;
/
/* Teklatu bidez sarturiko bi zenbaki oso gehitzen dituen bloke anonimoa sortu */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
DECLARE
    ZBK1 NUMBER := &zenbaki1; -- edo PLS_INTEGER
    ZBK2 NUMBER := &zenbaki2;
    EMAITZA NUMBER;
BEGIN
    EMAITZA := ZBK1 + ZBK2;
    DBMS_OUTPUT.PUT_LINE('Batura: ' || EMAITZA);
    --DBMS_OUTPUT.PUT_LINE('Batura: ' || (ZBK1 + ZBK2));
END;
/
/* Teklatu bidez sartutako zenbaki jakin bat positiboa, negatiboa edo zero den 
esaten digun bloke anonimoa sortu */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
DECLARE
    ZENBAKIA NUMBER := &zenbakia; 
BEGIN
    IF ZENBAKIA < 0 THEN
        DBMS_OUTPUT.PUT_LINE (ZENBAKIA || ' zenbakia negatiboa da');
    ELSIF ZENBAKIA = 0 THEN
        DBMS_OUTPUT.PUT_LINE (ZENBAKIA || ' zenbakia zero da');
    ELSE
        DBMS_OUTPUT.PUT_LINE (ZENBAKIA || ' zenbakia positiboa da');
    END IF;
END;
/
/* Teklatu bidez sartutako zenbaki baten biderkatzeko taula ateratzen duen bloke
anonimoa idatzi. */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
DECLARE
	Z NUMBER := &zenbakia;
BEGIN
	FOR I IN 1..10
	LOOP
		DBMS_OUTPUT.PUT_LINE(Z || ' x ' || I || ' = ' || Z*I);
	END LOOP;
END;
/
/* Jaiotze-data eskatzen dizun eta asteko zein egunetan jaio zinen eta zenbat 
urte dituzun erakusten dizun bloke anonimoa idatzi. Asteko eguna zein den 
jakiteko ezin da TO_CHAR funtzioa ‘DAY’ parametroarekin erabili. */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
DECLARE
	--JAIOTEGUNA DATE := '&jaioteguna';
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
bidez honako izartxo-patroi hau erakusten duena */
/* WHILE EGITURAREKIN */
SET SERVEROUTPUT ON;
SET VERIFY OFF;
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
SET SERVEROUTPUT ON;
SET VERIFY OFF;
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