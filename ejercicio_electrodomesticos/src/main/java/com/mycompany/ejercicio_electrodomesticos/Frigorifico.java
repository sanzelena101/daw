/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_electrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Frigorifico extends Electrodomestico {
    
      //atributos
    private String sonido;
    

    //cobstructores
    public Frigorifico(String _marca, String _tipo, double _potencia, String _sonido) {
        super (_marca, "Lavadora", _potencia);

        sonido = _sonido;
    }


    @Override
    public String toString() {
        return super.toString() + sonido;
    }
    
       public void alerta(){
         System.out.println("puerta abierta"); 
     } 
    
}
