Funcion total<-conversiondemoneda(moneda, cantidad)
	
	si moneda = "libra" entonces  
		total=cantidad*1.16
	FinSi
	
	si moneda ="dolar" entonces 
		total=cantidad*0.94
	FinSi
	
	si moneda = "yen" entonces 
		total=cantidad*0.006
	FinSi
FinFuncion


Algoritmo monedas
	Escribir "dime una cantidad  "
	leer cantidad
	Escribir "dime una moneda  "
	Leer moneda

	
	Escribir "La cantidad es "	conversiondemoneda(moneda, cantidad)
	
FinAlgoritmo
