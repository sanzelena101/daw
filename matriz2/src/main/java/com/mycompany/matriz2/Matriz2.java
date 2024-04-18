/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz2;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Matriz2 {
    public static void rellenarmatriz(Scanner input, int [][]matriz){
         
        for (int i=0; i<matriz.length; i++ ){
            for(int j=0; j<matriz[0].length; j++){
              System.out.println("Escribe la posicion que quieras " + i + j);
              matriz[i][j]=input.nextInt();
            
            }  
        } 
    }
    
    public static int sumafila(int [][]matriz int fila){
    
    matriz[][]= new int[][]; 
    int suma=0;
         for(int j=0; j< matriz.length ; j++) {  
             suma+= matriz [fila] [j];
    }
        return suma;
}
       
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("¡bienvenido! ¿que quieres hacer?");
        int guardar= input.nextInt();
    }
        
        switch(guardar){
        
                case 1:
                    int i; 
                    int j;
                    int matriz[][]= new int[4][4];
                    //matriz [][] = rellenarmatriz ();
                    matriz [i][j]= rellenarmatriz(input,matriz);

                   //Suma de una fila que se pedirá al usuario (controlar que elija una correcta)  
                case 2:
                
                     System.out.println("dime la fila que quieras sumar");
                     int suma;
                     
                     
       }
  }
}
