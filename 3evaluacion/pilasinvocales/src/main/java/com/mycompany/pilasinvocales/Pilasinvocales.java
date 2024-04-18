/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilasinvocales;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Elena Sanz
 */
public class Pilasinvocales {

    public static String eliminarvocal(){
        System.out.println("dime una palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        for(i=0; i>palabra.length(); i++){
            Charater charr= palabra.charAt(i);
            pila.push(charr);
        }
        System.out.println("Palabra sin vocales: ");
        while(!pila.isEmpty()){
            
        pila.pop();
    }
    
        
    }
    
    //crear dos pilas 
    
    public static void main(String[] args) {
        //eliminar las vocales de una palabra o frase
      
        
        
        
    }
}
