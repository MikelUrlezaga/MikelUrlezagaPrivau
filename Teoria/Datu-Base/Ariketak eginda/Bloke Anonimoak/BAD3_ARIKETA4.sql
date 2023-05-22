SET SERVEROUTPUT ON;
SET VERIFY OFF;
/* 1. Parametro gisa bi zenbaki pasatuta, handiena zein den edo berdinak diren 
      esango digun prozedura bat sortu */
CREATE OR REPLACE PROCEDURE ZEIN_DA_HANDIENA (X NUMBER, Y NUMBER) AS
BEGIN
    IF X > Y THEN DBMS_OUTPUT.PUT_LINE(X || ' HANDIAGOA DA');
    ELSIF X < Y THEN DBMS_OUTPUT.PUT_LINE(Y || ' HANDIAGOA DA');
    ELSE DBMS_OUTPUT.PUT_LINE('Berdinak dira');
    END IF;
END;
/
EXECUTE ZEIN_DA_HANDIENA(5,9);
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
CREATE OR REPLACE PROCEDURE BEZEROEN_ESKAERA_KOPURUA AS
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
EXECUTE BEZEROEN_ESKAERA_KOPURUA;
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
EXECUTE PRODUKTU_GARESTIENAK;
/
/* 6. Sortu prozedura bat bezeroen kreditu muga eguneratzen duena. Bezero baten 
      kreditu muga 10.000 baino handiagoa bada, gehitu 5.000 bere kreditu mugari, eta
      txikiagoa bada, gehitu 1.000. */
CREATE OR REPLACE PROCEDURE KREDITUMUGA_EGUNERATU AS
	CURSOR CUR_BEZEROAK IS SELECT * FROM BEZEROAK FOR UPDATE;
    KOPURUA NUMBER;
BEGIN
    FOR BEZERO IN CUR_BEZEROAK
    LOOP
         IF BEZERO.KREDITUMUGA > 10000 THEN
            KOPURUA := 5000;
         ELSE
            KOPURUA := 1000;
         END IF;
         UPDATE BEZEROAK SET KREDITUMUGA = KREDITUMUGA + KOPURUA WHERE CURRENT OF CUR_BEZEROAK;         
    END LOOP;   
    COMMIT;
END;
/
EXECUTE KREDITUMUGA_EGUNERATU;
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
BEGIN
    DBMS_OUTPUT.PUT_LINE(BEZA(1,1000));
END;
--SELECT BEZA(1,1000) FROM DUAL;
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
BEGIN
    DBMS_OUTPUT.PUT_LINE(ZURIAKZENBATU('Kaixo mundua!'));
    DBMS_OUTPUT.PUT_LINE(ZURIAKZENBATU('Kaixo'));
    DBMS_OUTPUT.PUT_LINE(ZURIAKZENBATU('Kaixo eta agur mundua!'));
END;  
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