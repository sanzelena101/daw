/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;


import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          
        System.out.println("¡BIENVENIDOS!,  QUE OPCION QUIERES: ");
        System.out.println("1 - CREAR PARTIDO DESDE CONSOLA");
        System.out.println("2 - MOSTRAR LSITA DE PARTIDOS");
        System.out.println("3 - SIMULAR PARTIDO");
        System.out.println("4 - SALIR");
    

    
       Partido[] arraypartido = new Partido[4];
       
        int option = sc.nextInt();
       
       switch(option){
           
           case 1: 
               
               System.out.println("Seleccionaste la opcion 1, dime el equipo local");
                    String 
               System.out.println("Dime el equipo visitante");
                     
               System.out.println("Dime Cual es la probabilidad de la victoria de un equipoLocal");
                  
               System.out.println("Dime Cual es la probabilidad de la victoria de un equipoVisitante");

               System.out.println("Dime Cual es la probabilidad de que el equipo local marque un gol");

               System.out.println("Dime Cual es la probabilidad de que el equipo visitante marque un gol");
    
            
           case 2:
               //mostrar la lista del partido
               
           case 3:
               //simular partido
               
               
           case 4:
               System.out.println("Has salido del porgrama");
               break;
       }
       
        
    
    }

}
