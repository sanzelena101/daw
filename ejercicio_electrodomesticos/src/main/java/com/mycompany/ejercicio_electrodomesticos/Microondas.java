/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_electrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Microondas extends Electrodomestico{
        
    //atributos
    private String sonido;
    

    //cobstructores
    public Microondas(String _marca, String _tipo, double _potencia, String _sonido) {
        super (_marca, "Lavadora", _potencia);

        sonido = _sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return super.toString() + sonido;
    }

   public void electrodomesticos(){
         System.out.println("calentandooooooo productos"); 
     } 
    
}
