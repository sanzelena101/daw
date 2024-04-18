/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenentornos;

/**
 *
 * @author Elena Sanz
 */
public class Matematica {
    private int a ;
    private int b;
    
    public Matematica(){}

    public Matematica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int suma(){
           return a + b;
    }
    
    public int multiplicar(){
           return a * b;
    }
    
    public int dividir(){
           return a/ b;
    }
    
    public int resta(){
        if(a<b){
            return 0;
        }
        return a-b;
    }
    
    
}
