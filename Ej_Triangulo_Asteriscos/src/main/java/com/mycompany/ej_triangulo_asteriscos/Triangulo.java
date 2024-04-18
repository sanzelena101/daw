/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej_triangulo_asteriscos;

/**
 *
 * @author Nocturno
 */
public class Triangulo {

    //constantes
    public static final int CERO = 1;
    public static final int NOVENTA = 2;
    public static final int CIENTO_OCHENTA = 3;
    public static final int DOSCIENTOS_SETENTA = 4;
    //propiedad
    private int numero;
    private int estadoGiro = CERO;

    //constuctor
    public Triangulo(int ancho) {

        this.numero = ancho;
    }

    //get y set
    public int getAncho() {
        return numero;
    }

    public void setAncho(int ancho) {
        this.numero = ancho;
    }

    //metodos propias
    public void posicion_cero() {
        //cero
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void posicion_noventa() {
        //90
        for (int i = 0; i < numero; i++) {
            for (int k = 0; k < numero - i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void posicion_ciento_ochenta() {
        //180
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < numero; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void posicion_docientos_setenta() {
        //270
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void visualizar() {
        switch (estadoGiro) {
            case CERO -> {
                posicion_cero();
            }
            case NOVENTA -> {
                posicion_noventa();
            }
            case CIENTO_OCHENTA -> {
                posicion_ciento_ochenta();
            }
            case DOSCIENTOS_SETENTA -> {
                posicion_docientos_setenta();
            }
            default -> {
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("El Triangulo tiene de altura y ancho: " + numero);
    }

    public void rotar() {
        switch (estadoGiro) {
            case CERO -> {
                estadoGiro++;
            }
            case NOVENTA -> {
                estadoGiro++;
            }
            case CIENTO_OCHENTA -> {
                estadoGiro++;
            }
            case DOSCIENTOS_SETENTA -> {
                estadoGiro++;
            }
            default -> {
            }
        }

    }

    public void establecerRotación(int estadoGiro) {
         switch (estadoGiro) {
            case CERO -> {
                posicion_cero();
            }
            case NOVENTA -> {
                posicion_noventa();
            }
            case CIENTO_OCHENTA -> {
                posicion_ciento_ochenta();
            }
            case DOSCIENTOS_SETENTA -> {
                posicion_docientos_setenta();
            }
            default -> {
                System.out.println("El numero de la posicion no existe" );
                posicion_cero();
            }
        }
    }

}
