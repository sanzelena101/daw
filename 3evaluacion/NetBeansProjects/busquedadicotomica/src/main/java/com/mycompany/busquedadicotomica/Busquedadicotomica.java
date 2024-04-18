/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedadicotomica;

/**
 *
 * @author Elena Sanz
 */
public class Busquedadicotomica {

       
    public static int busquedaDicotomica(int[] arr, int elemento) {
        int izquierda = 0;
        int derecha = arr.length - 1;
        
      
        while (izquierda <= derecha) {
            // Calcular el medio
            int medio = izquierda + (derecha - izquierda) / 2;
            
            // Si el elemento medio es igual al elemento buscado, retornar su índice
            if (arr[medio] == elemento)
                return medio;
            
            // Si el elemento medio es mayor que el elemento buscado, buscar en la mitad izquierda
            if (arr[medio] > elemento)
                derecha = medio - 1;
            // Si el elemento medio es menor que el elemento buscado, buscar en la mitad derecha
            else
                izquierda = medio + 1;
        }
        return -1;
    }
    
  
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        
        // Elemento a buscar
        int elemento = 27;
        
        // Realizar la búsqueda dicotómica, se llama a la funcion
        int resultado = busquedaDicotomica(arr, elemento);
        

        if (resultado != -1)
            System.out.println("El elemento " + elemento + " se encuentra en la posición " + resultado);
        else
            System.out.println("El elemento " + elemento + " no se encuentra en el array.");
    }
}