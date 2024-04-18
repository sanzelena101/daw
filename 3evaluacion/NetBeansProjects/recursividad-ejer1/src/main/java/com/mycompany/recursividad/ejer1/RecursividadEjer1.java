/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursividad.ejer1;

/**
 *
 * @author Elena Sanz
 */
public class RecursividadEjer1 {
    
    /*   Ejercicio 1: Haz un programa que contenga una función recursiva que obtenga
    el máximo y el mínimo de un array, pasándole como parámetro el array, el
    índice y el número máximo actual. Cuando lo hayas realizado, prueba a hacer la
    misma funcionalidad, pero únicamente pasando los dos primeros parámetros
    (sin el máximo actual)*/

    public static int maximoRec(int[] numeros, int indice, int max) {
        if (indice != numeros.length) {
            if (numeros[indice] > max) {
                max = maximoRec(numeros, indice + 1, numeros[indice]);
            } else {
                max = maximoRec(numeros, indice + 1, max);
            }
        }
        return max;
    }
    
      public static int minimoRec(int[] numeros, int indice, int min) {
        if (indice != numeros.length) {
            if (numeros[indice] < min) {
                min = minimoRec(numeros, indice + 1, numeros[indice]);
            } else {
                min = minimoRec(numeros, indice + 1, min);
            }
        }
        return min;
    }

         public static int maximoRecV2(int[] numeros, int indice) {
             int maximo= Integer.MIN_VALUE;
        if (indice != numeros.length) {
            maximo = Math.max(numeros[indice], maximoRecV2(numeros, indice + 1));
        }
        return maximo;
    }
         
          public static int minimoRecV2(int[] numeros, int indice) {
             int minimo= Integer.MAX_VALUE;
        if (indice != numeros.length) {
            minimo = Math.min(numeros[indice], minimoRecV2(numeros, indice + 1));
        }
        return minimo;
    }



    public static void main(String[] args) {
        //max min recursivo
        int[] numeros = {5, 5, 9, 10, 2, -10, 6};
        System.out.println("maximo segun la version 1: " + maximoRec(numeros, 0, numeros[0]));
        System.out.println("minimo segun la version 1: " + minimoRec(numeros, 0, numeros[0]));
        System.out.println("minimo segun la version 2: " + maximoRecV2(numeros, numeros[0]));
        System.out.println("minimo segun la version 2: " + minimoRecV2(numeros, numeros[0]));
    }

}