Algoritmo adivina
	Escribir "�Bienvenido!"
	Escribir "Genera un n�mero aleatorio del 1 al 10, lo tienes que adivinar"
	
	Definir num Como Entero
	num=azar(10)+1;
	//estoy pidiendo que genere numeros al azar del 0 al 100
	
	contador=0 
	Repetir
		Escribir "�Que n�mero crees que es?"
		Leer num1
			Si num<num1 Entonces
				Escribir "el n�mero es m�s peque�o"
				contador=contador+1
			SiNo
				Si num>num1 Entonces
					Escribir "el n�mero es m�s grande"
					contador=contador+1
				Fin Si
			Fin Si
		
	Hasta Que num=num1 
	Escribir "�Correcto! Has adivinado el n�mero que es " num 
	Escribir "Intentos " contador
	
	

	
	
	
FinAlgoritmo
