/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadimprimir;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Recursividadimprimir {

    
       static void incre(int n){
        if(n>0){
            incre(n-1);
            System.out.println("n");      
        }else{
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
       System.out.println("Dime un numero");
       Scanner sc = new Scanner(System.in);
          
       int n = sc.nextInt();
          
        Recursividadimprimir recursividadimprimir = new Recursividadimprimir();
        System.out.println("la suma desde " + n + " es: ");
        System.out.println(recursividadimprimir.incre(n));
    }
    
 
    
}
