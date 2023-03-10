Funcion   Logoa2 (  )
	Definir A , B Como Entero
	A = 5
	B = 3
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Para z<-1 Hasta 7 Con Paso 1 Hacer
			Si B <= z y A >= z Entonces
				Escribir"* " Sin saltar
			SiNo
				Escribir"  "Sin saltar
			Fin Si
		Fin Para
		Escribir""
		A = A + 1
		B = B - 1
	Fin Para
	
	
Fin Funcion

Funcion   Logoa1 (  )
	Definir A , B Como Entero
	A=1
	B=7
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para z<-1 Hasta 7 Con Paso 1 Hacer
			Si A <= z y B >= z Entonces
				Escribir"* " Sin saltar
			SiNo
				Escribir"  "Sin saltar
			Fin Si
		Fin Para
		Escribir""
		A = A + 1
		B = B - 1
	Fin Para
	
Fin Funcion


	


Algoritmo LogoaZati1
	Logoa1()
	Logoa2()

	
	
FinAlgoritmo
