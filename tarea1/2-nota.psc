Algoritmo notas
	Escribir "hola, ¿que nota a sacado el alumno?"
	Leer nota
	
	Si nota<4.9 Entonces
		Escribir "suspenso"
	SiNo
		Si nota=5.9 Entonces
			Escribir "susficiente"
		SiNo
			Si nota=6.9 Entonces
				Escribir "bien"
			SiNo
				Si nota<=8.9 Entonces
					Escribir "notable"
				SiNo
					Si nota<=10 Entonces
						Escribir "sobresaliente"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
