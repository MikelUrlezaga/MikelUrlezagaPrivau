SET SERVEROUTPUT ON;
SET VERIFY ON;

DECLARE
    IDBEZERO NUMBER(2) := &idBezeroa;
    BEZEROA BEZEROAK.BEZEROIZENA%TYPE; --ZURE_IZENA/TAULA/ZUTABEKO_IZENA
BEGIN

SELECT BEZEROIZENA INTO BEZEROA FROM BEZEROAK
WHERE IDBEZERO = BEZEROKODEA;

DBMS_OUTPUT.PUT_LINE(BEZEROA);

END;

/

DECLARE

BEGIN

END;