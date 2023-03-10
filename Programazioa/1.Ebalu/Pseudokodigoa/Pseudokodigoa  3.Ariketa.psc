Algoritmo Kalkulagailua
	Escribir "Sartu zenbaki bat "
	Leer zenbakia1
	Escribir "Sartu beste zenbaki bat"
	Leer zenbakia2
	Escribir "Ze eragiketa egin nahi duzu? (+,-,x,/,mod,balio absolutua, erro karratua)"
	Leer eragiketa
	Repetir
		Repetir
			
			Segun eragiketa Hacer
				"+":
					Escribir zenbakia1 + zenbakia2
					x=1
				"-":
					Escribir zenbakia1 - zenbakia2
					x=1
				"x":
					Escribir zenbakia1 * zenbakia2
					x=1
				"/":
					Escribir zenbakia1 / zenbakia2
					x=1
				"mod":
					Escribir zenbakia1 Mod zenbakia2
					x=1
				"balio absolutua":
					Escribir ABS(zenbakia1) "Da lehenengo zenbakiaren balio absolutua"
					Escribir ABS(zenbakia2) "Bigarren zenbakiarena"
					x=1
				"erro karratua":
					Escribir "Lehenengo zenbakia: " RAIZ(zenbakia1)
					Escribir "Bigarren zenbakia: " RAIZ(zenbakia2)
					x=1
				De Otro Modo:
					Escribir "Idatzi berriro eragiketa"
					Leer eragiketa
					x=0
			Fin Segun
		Hasta Que  x=1
		
		
		Escribir "Beste eragiketa bat egin nahi duzu? (bai la ez)"
		Leer erantzuna
		Si erantzuna= "bai" Entonces
			entzuna = "bai"
		SiNo
			Escribir "idatzi berriro erantzuna"
		Fin Si
	Hasta Que erantzuna ="ez"
	
	
FinAlgoritmo
