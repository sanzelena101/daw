
funcion dimenumeros (num1,num2)
	escribir "dame el numero 1 "
	leer num1
	escribir "dame el numero 2 "
	leer num2
FinFuncion

Algoritmo programita
	Repetir
		Limpiar Pantalla
		escribir "Sumar"
		escribir "Resta"
		escribir "Multiplicar"
		escribir "Dividir"
		escribir "Salir"
		escribir "Ingresa la opcion que desees "
		leer Sumar
		leer Restar
		leer Multiplicar
		leer Dividir 
		leer Salir 
	Hasta Que (n>0 y n<6 )
	Segun dimenumeros (num1,num2) Hacer
		"Sumar":
			sum<-num1+num2
			escribir "la suma es " sum
		"Resta":
			rest<-num1-num2
			escribir "la resta es " rest
		"Multiplicar":
			mult<-num1*num2
			escribir "la multiplicacion es " mult
		"Dividir":
			divid<-num1/num2
			escribir "la division es " divid
			
		De Otro Modo:
		"salir":
			
			escribir "has salido del programa"
	Fin Segun
	
	
FinAlgoritmo
