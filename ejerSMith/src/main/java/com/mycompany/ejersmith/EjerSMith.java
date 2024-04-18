/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejersmith;
import java.util.Scanner;


/**
 *
 * @author elena
 */
public class EjerSMith {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        Scanner scanner = new Scanner(System.in);
        
        String nombre= "usuario: - "; 
        System.out.println("Smith: - Bienvenido. ¿Como te llamas?");
        nombre=input.next();
        System.out.println ("Usuario: - " + nombre);
        System.out.println ("Smith: - Buenos días, " + nombre);
        System.out.println (nombre + " ¿Que tal dia a tenido?");
        String respuesta = scanner.nextLine();
          
        
          if (respuesta.equalsIgnoreCase("bueno")) {
            System.out.println("Smith: Me alegro mucho.");
        } else if (respuesta.equalsIgnoreCase("malo")) {
            System.out.println("Smith: Vaya, lo siento.");
        } else {
            System.out.println("Smith: Lo siento, no lo entiendo.");
        }
          
         System.out.println ("""
                             Smith: - Bueno \u00bfqu\u00e9 tarea desea hacer ahora? (a, b o c)
                               a)Agenda
                               b)Ver gastos
                               c)El tiempo""");
         char letra = scanner.next().charAt(0);
         
         //opciones
          switch (letra) {
            case 'a': //agenda
               System.out.println (nombre + ":- a");
               System.out.println ( "               AGENDA");
               System.out.println ("-------------------------------------------");
               System.out.println ("IVAN:       666  66  66  66");
               System.out.println ("ELENA:      666  66  66  66");
               System.out.println ("ALAN:       666  66  66  66");  
               System.out.println ("GEORGI:     666  66  66  66");
                
                break;
                
            case 'b': //gastos
                suma = gasto1 + gasto2 + gasto3;
                sinIva = suma * 0.21;
                resta= suma - sinIva;
                
                 System.out.println (nombre + ":- b");
                 System.out.println ("                 GASTOS");
                 System.out.println ("-------------------------------------------");
                 System.out.println ("1 - Patatas");
                 System.out.println ("2 - Tomates");
                 System.out.println ("3 - Zanahorias");
                 System.out.println ("                     ----------------------");
                 System.out.println ("SUMA");
                 System.out.println ("Desglose");
                 System.out.println ("de IVA:   ");
                 System.out.println ("                     ----------------------");
                 System.out.println ("TOTAL: ");
              
                
                break;
                
            case 'c': //tiempo
                System.out.println ("Smith: - ¿El tiempo lo quieres para Segovia o para Cadiz?");
                String ciudad = scanner.nextLine();
                   if (ciudad.equalsIgnoreCase("Segovia")) {
                            System.out.println("Smith: En Segovia hace una temperatura de 8.0ºC y hay un 22% de precipitaciones");
                    } else if (ciudad.equalsIgnoreCase("Cadiz")) {
                            System.out.println("Smith: En Cádiz hace 18º y 2% de probabilidad de precipitación.");
                    } else 
                    {
                            System.out.println("Smith: no tiene datos sobre esa ciudad");
                      }
                break;
        }
          
           // despedida
           System.out.println ("Smith: - Gracias por utilizar mis servicios, " + nombre + ". Que tenga un buen día.");
    }
}



