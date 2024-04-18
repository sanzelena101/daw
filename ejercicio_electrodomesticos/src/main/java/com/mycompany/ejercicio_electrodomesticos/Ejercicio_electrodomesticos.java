/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_electrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Ejercicio_electrodomesticos {

    public static void main(String[] args) {
       
        Electrodomestico electrodomestico = new Electrodomestico  ("Balay", "microondas",50);
        Lavadora lavadora= new Lavadora("ABS", "lavadora", 200);
        Microondas microondas= new Microondas("LG", "microondas", 300, "miiiiii");
        Frigorifico frigorifico= new Frigorifico("Bosj", "Frigorifico", 70, "ñiiiiiii");
        
        System.out.println(microondas);
        System.out.println(lavadora);
      
        
        //polimorfismo
        Electrodomestico a = new Lavadora();
        Electrodomestico b =new Microondas();
        Electrodomestico c =new Frigorifico();
        
        a.electrodomesticos();
        b.electrodomesticos();
        c.electrodomesticos();
        
   
    }
}
