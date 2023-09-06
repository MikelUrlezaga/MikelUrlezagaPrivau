//Logoaren funtzioak
Funcion marra5()
	Definir i Como Entero
	Escribir "  " Sin Saltar
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "*" Sin Saltar
	FinPara
	Escribir " "
FinFuncion

Funcion logo1()
	Definir A , B, i, z Como Entero
	A=1
	B=7
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir " " Sin Saltar
		Para z<-1 Hasta 7 Con Paso 1 Hacer
			Si A <= z y B >= z Entonces
				Escribir"*" Sin saltar
			SiNo
				Escribir" "Sin saltar
			Fin Si
		Fin Para
		Escribir""
		A = A + 1
		B = B - 1
	Fin Para
Fin Funcion

Funcion logo2()
	Definir A , B, i, z Como Entero
	A = 5
	B = 3
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir " " Sin Saltar
		Para z<-1 Hasta 7 Con Paso 1 Hacer
			Si B <= z y A >= z Entonces
				Escribir"*" Sin saltar
			SiNo
				Escribir" "Sin saltar
			Fin Si
		Fin Para
		Escribir""
		A = A + 1
		B = B - 1
	Fin Para
Fin Funcion

Funcion logo3()
	Definir i, z Como Entero
	Para i<-1 Hasta 7 Con Paso 2 Hacer
		Para z<-7 Hasta i Con Paso -2 Hacer
			Escribir " " Sin Saltar
		FinPara
		Escribir "*" Sin Saltar
		Para z<-1 Hasta i-2 Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		Si i = 1 Entonces
			Escribir ""
		SiNo
			Escribir "*"
		FinSi
	FinPara
FinFuncion

Funcion logoa4()
	Definir i, z Como Entero
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Para z<-1 Hasta 4 Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		Escribir "*"
	FinPara
FinFuncion

Funcion logoOsoa()
	logo1()
	logo2()
	logo3()
	marra5()
	logoa4()
	marra5()
	logo3()
FinFuncion

//Erabiltzaile eta pasahitzaren funtzioak
Funcion erabiltzaileEgokia <- erabiltzaileaEgiaztatu(erabiltzaile)
	Definir erabiltzaileEgokia Como Logico
	Segun erabiltzaile
		"asier":
			erabiltzaileEgokia = Verdadero
		"aimar":
			erabiltzaileEgokia = Verdadero
		"mikel":
			erabiltzaileEgokia = Verdadero
		"adrian":
			erabiltzaileEgokia = Verdadero
		"gorka":
			erabiltzaileEgokia = Verdadero
		De Otro Modo:
			Escribir "Saiatu berriro"
			erabiltzaileEgokia = Falso
	FinSegun
FinFuncion

Funcion pasahitzaEgokia<-pasahitzaEgiaztatu(erabiltzaile,pasahitza)
	Definir pasahitzaEgokia Como Logico
	Segun erabiltzaile
		"asier":
			Si pasahitza = 1234 Entonces
				pasahitzaEgokia = Verdadero
			SiNo
				Escribir "Saiatu berriro"
				erabiltzaileEgokia = Falso
			FinSi
		"aimar":
			Si pasahitza = 3210 Entonces
				pasahitzaEgokia = Verdadero
			SiNo
				Escribir "Saiatu berriro"
				erabiltzaileEgokia = Falso
			FinSi
		"mikel":
			Si pasahitza = 1234 Entonces
				pasahitzaEgokia = Verdadero
			SiNo
				Escribir "Saiatu berriro"
				erabiltzaileEgokia = Falso
			FinSi
		"adrian":
			Si pasahitza = 1234 Entonces
				pasahitzaEgokia = Verdadero
			SiNo
				Escribir "Saiatu berriro"
				erabiltzaileEgokia = Falso
			FinSi
		"gorka":
			Si pasahitza = 1234 Entonces
				pasahitzaEgokia = Verdadero
			SiNo
				Escribir "Saiatu berriro"
				erabiltzaileEgokia = Falso
			FinSi
		De Otro Modo:
			Escribir "Saiatu berriro"
			erabiltzaileEgokia = Falso
	FinSegun
FinFuncion

//Logo melokotoia
Funcion logoMeloc()
	Escribir "MMMMNXKKKKXXXNWWMMMMMMMMMWNNXKKKKKKKXWMM"
	Escribir "MMMMXxoooodddxkO0XWMMMWN0Oxxddddoood0WMM"
	Escribir "MMMMMNOxdddxxxxxxxOKNX0xxdxxxxddodOXWMMM"
	Escribir "MMMMWNKOkkkkkkkkkkkkkkxxkkkkkkkkkOXWMMMM"
	Escribir "MMWN0OkOOO000OOkkkkkkkxdodxkkkkkkkO0XWMM"
	Escribir "MWKOkkO00000OOkkkkkkkkkxoloxxkkkkkkkOKWM"
	Escribir "WKkkkOO00OOkkkkkkkkkkkkkxolldxkkkkkkkOXW"
	Escribir "NOxkkkkkkkkkkkkkkkkkkkkkkxocldxxkkkkkk0N"
	Escribir "KkxxxkkkkkkkkkkkkkkkkkkxxxolcooddxxkkxOX"
	Escribir "KxdxxxxkkkkkkkkkkkkkxxxxxdolclooodddxxkX"
	Escribir "Xxodddxxxxxxkkkkxxxxxxxdddoc:looooooodON"
	Escribir "WOoooddddxxxxxxxxxddddddoolc:coooooold0W"
	Escribir "MXxlllooodddddddddddooooool::lollllloONM"
	Escribir "MMXklccllloooooooooooollll:;:cllcccoONMM"
	Escribir "MMMN0oc::ccccllllllllcccc:;;:ccc:cxKWMMM"
	Escribir "MMMMMNOo:;;:::::::::::::;,,;;;:cd0NMMMMM"
	Escribir "MMMMMMMN0xl:;;;;;;;;;;;,,,,;:okKWMMMMMMM"
	Escribir "MMMMMMMMMWX0xoc;;;;;;;,,,:ox0NWMMMMMMMMM"
	Escribir "MMMMMMMMMMMMWWX0kdollloxOKNWMMMMMMMMMMMM"
	Escribir "MMMMMMMMMMMMMMMMMWNXXNNWMMMMMMMMMMMMMMMM"
