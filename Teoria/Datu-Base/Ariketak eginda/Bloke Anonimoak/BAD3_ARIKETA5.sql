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
-- Disparadorea sortu: 
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
-- Froga:
DELETE FROM BEZEROAK WHERE BEZEROKODEA = 6;
INSERT INTO BEZEROAK (BEZEROKODEA,BEZEROIZENA,KONTAKTUIZENA,KONTAKTUABIZENA,TELEFONOA,FAX,HELBIDELERROA1,HERRIA) VALUES (39, 'SAN JORGE','Ane','Ruiz','944444444','944445566','Pajares 34', 'Santurtzi');
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
--Froga:
DELETE FROM BEZEROAK WHERE BEZEROKODEA = 35;
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
-- Froga:
UPDATE BEZEROAK SET KREDITUMUGA = 1 WHERE BEZEROKODEA = 1;
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
/
-- Froga:
INSERT INTO BEZEROAK (BEZEROKODEA, BEZEROIZENA, TELEFONOA, FAX, HELBIDELERROA1, HERRIA, SALEROSKETALANGILEKODEA) VALUES (39,'Froga','944445566','945556677','Pajares 34','Santurtzi',19);
INSERT INTO BEZEROAK (BEZEROKODEA, BEZEROIZENA, TELEFONOA, FAX, HELBIDELERROA1, HERRIA) VALUES (40,'Froga','944445566','945556677','Pajares 34','Santurtzi');
INSERT INTO BEZEROAK (BEZEROKODEA, BEZEROIZENA, TELEFONOA, FAX, HELBIDELERROA1, HERRIA, SALEROSKETALANGILEKODEA) VALUES (41,'Froga','944445566','945556677','Pajares 34','Santurtzi',11);

/
