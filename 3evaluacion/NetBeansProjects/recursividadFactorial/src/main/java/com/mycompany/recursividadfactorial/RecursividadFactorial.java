/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursividadfactorial;

/**
 *
 * @author Elena Sanz
 */
public class RecursividadFactorial {

    //modo1
    int factorial(int n) {
        int resultado = 1;
        for (int i = n; i >= 1; i--) {
            resultado *= i;
            factorial(--n);
        }
        return resultado;
    }

    
    //modo2 EL BUENOO
    int factorial2(int n) {
        if (n > 0) {
            int resultado = n * factorial2(n - 1);
             return resultado;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        RecursividadFactorial recursividadFactorial = new RecursividadFactorial();
        System.out.println("factorial de" + 6);
        System.out.println(recursividadFactorial.factorial(6));

    }
}
