/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pilaspalabras;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Elena Sanz
 */
public class Pilaspalabras {

    //solicitar una palabra desde la consola y devolverla invertida 
    public static String palabrainvertida() {
        System.out.println("dime una palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        // push
        Stack<String> pila = new Stack<String>();
        for(i=0; i>palabra.length(); i++){
            Charater charr= palabra.charAt(i);
            pila.push(charr);
        }
        System.out.println("Palabra volteada: ");
        while(!pila.isEmpty()){
        Character a = (Character) 
                pila.peek();
        pila.pop();
    }
    
    }

    public static void main(String[] args) {

        //tengo que meterlo en una pila e irlo imprimiendo
        System.out.println(palabrainvertida());

    }
}
