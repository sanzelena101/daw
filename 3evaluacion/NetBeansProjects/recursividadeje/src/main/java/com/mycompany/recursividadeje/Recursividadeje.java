/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadeje;

/**
 *
 * @author Elena Sanz
 */
public class Recursividadeje {

    //de manera recursiva 
    void cuentaAtras(int n){
        if(n>0){
            System.out.println(n);
            cuentaAtras(--n);
        }else{
        System.out.println("final!");
        }
    }
    
    
    public static void main(String[] args) {
        Recursividadeje  recursividadeje = new Recursividadeje();
       recursividadeje.cuentaAtras(10);
    }
}


