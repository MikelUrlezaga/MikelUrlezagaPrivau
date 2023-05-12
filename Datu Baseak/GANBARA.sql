/*Sail guztien kodea eta izena*/

SELECT KODEA, IZENA FROM SAILAK;

/*?1? kodea duen langileari dagozkion nomina egiaztagirien hilabetea eta urtea*/

SELECT HILABETEA, URTEA FROM NOMINAK WHERE LANGILE_KODEA = 1;

/*Ehuneko 10eko atxikipena edo handiagoa duten langileen kontu-zenbakia eta izena*/

SELECT IZENA, KONTUA FROM LANGILEAK WHERE ATXIKIPENA >= 10;

/*Langileen kodea eta izena, izenaren arabera ordenatuta*/

SELECT KODEA, IZENA FROM LANGILEAK ORDER BY IZENA ASC;

/*2 seme-alaba baino gehiago dituzten langileen izena*/

SELECT IZENA FROM LANGILEAK WHERE SEMEALABAK > 2;

/*Izena 'A' edo 'J' hizkiz hasten zaien langileen kodea eta kontu-zenbakia*/

SELECT KODEA, KONTUA FROM LANGILEAK WHERE IZENA LIKE 'A%' OR IZENA LIKE 'J%';

/*Datu-basean dauden langileen kopurua*/

SELECT COUNT(KODEA) AS ZENBAT_LANGILE FROM LANGILEAK;

/*Lehen eta azken langileen izena, termino alfabetikoetan*/

SELECT MAX(IZENA) AS ALFA_BERA, MIN(IZENA) AS ALFA_GORA FROM LANGILEAK;

/*Ehuneko 8, 10 edo 12ko atxikipena duten langileen izena eta seme-alaba kopurua.*/

SELECT IZENA, SEMEALABAK FROM LANGILEAK WHERE ATXIKIPENA IN (8,10,12);

/*Seme-alaba kopurua eta langile kopurua seme-alaben arabera multzokatuta, seme-alaba bat baino gehiago dituzten taldeak bakarrik erakutsiz.*/

SELECT SEMEALABAK, COUNT(KODEA) AS LANGILE_KOPURUA FROM LANGILEAK WHERE SEMEALABAK >= 1 GROUP BY SEMEALABAK;

/*Langileen seme-alaba kopurua, gehieneko atxikipena, gutxienekoa atxikipena eta bataz-besteko atxikipena, seme-alaben arabera taldekatuta.*/

SELECT SEMEALABAK, MAX(ATXIKIPENA) AS MAXIMOA, MIN(ATXIKIPENA) AS MINIMOA, AVG(ATXIKIPENA) AS BATASBESTE FROM LANGILEAK GROUP BY SEMEALABAK;

/*?1? kodea duen sailean lan egin duten langileen izena eta eginkizuna*/

SELECT L.IZENA, LA.EGINKIZUNA FROM LANGILEAK L, LANEAN LA WHERE SAIL_KODEA = 1 AND LA.LANGILE_KODEA = L.KODEA;

/*Seme-alaba bat duten langileen izena, lan egiten duten sailaren izena eta beraien eginkizuna*/

SELECT L.IZENA, S.IZENA AS SAILA, LA.EGINKIZUNA FROM LANGILEAK L, SAILAK S, LANEAN LA WHERE L.SEMEALABAK = 1;

/*Seme-alabarik ez duten langileen izena eta lan egiten duten sailaren izena*/

SELECT L.IZENA, S.IZENA AS SAILA FROM LANGILEAK L, SAILAK S WHERE L.SEMEALABAK = 0;

/*?1? kodea duen langilearen izena, bere nomina egiaztagirien hilabete eta urtea, lerro zenbakia eta kantitatea*/

SELECT L.IZENA, N.HILABETEA, N.URTEA, LE.ZENBAKIA, LE.KANTITATEA FROM LANGILEAK L, NOMINAK N, LERROAK LE WHERE L.KODEA = 1;

/*Salmenta sailean lan egin duten langileen izena, eta bere nomina egiaztagirien hilabetea eta urtea*/

SELECT L.IZENA, N.HILABETEA, N.URTEA FROM LANGILEAK L, NOMINAK N, LANEAN LA, SAILAK S WHERE L.KODEA = LA.LANGILE_KODEA AND LA.SAIL_KODEA = S.KODEA AND S.IZENA = 'Salmentak';

/*Langilearen izena eta jasotako diru sarrera guztiak, langilearen izenaren arabera multzokatuta ----------------------------------*/

SELECT L.IZENA, SUM(N.DIRUSARRERA) FROM LANGILEAK L, NOMINAK N WHERE L.KODEA = N.LANGILE_KODEA GROUP BY L.IZENA;

/*2006. urtean 2800? baino gehiago irabazi duten langileen izena*/

SELECT L.IZENA FROM LANGILEAK L, LERROAK LE WHERE L.KODEA = LE.LANGILE_KODEA AND LE.URTEA = 2006 GROUP BY L.KODEA, L.IZENA HAVING SUM(KANTITATEA)>2800; 

/*Langileen seme-alaba kopuruaren batez bestekoa baino seme-alaba gehiago dituzten langile kopurua*/

SELECT COUNT(KODEA) AS ZENBAT FROM LANGILEAK WHERE SEMEALABAK > (SELECT AVG(SEMEALABAK)FROM LANGILEAK);

/*Seme-alaba gehien edo gutxien dituzten langileen izena*/

SELECT IZENA FROM LANGILEAK WHERE SEMEALABAK = (SELECT MAX(SEMEALABAK) FROM LANGILEAK) OR SEMEALABAK = (SELECT MIN(SEMEALABAK) FROM LANGILEAK);

/*Nominen egiaztagiririk ez duten langileen izena*/

SELECT L.IZENA FROM LANGILEAK L, NOMINAK N WHERE L.KODEA NOT IN (SELECT LANGILE_KODEA FROM NOMINAK);

/*Langile guztien izena eta jaioteguna*/

SELECT IZENA, TO_CHAR(JAIOTZEDATA, 'DD/MM/YY') AS DATA FROM LANGILEAK;

/*Langile guztien izena eta jaioteguna, "2000ko urtarrilaren 1a" formatuarekin, eta zutabea “data” gisa etiketatuta*/



/*Langileen izena, lan egin duten sailen izena eta sail bakoitzean egindako eginkizuna (letra larriz)*/



/*Langile guztien izena, jaioteguna eta jaiotegunaren asteko egunaren izena*/



/*Langileen izena eta adina*/



/*50 urte baino gutxiago izan eta seme-alabak dituzten langileen izena, adina eta seme-alaba kopurua*/



/*Sail batean baino gehiagotan lan egin duten langileen izena, adina eta sailaren izena*/



/*Adina 3ren multiploa duten langileen izena, adina eta kontu-zenbakia*/



/*Langile gazteenaren eta nagusienaren izena eta jasotako diru sarrerak.*/
