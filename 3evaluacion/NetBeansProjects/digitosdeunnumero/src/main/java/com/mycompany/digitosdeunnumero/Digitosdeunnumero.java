/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitosdeunnumero;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Digitosdeunnumero {

   public static int digitos(int num){
        if(num<=0)
            return 0;
        return 1 + digitos(num/10);
    }
    

    public static void main(String[] args) {
        
       System.out.println("Dime un numero");
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
        Digitosdeunnumero digitosdeunnumero = new Digitosdeunnumero();
        System.out.println("el numero " + num + " tiene: ");
        System.out.println(digitosdeunnumero.digitos(num)+ " digitos");
    }
}
