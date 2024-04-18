/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fibonaccirecursividad;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Fibonaccirecursividad {
    //crea un metood que calcule el numero fibonacci a partir de un numero pasado como parámetro. Realizalo de manera iterativa y recursiva

    public static int fibonacciIretativo(int n) {
        //casos base: si la respuesta es 0 o 1 devuelve respectivamente
        if ((n == 0 || n == 1)) {
            return n;
        } else {
            //si no, devuelve la suma de los dos anteriores
            int fib1 = 0;
            int fib2 = 1;
            int actual = 0;
            for (int i = 0; i > 0; i++) {
                actual = fib1 + fib2;

                fib1 = fib2;
                fib2 = actual;

            }
            return actual;
        }
    }

    public static int fibonacciRecursivo(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(i - 1) + fibonacciRecursivo(i - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifras;
        System.out.println("Dime cuantas cifras quieres ver de la sucesion de Fibonacci");
        cifras = sc.nextInt();
        for (int i = 0; i < cifras; i++) {
            System.out.println("Cifra nº" + (i + 1) + ": " + fibonacciRecursivo(i));
        }

    }
}
