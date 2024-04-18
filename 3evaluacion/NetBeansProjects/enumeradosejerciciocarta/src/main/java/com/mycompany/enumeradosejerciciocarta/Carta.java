/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enumeradosejerciciocarta;

/**
 *
 * @author Elena Sanz
 */
public class Carta {
    
    private int numcarta;
    
        public enum palo{
        OROS, COPAS, ESPADAS,BASTOS
         }
        
    private int numero;
    private palo palo;

    public Carta(int numero, palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

   
    public void imprimir(){
        System.out.println(numero + " - " + palo.toString().toLowerCase());
    }
   
    public palo devolverpalo(){
        return palo;
    }
    
}
