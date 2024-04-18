/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listastring;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Elena Sanz
 */
public class ListaString {

    public static void main(String[] args) {
        Queue<String> cola= new LinkedList<>();
        cola.add("manzana");
        cola.add("platano");
        cola.add("tomate");
        
        System.out.println("cola: "+cola);
        
        String front =cola.remove();
        System.out.println("front");
        
        System.out.println("cola: "+cola);
        
        cola.add("sandia");
        System.out.println("cola: "+cola);
        
        String peeked = cola.peek();
        System.out.println(peeked);
        
    }
}
