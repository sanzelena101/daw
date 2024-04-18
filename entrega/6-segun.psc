Funcion sum <- suma( num1 Por Referencia, num2 Por Referencia )
	Escribir "dame un numero "
	Leer num1
	Escribir "dame un numero "
	Leer num2
	sum<-num1+num2
Fin Funcion

Funcion rest <- resta( num1 Por Referencia, num2 Por Referencia )
	Escribir "dame un numero "
	Leer num1
	Escribir "dame un numero "
	Leer num2
	rest<-num1-num2
Fin Funcion

Funcion mul<- multiplicar( num1 Por Referencia, num2 Por Referencia )
	Escribir "dame un numero "
	Leer num1
	Escribir "dame un numero "
	Leer num2
	mul<-num1*num2
Fin Funcion

Funcion div <- dividir( num1 Por Referencia, num2 Por Referencia )
	Escribir "dame un numero "
	Leer num1
	Escribir "dame un numero "
	Leer num2
	div<-num1/num2
Fin Funcion



Algoritmo sin_titulo
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
			Escribir suma(num1, num2)
			
		2:
			Escribir resta(num1, num2)
		3:
			Escribir  multiplicar(num1, num2)
		4:
			Escribir  dividir(num1, num2)
		De Otro Modo:
		5:
			
			escribir "has salido del programa"
			
	Fin Segun
FinAlgoritmo
