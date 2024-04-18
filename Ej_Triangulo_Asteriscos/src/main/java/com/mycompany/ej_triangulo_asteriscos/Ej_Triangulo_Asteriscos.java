/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej_triangulo_asteriscos;

/**
 *
 * @author Nocturno
 */
public class Ej_Triangulo_Asteriscos {

    public static void main(String[] args) {     
        Triangulo t1 = new Triangulo(5);
        t1.mostrarDatos();
        t1.visualizar();
        t1.establecerRotación(Triangulo.CERO);
       
        Triangulo t2 = new Triangulo(7);
        t2.rotar();
        t2.mostrarDatos();
        t2.visualizar();
        
        Triangulo t3 = new Triangulo(5);
        t3.establecerRotación(Triangulo.CIENTO_OCHENTA);
        
    
        
        
        
    }

    
}
