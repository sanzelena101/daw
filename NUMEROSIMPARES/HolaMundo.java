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
        
        System.out.println("A continuaci�n se mostrar�n los primeros 50 n�meros impares:");
        System.out.println("Presiona Enter para continuar...");

        scanner.nextLine(); // Espera a que el usuario presione Enter para continuar

        for (int i = 1; i <= 50; i += 2) {
            System.out.println("N�mero impar: " + i);

            if (i < 50) {
                System.out.println("Presiona Enter para ver el siguiente n�mero...");
                scanner.nextLine(); // Espera a que el usuario presione Enter para ver el siguiente n�mero
            }
        }

        System.out.println("�Hemos llegado al n�mero !");
    }
 }
