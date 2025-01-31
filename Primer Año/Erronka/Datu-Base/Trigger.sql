CREATE OR REPLACE TRIGGER MARGENA_MANTENDU
    AFTER UPDATE ON PRODUKTU
    FOR EACH ROW
DECLARE
    ALDAKETA NUMBER;
BEGIN
    IF :OLD.BALIOA != :NEW.BALIOA THEN
        ALDAKETA := (:OLD.BALIOA - :NEW.BALIOA)*(-1);
    ELSE
        ALDAKETA := 0;
    END IF;
    
    IF :OLD.BALIOA < :NEW.BALIOA THEN
        UPDATE PRODUKTU SET SALNEURRIA = SALNEURRIA + ALDAKETA;
    ELSE
        UPDATE PRODUKTU SET SALNEURRIA = SALNEURRIA - ALDAKETA;
    END IF;
END;
/
BEGIN
    UPDATE PRODUKTU SET BALIOA = BALIOA + 10 WHERE ID = 58;
END;
/
