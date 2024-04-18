/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursividad_ejer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Recursividad_ejer3 {
 static Scanner sc = new Scanner(System.in);
    public static int tabla(int n, ArrayList numeros) {
         System.out.println("Dime un numero");
         n = sc.nextInt();
        //se imprime el array
        if (n != -1) {
            numeros.add(n);
            return tabla(n, numeros);

        } else {
            System.out.println(numeros);
        }
        return n;
    }

    public static void main(String[] args) {
        /* Ejercicio 3: Crea un programa donde ingreses en un método recursivo la
        captura de números, que serán almacenados en un array. La recursividad
        termina cuando el usuario ingrese el número -1, al término del mismo,
        mostrarás los valores capturados en el mismo método*/

        System.out.println("Dime un numero");
       
        int n = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        tabla(n, numeros);

    }
}
