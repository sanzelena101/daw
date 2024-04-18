Algoritmo sin_titulo
	
	Escribir "bienvenidos a mi primer programa de pseudocódigo"
	//pedimos al usuario la altura
	Escribir "dime el valor de la altura"
	leer altura
	Escribir "Dime el valor de la base"
	leer base
	area<- base*altura
	perimetro<- 2*base+2*altura
	// el area del círculo cuya base es ___ y altura es ___ es ___"
	
	Si base>=0 y altura>=0 Entonces
		leer area 
		Escribir "el area del rectangulo cuya base" base "y cuya altura es" altura "es " area
	SiNo
	
		escribir "error "
	Fin Si
	
FinAlgoritmo
