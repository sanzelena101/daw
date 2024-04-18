/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimpares;

import java.util.Scanner;

/**
 *
 * @author elena
 */
public class NUMEROSIMPARES {
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A continuación se mostrarán los primeros 50 números impares:");
        System.out.println("Presiona Enter para continuar...");

        scanner.nextLine(); // Espera a que el usuario presione Enter para continuar

        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Número impar: " + i);

            if (i < 50) {
                System.out.println("Presiona Enter para ver el siguiente número...");
                scanner.nextLine(); // Espera a que el usuario presione Enter para ver el siguiente número
            }
        }

        System.out.println("¡Hemos llegado al número !");
    }
 }
