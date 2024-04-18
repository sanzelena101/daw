/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poductomain;

/**
 *
 * @author Nocturno
 */
public class ProductoC extends Porducto {
    private  int tempC; 
    public ProductoC(String FechaCad, int numlote, int tempC){
        super(FechaCad,numlote);
        this.tempC=tempC;   
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }
    
    //• Todos los productos congelados cuya temperatura de congelación sea menos a -18º
    public boolean menorTemperatura(){
     
      final int num=-18; 
      boolean temperatura= false; 
        
      if(tempC<num){
           System.out.println(getTempC());
           temperatura=true;
        }
        return temperatura; 
    }
   
    @Override
    public String toString(){
        
        return super.toString()+" La temperatura: "+tempC;
        
    }
    
}
