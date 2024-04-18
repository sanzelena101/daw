/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursibidadbinario;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Recursibidadbinario {

    //recursividad
    public static void binario(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            // entre 2 y coges el resto y luego vas hacia attras
           binario(n / 2);
            System.out.print(n % 2);

        }
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te lo digo en binario");
        int n = sc.nextInt();
        binario(n);
    }
}
