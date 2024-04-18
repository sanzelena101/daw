/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasdesueprheroes;

/**
 *
 * @author fatimazouhraelhassna
 */
public class FigurasDesueprheroes {

    public static void main(String[] args) {
   
    
    //voy a crear superhéroes 
    Superheroe s1 = new Superheroe("Thor");
    s1.setDescripcion(" un superhéroe y príncipe-guerrero de Asgard, dios del trueno, "
            + "y protector de la tierra, y de los 9 reinos.");
    s1.setCapa(true);
    Superheroe s2 = new Superheroe("Spiderman");
    s2.setDescripcion("un superheroe que salva gente, "
            + "a detenido muchos villanos es un heróe "
            + "con un traje rojo y azul.");
    //si no pongo nada de la capa me deberia salir que el defaul es falso
    
    System.out.println(s1.toString());
    System.out.println(s2.toString());   
    
    //aqui creamos las dimensiones de nuestros superheroes (si no hay superheroe no hay dimension)
    Dimension d1= new Dimension(4,3,3.5);
    Dimension d2= new Dimension(3.2,2,3); 

    
    // ahora creamos la figura (si no hay dimension y superheroe no hay figura)
    Figura f1 = new Figura("01",29.99,d1,s1); 
    Figura f2 = new Figura("02",24.99,d2,s2);
    // intentare volver a meter otra figura como la f1 para ver si pasa algo 
    Figura f3 = new Figura("01",29.99,d1,s1); 
    
    //ahora creamos las colecciones (si no hay dimension y superheroe y figura no hay coleccion)
    Coleccion c1 = new Coleccion("Marvel"); 
    //voy a añadir las dos figuras ya anteriormente creadas 
    c1.añadirFigura(f1);
    c1.añadirFigura(f2);
   // c1.añadirFigura(f3); La figura que intentas añadir ya está en la colección. Esto sale si lo intento 
   
   
   //ahora subire el precio de las figuras 
   c1.subirPrecio(30.9, "01");
   c1.subirPrecio(60.5, "02");
    
   // vamos a ver cual es el valor de la coleccion 
   
    System.out.println("El valor de la colección 1 es de: "+c1.getValorColeccion() ); 
   
   // veamos cual es el volumen de la coleccion 
   
   System.out.println("El volumen de la colección 1 es de: "+c1.getVolumenColeccion() ); 
   
   // cual sera la figura mas valiosa 
   
    System.out.println("La figura mas valiosa de la colección 1 es de: "+c1.masValioso() ); 
   
   
   
   
   
   
    }
}
