/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetocoche;
import java.util.Scanner;
/**
 *
 * @author Nocturno
 */
public class Objetocoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa que acelere de 0 a 100
        Coche miCoche = new Coche ("seat", "ibiza", 10);
        System.out.println("a la velocidad que va mi coche es: " +miCoche.getVelocidadActual() + " km/h");
        
        for (int i=0; i<10; i++){
            miCoche.acelerar (10);
            System.out.println("el coche de georgi tiene una velocidad de " +miCoche.getVelocidadActual() +" km/h");
        }
        System.out.println("\n estoy llendo muy rapido por el acueducto, tienes que frenar");
        for (int i=0; i<5; i++){
            miCoche.frenar(10);
            System.out.println("el coche de georgi tiene una velocidad de: " +miCoche.getVelocidadActual()+ " km/h");
        }
        
         for (int i = 0; i < 10; i++) {
            miCoche.acelerar(10);
            System.out.println("El coche de Georgi tiene una velocidad de " + miCoche.getVelocidadActual() + " km/h");
        }

        System.out.println("\nEstoy yendo muy rápido por el acueducto, tienes que frenar");
        for (int i = 0; i < 5; i++) {
            miCoche.frenar(10);
            System.out.println("El coche de Georgi tiene una velocidad de: " + miCoche.getVelocidadActual() + " km/h");
        }

        for (int i = 0; i < 100; i++) {
            if (miCoche.getVelocidadActual() == 100) {
                miCoche.setMotorGripado(true);
                System.out.println("El motor se ha roto.");
                break;  // Para salir 
            }
             
         Scanner scanner = new Scanner(System.in);           
         char opcion;
         
         do {
            System.out.println("¿Quieres subir (s) o bajar (n) la velocidad? (Presiona 'q' para salir)");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 's':
                    miCoche.acelerar(10);
                    break;
                case 'n':
                    miCoche.frenar(10);
                    break;
                case 'q':
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println("El coche de Georgi tiene una velocidad de " + miCoche.getVelocidadActual() + " km/h");

        } while (opcion != 'q');       
                    
        }
    }
    
}