//////////////////////////
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smith;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Smith {

    public static void main(String[] args) {
       
        Scanner input= new Scanner (System.in);
        Scanner scanner = new Scanner(System.in);
        
        String nombre= "usuario: - "; 
        System.out.println("Smith: - Bienvenido. Â¿Como te llamas?");
        nombre=input.next();
        System.out.println ("Usuario: - " + nombre);
        System.out.println ("Smith: - Buenos dÃ­as, " + nombre);
        System.out.println (nombre + " Â¿Que tal dia a tenido?");
        String respuesta = scanner.nextLine();
          
        
          if (respuesta.equalsIgnoreCase("bueno")) {
            System.out.println("Smith: Me alegro mucho.");
        } else if (respuesta.equalsIgnoreCase("malo")) {
            System.out.println("Smith: Vaya, lo siento.");
        } else {
            System.out.println("Smith: Lo siento, no lo entiendo.");
        }
          
         System.out.println ("""
                             Smith: - Bueno \u00bfqu\u00e9 tarea desea hacer ahora? (a, b o c)
                               a)Agenda
                               b)Ver gastos
                               c)El tiempo""");
         char letra = scanner.next().charAt(0);
         
         //opciones
          switch (letra) {
            case 'a': //agenda
               System.out.println (nombre + ":- a");
               System.out.println ( "               AGENDA");
               System.out.println ("-------------------------------------------");
               System.out.println ("IVAN:       666  66  66  66");
               System.out.println ("ELENA:      666  66  66  66");
               System.out.println ("ALAN:       666  66  66  66");  
               System.out.println ("GEORGI:     666  66  66  66");
                
                break;
                
            case 'b': //gastos
                //suma = gasto1 + gasto2 + gasto3;
                //sinIva = suma * 0.21;
                //resta= suma - sinIva;
                
                final double PAT=2.5;
                final double TOM=1.60;
                final double ZAN=1.60;
                double total = PAT + TOM + ZAN;
                double suma = (PAT + TOM + ZAN)*0.21;
                 double iva = suma-total;
                
                
                
                 System.out.println (nombre + ":- b");
                 System.out.println ("       GASTOS");
                 System.out.println ("--------------------------");
                 System.out.println ("1 - Patatas           2,5â‚¬");
                 System.out.println ("2 - Tomates           1,60â‚¬");
                 System.out.println ("3 - Zanahorias        1,60â‚¬");
                 System.out.println ("     ----------------------");
                 System.out.println ("SUMA "                   +suma);         
                 System.out.println ("Desglose");
                 System.out.println ("de IVA:" +                iva);
                 System.out.println ("       ----------------------");
                 System.out.println ("TOTAL:"                   +total);
              
                
                break;
                
            case 'c': //tiempo
              
                System.out.println ("Smith: - Â¿El tiempo lo quieres para Segovia o para Cadiz? ");
                String ciudad = scanner.readLine();
                   if (ciudad.equalsIgnoreCase("Segovia")) {
                            System.out.println("Smith: En Segovia hace una temperatura de 8.0ÂºC y hay un 22% de precipitaciones");
                    } else if (ciudad.equalsIgnoreCase("Cadiz")) {
                            System.out.println("Smith: En CÃ¡diz hace 18Âº y 2% de probabilidad de precipitaciÃ³n.");
                    } else 
                    {
                            System.out.println("Smith: no tiene datos sobre esa ciudad");
                      }
                break;
        }
          /*
          case 'c':
                System.out.println(asistente + ": - Â¿El tiempo lo quires para Segovia o para CÃ¡diz?");
                System.out.print(usuario + ": - ");
                String ciudad = entrada.readLine();
                if (ciudad.equalsIgnoreCase("Segovia")) {
                    double temperatura = 8;
                    int lluvia = 22;
                    System.out.println(asistente + ": - En " + ciudad + " hace una temperatura de " + temperatura + "ÂºC y hay un " + lluvia + "% de precipitaciones");
                } else if (ciudad.equalsIgnoreCase("CÃ¡diz") || ciudad.equalsIgnoreCase("Cadiz")) {
                    double temperatura = 18;
                    int lluvia = 2;
                    System.out.println(asistente + ": - En " + ciudad + " hace una temperatura de " + temperatura + "ÂºC y hay un " + lluvia + "% de precipitaciones");
                } else {
                    System.out.println(asistente + ": - Lo siento, no tengo datos de temperatura sobre esa ciudad.");
                }
            break;
          
          
          */
          
          
          
          
           // despedida
           System.out.println ("Smith: - Gracias por utilizar mis servicios, " + nombre + ". Que tenga un buen dÃ­a.");
    }
}


    
