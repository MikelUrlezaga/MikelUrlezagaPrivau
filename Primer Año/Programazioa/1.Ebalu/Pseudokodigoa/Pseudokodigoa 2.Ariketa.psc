Algoritmo Bisiestoa
	
	Escribir "Sartu urte bat bisiestoa den ala ez jakitzeko"
	Leer Urtea
	Si Urtea >= 400  Entonces
		Si Urtea/4 es entero  Entonces
			Si Urtea/100 es entero Entonces
				Si Urtea/400 es entero Entonces
					Escribir" Urtea bisiestoa da."
				SiNo
					Escribir" Urtea ez da bisiestoa."
				Fin Si
			SiNo
				Escribir" Urtea bisiestoa da."
			
			Fin Si
		SiNo
			Escribir" Urtea ez da bisiestoa."
		Fin Si
	SiNo
		Si Urtea >= 100 Entonces
			Si Urtea/100 es entero Entonces
				Escribir "Urtea ez da bisiestoa."
			SiNo
				Si Urtea/4 es entero Entonces
					Escribir "Urtea bisiestoa da."
				SiNo
					Escribir "Urtea ez da bisiestoa."
				Fin Si
			Fin Si
		SiNo
			Si Urtea/4 es entero Entonces
				Escribir "Urtea bisiestoa da."
			SiNo
				Si Urtea/4 es entero Entonces
					Escribir" Urtea bisiestoa da."
				SiNo
					Escribir "Urtea ez da bisiestoa."
				Fin Si
				
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
