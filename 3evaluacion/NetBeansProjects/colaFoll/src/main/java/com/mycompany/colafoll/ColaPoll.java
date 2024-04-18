/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colafoll;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Elena Sanz
 */
public class ColaPoll {

    public static void main(String[] args) {
        /*Realiza un ejercicio en que trabajes con una queue o cola en la
        que la rellenes con números consecutivos de 0 a 10. Finalmente
        muestra todos los valores de la cola.*/
        
        // Object poll() : recupera y elimina un elemento del encabezado del. Devuelve nulo si la cola está vacía.
        
     
        Queue numero   = new LinkedList();

        numero.add("0");
        numero.add("1");
        numero.add("2");
        numero.add("3");
        numero.add("4");
        numero.add("5");
        numero.add("6");
        
        System.out.println("Los valores en la cola son: " +numero.poll());
    }
}
