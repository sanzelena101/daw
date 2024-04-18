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
   
    //SUPERHEROES
    Superheroe s1 = new Superheroe("Thor");
    s1.setDescripcion("un superhéroe y príncipe-guerrero de Asgard, dios del trueno, " + "y protector de la tierra, y de los 9 reinos.");
    s1.setCapa(true);
    Superheroe s2 = new Superheroe("Spiderman");
    s2.setDescripcion("un superheroe que salva gente, " + "a detenido muchos villanos es un heróe " + "con un traje rojo y azul.");

    System.out.println(s1.toString());
    System.out.println(s2.toString());   

    Dimension d1= new Dimension(9,3,2.5);
    Dimension d2= new Dimension(6.2,2,5); 

    //FIGURAS INFORMACIÓN
    Figura f1 = new Figura("01",50.54,d1,s1); 
    Figura f2 = new Figura("02",20.5,d2,s2);
    Figura f3 = new Figura("01",40.50,d1,s1); 

    Coleccion c1 = new Coleccion("Marvel"); 

    c1.añadirFigura(f1);
    c1.añadirFigura(f2);
   
    c1.subirPrecio(3, "01");
    c1.subirPrecio(9, "02");

    System.out.println("El valor de la colección 1 es de: "+ c1.getValorColeccion()); 

    System.out.println("El volumen de la colección 1 es de: "+ c1.getVolumenColeccion()); 
    System.out.println("La figura mas valiosa de la colección 1 es de: "+ c1.masValioso()); 
   
    }
}
