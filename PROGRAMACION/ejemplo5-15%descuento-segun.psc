Algoritmo sin_titulo
	escribir "digame en que mes estamos "
	leer mes 
	escribir "digame el importe que tiene que pagar"
	leer importe 
	
	
	Segun mes Hacer
		Caso:
		"Enero":
			Escribir "Este mes no tiene descuento" importe
		Caso:
		"Febrero":
			Escribir "Este mes no tiene descuento" importe
		Caso:
		"Marzo":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Abril":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Mayo":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Junio":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Julio":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Agosto":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"SEptiembre":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Noviembre":
		Escribir "Este mes no tiene descuento" importe
		Caso:
		"Diciembre":
		Escribir "Este mes no tiene descuento" importe
		
		De Otro Modo:
			Caso:
			"Octubre":
			res<- Importe*0.85
			escribir "el descuento que se aplicara sera de " res ? 
			
			
			
			
			
	Fin Segun
FinAlgoritmo
