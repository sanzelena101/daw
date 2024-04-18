Algoritmo sin_titulo
	
	contador<- 0
	acierto<-falso
	
	Mientras (contador < 3 y acierto = falso) Hacer
		Escribir "Inserta una clave"
		Leer clave
		
		Si (clave= "mariamoliner") Entonces
			Escribir "Has acertado"
			acierto <- verdadero
			
		FinSi
		contador <- contador + 1 
		
	FinMientras
	Si (contador = 3 y acierto= falso) Entonces
		Escribir "ya no te quedan más intentos"
	FinSi

	
FinAlgoritmo
