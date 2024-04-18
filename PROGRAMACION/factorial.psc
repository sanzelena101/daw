Algoritmo factorial
	//el factorial es n! = n*n-1*n-2*n-3...
	Escribir "dame un numero y te calculo el fatorial"
	Leer num1
	fact<-1
	Para i=1 Hasta num1  Hacer
		fact <-fact*i
		//1=1*1 iteracion 1 fact=1 
		//fact =1*2 fact =2 
		//fact=2*3
		escribir "en la iteracion  ",i," el valor es  " fact
	Fin Para
	Escribir "Quieres volver a calcular otro numero"
	Leer letra
	Si letra= "S" Entonces
		Para i=1 Hasta num1  Hacer
			fact <-fact*i
			//1=1*1 iteracion 1 fact=1 
			//fact =1*2 fact =2 
			//fact=2*3
			escribir "en la iteracion  ",i," el valor es  " fact
		Fin Para
	SiNo 
		Si letra= "N" Entonces
			Escribir "fin de programa"	
		
		FinSi
		
	Fin Si
	
FinAlgoritmo
