Algoritmo sin_titulo
	Escribir "bienvenidos"
	//pedimos al usuario el numero de chicos
	Escribir "dime el numero de chicos"
	leer chicos
	Escribir "Dime el numero de chicas"
	leer chicas
	//el usuario nos da los datos
	
	Total <- chicos+chicas 
	Escribir  total "total"
	
	chicas1<-(chicas*100)%total
	chicos1<- 100-chicas1
	Escribir "El porcentaje de las chicas es " chicas1 "%"
	Escribir "El porcentaje de las chicos es " chicos1 "%"
	
	
	
FinAlgoritmo
