/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_electrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Lavadora extends Electrodomestico{
    
    //atributos
    private int precio;
    private boolean aguaCaliente;

    //cobstructores
    public Lavadora(String _marca, String _tipo, double _potencia) {
        super(_marca, "Lavadora", _potencia);

        aguaCaliente = false;
    }

    public Lavadora(String _marca, double _potencia, int _precio, boolean aguaCaliente) {
        super(_marca, "Lavadora", _potencia);

        precio = _precio;
        aguaCaliente = true;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return super.toString() + precio + aguaCaliente;
    }

    //metodos
    

    @Override
    public double getConsumo(int horas) {

        if (aguaCaliente = false){
            return horas * (int) super.getPotencia();
        } 
        else {    
          double consumo =  horas * (super.getPotencia() + super.getPotencia() * 0.20);
          return consumo;
    }
    }
     
       public double getCosteCosumo(int horas, double costeHora) {
           return getConsumo (horas)  * costeHora;
    }
    
       public void electrodomesticos(){
         System.out.println("lavando lavando"); 
     } 
       
       
}