FinFuncion

//Menu printzipalaren funtzioak
Funcion langileak()
	Definir aukera Como Entero
	Definir langileIzena, nagusiIzena Como Caracter
	Borrar Pantalla
	Escribir "1) Kontsultatu langile baten informazioa"
	Escribir "2) Nagusi baten langileen zerrenda erakutsi"
	Escribir "3) Atzera joan"
	
	Repetir
		Escribir "Aukeratu bat: "
		Leer aukera
		Segun aukera
			1:
				Escribir "Langilearen informazioa"
				Escribir "Idatzi langile baten izena: "
				Leer langileIzena
				Escribir "Langilearen izena: " langileIzena
				Escribir "Telefono zenbakia: 695695695"
				Escribir "Alta eguna: 2022/10/17"
				Escribir "Edozein tekla sakatu aurreko menura bueltatzeko"
				Esperar Tecla
				langileak()
			2: 
				Escribir "Nagusiaren langileen zerrenda"
				Escribir "Nagusi baten izena idatzi: "
				Leer nagusiIzena
				Escribir "Nagusiaren izena: " nagusiIzena
				Escribir "1. Langilearen izena: Gorka"
				Escribir "   Lan-mota: programatzaile"
				Escribir "Edozein tekla sakatu aurreko menura bueltatzeko"
				Esperar Tecla
				langileak()
			3:
				menu()
			De Otro Modo:
				Escribir "Hau ez da aukera bat. Saiatu berriro."
		FinSegun
	Hasta Que aukera>=1 y aukera<=3
FinFuncion

Funcion bezeroak()
	Definir aukera, produktuKantitate Como Entero
	Definir bezeroIzena, produktuIzena Como Caracter
	Borrar Pantalla
	Escribir "1) Bezeroen kontaktuak"
	Escribir "2) Bezeroen fakturak"
	Escribir "3) Atzera joan"
	
	Repetir
		Escribir "Aukeratu bat. "
		Leer aukera
		Segun aukera
			1:
				Escribir "Bezeroen kontaktuak"
				Escribir "Bezero baten izena idatzi: "
				Leer bezeroIzena
				Escribir "Izena: " bezeroIzena
				Escribir "Email: " bezeroIzena "@gmail.com"
				Escribir "Telefonoa: 695695695"
				Escribir "Edozein tekla sakatu aurreko menura bueltatzeko"
				Esperar Tecla
				bezeroak()
			2:
				Escribir "Faktura bat sortu"
				Escribir "Bezeroaren izena sartu: "
				Leer bezeroIzena
				Escribir "Erosiko duen produktuaren izena: "
				Leer produktuIzena
				Escribir "Zenbat erosiko ditu?"
				Leer produktuKantitate
				Escribir "Bezeroaren izena: " bezeroIzena
				Escribir "Eskaera zenbakia: " Aleatorio(0,2000)
				Escribir "Erositako produktuak: " produktuIzena " x " produktuKantitate
				Escribir "Guztira: " 2.55 * produktuKantitate // 2 hamartarretara egon behar da borobilduta beti
				Escribir "Edozein tekla sakatu aurreko menura bueltatzeko"
				Esperar Tecla
				bezeroak()
			3:
				menu()
			De Otro Modo:
				Escribir "Hau ez da aukera bat. Saiatu berriro."
		FinSegun
	Hasta Que aukera>=1 y aukera<=3
	
FinFuncion

Funcion saioaItxi()
	Definir erantzuna Como Caracter
	Escribir "Saioa itxi nahi duzu? (b/e)"
	Leer erantzuna
	Si erantzuna = "e" Entonces
		menu()
	FinSi
	
	Borrar Pantalla
	Escribir "AGUR!"
	logoMeloc()
FinFuncion

Funcion  menu()
	Definir aukera Como Entero
	Borrar Pantalla
	Escribir "1) Langileak"
	Escribir "2) Bezeroak"
	Escribir "3) Saioa itxi"
	Repetir
		
		Escribir "Aukeratu bat: "
		Leer aukera
		Segun aukera
			1:
				langileak()
			2:
				bezeroak()
			3:
				saioaItxi()
			De Otro Modo:
				Escribir "Hau ez da aukera bat. Saiatu berriro."
		FinSegun
	Hasta Que aukera>=1 y aukera<=3
FinFuncion

Algoritmo AplikazioaPseudokodean
	
	logoOsoa()
FinAlgoritmo
