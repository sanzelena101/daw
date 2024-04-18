/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.enumeracionesejer2;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Enumeracionesejer2 {

    public enum Semana {
        LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
        private final int numero;

        private Semana(int numero) {
            this.numero = numero;
        }

        public int retornarNumero() {
            return numero;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia de la semana");
        int prueba = sc.nextInt();
        switch (prueba) {
            case 1:
                System.out.println("el dia de la semana es:" + Semana.LUNES);
                break;
            case 2:
                System.out.println("el dia de la semana es:" + Semana.MARTES);
                 break;
            case 3:
                System.out.println("el dia de la semana es:" + Semana.MIERCOLES);
                 break;
            case 4:
                System.out.println("el dia de la semana es:" + Semana.JUEVES);
                 break;
            case 5:
                System.out.println("el dia de la semana es:" + Semana.VIERNES);
                 break;
            case 6:
                System.out.println("el dia de la semana es:" + Semana.SABADO);
                 break;
            case 7:
                System.out.println("el dia de la semana es:" + Semana.DOMINGO);
                 break;
            default:
                System.out.println("todos los dias de la semana");
                 
                     
                 }
                
        }
    }


