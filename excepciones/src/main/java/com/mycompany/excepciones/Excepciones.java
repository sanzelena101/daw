/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Excepciones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetir;
        double n = 0;
        int posicion = 0;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        do {
            repetir = false;

            try {
                //dependemos de lo que el usuario ponga
                System.out.print("\n\nIntroduce la posición del array a modificar: ");
                cadena = sc.nextLine();
                posicion = Integer.parseInt(cadena);

                System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
                n = sc.nextDouble();

                valores[posicion] = n;
            } catch (InputMismatchException e) {
                System.err.print("valor no valido");
                sc.nextLine();
                repetir = true;
            } catch (NumberFormatException e) {
                //que este dentro del array
                //que no haya puesto una letra
                System.err.print("valor no valido");
                repetir = true;
            } catch (Exception e){
                System.err.print("error desconocido" +e.getMessage()+"en la clase" +e.getClass());
                repetir = true;
            }
        } while (repetir);
        System.out.println("\nPosición a modificar " + posicion);
        System.out.println("Nuevo valor: " + n);
        System.out.println("Contenido del array modificado:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);

        }

    }

}
