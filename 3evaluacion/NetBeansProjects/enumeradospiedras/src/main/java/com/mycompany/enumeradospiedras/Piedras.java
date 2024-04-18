/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enumeradospiedras;

/**
 *
 * @author Elena Sanz
 */
public class Piedras {

    
    
    
    public enum Piedra {
        CALIZA(1200), MARMOL(1423.55f), PIZARRA(1325), CUARZITA(1466.22f);
        private final float pesoPiedra;

        Piedras(float pesoPiedra) {
            this.pesoPiedra = pesoPiedra;
        }

        public double getPesoPiedra() {
            return pesoPiedra;

        }
    }
}
