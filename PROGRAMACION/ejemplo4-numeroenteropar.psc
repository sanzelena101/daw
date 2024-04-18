Algoritmo sin_titulo
	escribir "dame un numero entero"
	leer num
	si num>=0 entonces 
		n1<-num mod 2 
		si n1=0 entonces 
			escribir "es par"
			si num=0 entonces 
				escribir "el 0 no es par ni impar "
			FinSi
		sino 
			
			escribir "no es par"
			
		FinSi
	sino 
		escribir "hay un error vuelve a intentar con otro numero "
	FinSi
FinAlgoritmo
