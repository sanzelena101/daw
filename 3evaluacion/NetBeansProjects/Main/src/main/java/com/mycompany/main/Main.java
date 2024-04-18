/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Elena Sanz
 */
public class Main {

    public static void main(String[] args) {
               
        Scanner teclado = new Scanner(System.in);
        Personaje luz[] = new Personaje[4];
        Personaje oscuridad[] = new Personaje[4];
        Funcionalidad.rellenarArray(luz, oscuridad);
        String respuesta = "";
        boolean miEquipoVivo;

        do{
            do{    
                System.out.print("---¡BIENVENIDO AL JUEGO DEL SEÑOR DE LOS ANILLOS!----"
                + "\nElija un bando Luz (1) u Oscuridad (2): ");
                respuesta = teclado.nextLine();
                if(respuesta.equals("1")){
                    miEquipoVivo = Funcionalidad.juego(luz,oscuridad);
                    if(miEquipoVivo){
                        System.out.println("¡VENCIMOS A LA OSCURIDAD!");
                    }else{
                        System.out.println("Perdimos :( La Oscuridad nos consumió...");
                    }
                }else if(respuesta.equals("2")){
                    miEquipoVivo = Funcionalidad.juego(oscuridad,luz);
                    if(miEquipoVivo){
                        System.out.println("¡VENCIMOS A LA LUZ!");
                    }else{
                        System.out.println("Perdimos :( La Luz nos venció...");
                    }
                }else{
                    System.out.println("Opción no válida");
                }
            }while(!respuesta.equals("1") && !respuesta.equals("2"));

            System.out.print("¿Desea jugar otra partida? Pulse s para jugar de nuevo: ");
            respuesta = teclado.nextLine();
            Funcionalidad.rellenarArray(luz, oscuridad); //Reseteo
        }while(respuesta.equalsIgnoreCase("s"));
        System.out.println("---GRACIAS POR DISFRUTAR DEL JUEGO");

        teclado.close();
    }
}
