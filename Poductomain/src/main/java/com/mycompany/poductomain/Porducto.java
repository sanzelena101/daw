/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poductomain;

/**
 *
 * @author Nocturno
 */
public class Porducto {
    private String FechaCad; 
    private int numlote; 

    public Porducto(String FechaCad, int numlote) {
        this.FechaCad = FechaCad;
        this.numlote = numlote;
    }

    public String getFechaCad() {
        return FechaCad;
    }

    public void setFechaCad(String FechaCad) {
        this.FechaCad = FechaCad;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }

@Override
    public String toString(){
        
        return "Este producto "+"\nLa fecha de caducidad es: "+FechaCad+" \nY el numero de lote: "+numlote;
        
    }
    /*public void añadirProducto(){
    }*/
}
