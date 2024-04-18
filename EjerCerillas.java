/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercerillas;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nocturno
 */
public class EjerCerillas {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Juego de las 13 cerillas");
        //System.out.println("|||||||||||||");
        int cerilla = 14;
        for (int i=1; i<cerilla; i++){
            System.out.print("| ");
            }
         System.out.println(" ");
         System.out.println("Comienzas tú, dime el numero de cerillas que quieras quitar "); 
        int numero=leer.nextInt();
         cerilla = cerilla-numero;
          for (int i=1; i<cerilla; i++){
            System.out.print("| ");
            }
           System.out.println(" ");
         System.out.println("Ahora es turno de la maquina");
         Random random= new Random();
        int numaleatorio=random.nextInt(cerilla);
         for (int i=1; i<numaleatorio; i++){
            System.out.print("| ");
         }
          System.out.println("Es, dime el numero de cerillas que quieras quitar "); 
        int numero=leer.nextInt();
         cerilla = cerilla-numaleatorio;
         
    }
}
