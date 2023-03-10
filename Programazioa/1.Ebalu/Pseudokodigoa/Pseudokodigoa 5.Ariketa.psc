Funcion   hiru (  )
	izarrak()
	a<-5
	Para z<-1 Hasta 5 Con Paso 1 Hacer
		Escribir"*   " Sin Saltar
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			Si a=i Entonces
				kaixohitza(z)
			SiNo
				Escribir"    " Sin Saltar
			Fin Si
		Fin Para
		a=a-1
		Escribir"*   "
	Fin Para
	izarrak()
Fin Funcion

Funcion   kaixohitza (z)
	Segun z Hacer
		1:
			Escribir "K   " Sin Saltar
		2:
			Escribir "A   "Sin Saltar
		3:
			Escribir "I   "Sin Saltar
		4:
			Escribir "X   "Sin Saltar
		5:
			Escribir "O   "Sin Saltar
		De Otro Modo:
			
	Fin Segun
	
Fin Funcion

Funcion   kaixo1 (  )
	a<-1
	
	Para z<-1 Hasta 5 Con Paso 1 Hacer
		Escribir"*   " Sin Saltar
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			Si a=i Entonces
				kaixohitza(z)
			SiNo
				Escribir"    " Sin Saltar
			Fin Si
		Fin Para
		a=a+1
		Escribir"*   "
	Fin Para
	
Fin Funcion

Funcion   bi (  )
    izarrak()
	kaixo1()
	izarrak()
Fin Funcion

Funcion   bat (  )
	izarrak()
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "*   K   A   I   X   O   *"
	Fin Para
	izarrak()
Fin Funcion

Funcion  izarrak (  )
	Para i<-1 Hasta 7 Con Paso 1 Hacer
		Escribir "*   " Sin Saltar
	Fin Para
	Escribir ""
Fin Funcion 



Algoritmo Kaixo
	hiru()
	
	
FinAlgoritmo
