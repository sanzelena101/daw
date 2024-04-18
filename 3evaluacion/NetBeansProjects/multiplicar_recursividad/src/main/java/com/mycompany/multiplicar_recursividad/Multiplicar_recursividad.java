/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multiplicar_recursividad;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Multiplicar_recursividad {

    public static int tabla(int n, int i) {
        //si que se puede multiplicar dentro
        if (n * i < 12) { 
            System.out.println(n + "x" +i+ "="+i*n);
             return tabla(n, i + 1);        
        }
        return n;
    }

    public static void main(String[] args) {
        /*Ejercicio 2: Crea un programa donde se pida en el principal la tabla de
        multiplicar deseada, en un método recursivo generar la tabla de multiplicar. Se
        multiplicará hasta querer llegar al número 12 como resultado. El formato de
        salida es el siguiente:*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero para multiplicar");
        int n = sc.nextInt();
        int i=0;

        tabla(n, i);

    }
}
