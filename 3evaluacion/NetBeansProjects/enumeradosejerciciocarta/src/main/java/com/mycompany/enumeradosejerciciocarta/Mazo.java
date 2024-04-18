/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enumeradosejerciciocarta;

/**
 *
 * @author Elena Sanz
 */
public class Mazo {

    private Carta[] cartas;

    public Mazo() {
        cartas = new Carta[8];
        cartas[0] = new Carta(1, Carta.palo.OROS);
        cartas[1] = new Carta(2, Carta.palo.OROS);
        cartas[2] = new Carta(10, Carta.palo.BASTOS);
        cartas[3] = new Carta(12, Carta.palo.COPAS);
        cartas[4] = new Carta(10, Carta.palo.BASTOS);
        cartas[5] = new Carta(4, Carta.palo.ESPADAS);
        cartas[6] = new Carta(2, Carta.palo.COPAS);
        cartas[7] = new Carta(1, Carta.palo.ESPADAS);
    }

    ;
public void imprimir() {
        System.out.println("Listado completo del mazo");
        for (Carta Carta : cartas) {
            Carta.imprimir();
        }
    }

    public void sacarCarta() {
        System.out.println("una carta elegida al azar");
        Carta carta = cartas[(int) (Math.random() * 8)];
        carta.imprimir();
        switch (carta.devolverpalo()) {
            case OROS:
                System.out.println("Has ganado 4 puntos");
                 break;
            case COPAS:
                System.out.println("Has ganado 2 puntos");
                 break;
            case BASTOS:
                System.out.println("Has ganado 1 punto");
                 break;
            case ESPADAS:
                System.out.println("Has ganado 3 punto");
                 break;
        }
    }

}
