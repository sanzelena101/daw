/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_electrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Electrodomestico {
    
 private String marca;
 private String tipo;
 private double potencia;
    
      public Electrodomestico (String _marca, String _tipo, double _potencia ){
           marca = _marca;
           tipo= _tipo;
           potencia = _potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

        @Override
    public String toString (){
        return super.toString()+ marca + tipo + potencia;
        
    }
    
    //metodos
        public int getConsumo (int horas){
            return horas*(int)potencia;
        }
        
         public double getCosteConsumo(int horas, double costeHora){  
           return (double)horas* costeHora *potencia;
        }
        
        
        
    }
    
   
    
