/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumeraciones;

/**
 *
 * @author Elena Sanz
 */

enum diasemana{
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO
}


public class Enumeraciones {

    public static void main(String[] args) {
       diasemana diaActual= diasemana.LUNES;
       System.out.println(diaActual.name());
        System.out.println(diaActual.ordinal());
       
       for (diasemana dia: diasemana.values()){
           System.out.println(dia.name());
       }
       switch(diaActual){
           case LUNES: 
               System.out.println("el lunes, animo");
           case MARTES: 
               System.out.println("el martes, animo");
          case MIERCOLES: 
               System.out.println("miercoles, mitad de la semana");
          case JUEVES: 
               System.out.println("jueves, no queda nada");
          case VIERNES: 
              System.out.println("viernes, empieza el finde semana");
          case SABADO: 
               System.out.println("sabado, disfruta");
          default:
               System.out.println("dia no valido");
       }
    }
}
