/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadinvertido;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Recursividadinvertido {

       //recursivo
     public static void invertirnumero (int n) {
        if (n<10) {
            System.out.println(n);
        }else{
            System.out.print(n%10);
            invertirnumero(n/10);
        }
    }
    
    
    public static void main(String[] args) {
        //crea un metood que dado un numero lo imprima invertido por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        
         invertirnumero(n);
        
    }
}
