Algoritmo adivina
	Escribir "¡Bienvenido!"
	Escribir "Genera un número aleatorio del 1 al 10, lo tienes que adivinar"
	
	Definir num Como Entero
	num=azar(10)+1;
	//estoy pidiendo que genere numeros al azar del 0 al 100
	
	contador=0 
	Repetir
		Escribir "¿Que número crees que es?"
		Leer num1
			Si num<num1 Entonces
				Escribir "el número es más pequeño"
				contador=contador+1
			SiNo
				Si num>num1 Entonces
					Escribir "el número es más grande"
					contador=contador+1
				Fin Si
			Fin Si
		
	Hasta Que num=num1 
	Escribir "¡Correcto! Has adivinado el número que es " num 
	Escribir "Intentos " contador
	
	

	
	
	
FinAlgoritmo
