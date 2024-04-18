/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Elena Sanz
 */
public class EjerDate {

    public static void main(String[] args) {
        
        //porbra los milisgeundos
        Date date = new Date();
        System.out.println("la fecha es: "+date);
        
        long ms =System.currentTimeMillis();
        Date date1 = new Date(ms);
        System.out.println("Los milisegundos son: " + date1);
        
        
        //meter una fecha que no existe
        Date fecha = new Date (2025, 2 ,2);
        System.out.println("La fecha es: " + fecha);
        
        //meter fecha que no existe
        YearMonth fecha2= YearMonth.of(2025, 2);
        System.out.println("La fecha es: " + fecha2);
        
        
        //calcula cuantos dias han pasado entre dos fechas
          
                /* Date date1 = new Date();
                System.out.println("date1 : " + date1);

                Date date2 = new Date();
                System.out.println("date2 : " + date2);

                int resultado = (int)(date1 - date2);
                System.out.println(resultado);*/
        
          LocalDate fechas = LocalDate.of(2001, 5, 11);
          System.out.println(fechas.until(LocalDate.of(2024,2,10),ChronoUnit.DAYS));
   
    // ver que dia de la semana era el 20/12/1990
    // cuantos segundo han pasado deste las 10:15 hasta las 12:30
        LocalTime fechainicio= LocalTime.of(10, 15);
        LocalTime fechafin= LocalTime.of(15, 15);

        System.out.println(fechainicio.until(fechafin, ChronoUnit.SECONDS));
    
    //cuantos segundos de vida  LO TENGO MAL
        LocalTime fechanacer= LocalTime.of(0,2 );
        LocalTime fechaahora= LocalTime.of(15, 15);

        System.out.println(fechaahora.until(fechanacer, ChronoUnit.SECONDS));
        
       
        //a la fecha de hoy le restas 40dias
        LocalDate fechaHoy =LocalDate.now();
        LocalDate fechacuarentadias = fechaHoy.minusDays(40);
        System.out.println(fechacuarentadias.getDayOfWeek());
        
        //traducir palabras friday a viernes
        
        
        
    }
}
