Algoritmo programita
		Repetir
			Limpiar Pantalla
			escribir "1-Sumar"
			escribir "2-Resta"
			escribir "3-Multiplicar"
			escribir "4-Dividir"
			escribir "5-Salir"
			escribir "Ingresa la opcion que desees "
			leer option
		Hasta Que (option>0 y option<6 )
		
		Segun option Hacer
			1:
				Escribir  "dime el numero 1 "
				Leer num1
				Escribir  "dime el numero 2 "
				Leer num2
				rest<-num1+num2
				escribir "la suma es " rest
			2:
				Escribir  "dime el numero 1 "
				Leer num1
				Escribir  "dime el numero 2 "
				Leer num2
				rest<-num1-num2
				escribir "la resta es " rest
			3:
				Escribir  "dime el numero 1 "
				Leer num1
				Escribir  "dime el numero 2 "
				Leer num2
				rest<-num1*num2
				escribir "la multiplicacion es " rest
			4:
				Escribir  "dime el numero 1 "
				Leer num1
				Escribir  "dime el numero 2 "
				Leer num2
				rest<-num1/num2
				escribir "la division es " rest
				
			De Otro Modo:
			5:
				
				escribir "has salido del programa"
		Fin Segun
		
		
FinAlgoritmo


