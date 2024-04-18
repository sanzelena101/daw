/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursividadsuma;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class RecursividadSuma {

    int suma(int n) {
        if (n ==1) {
            return 1;
        } else {
            int suma= n + suma(n-1);
            return suma;  
        }
    }

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner sc = new Scanner(System.in);
          
       int n = sc.nextInt();
          
        RecursividadSuma recursividadSuma = new RecursividadSuma();
        System.out.println("la suma desde " + n + " es: ");
        System.out.println(recursividadSuma.suma(n));
    }
}
