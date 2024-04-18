/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajandoconpilas;

import java.util.Stack;

/**
 *
 * @author Elena Sanz
 */
public class Trabajandoconpilas {    
    
    
    public static boolean verificaParentesis(String cadena){
        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i < cadena.length()) {
            //recorrer la expresion caracter a caracter
            if (cadena.charAt(i) == '(') {
                pila.push("(");
            } else if (cadena.charAt(i) == ')') {
                if (!pila.empty()) {
                    pila.pop();
                } else {
                    pila.push(")");
                }
            }
            i++;
        }
        if (pila.empty()) 
            return true;
         else 
            return false;
        
    }
    
    
    public static void main(String[] args) {
        String cadenaNO = "(cadena no equilibrada de prarentesis))()()()))";
        String cadenaSI = "(cadena equilibrada con paraentesis())";
        System.out.println("verificacion equilibrado con parentesis para cadenaNO");
        System.out.println(verificaParentesis(cadenaNO));

        System.out.println("verificacion equilibrado con parentesis para cadenaSI");
        System.out.println(verificaParentesis(cadenaSI));
        


}
}


