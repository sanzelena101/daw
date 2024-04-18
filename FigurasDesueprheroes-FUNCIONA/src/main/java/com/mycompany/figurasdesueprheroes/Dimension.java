/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasdesueprheroes;

/**
 *
 * @author fatimazouhraelhassna
 */
public class Dimension {
  private  double Alto; 
  private  double Ancho; 
  private  double Profundidad; 
  
  //constructor 

    public Dimension() {
     Alto=0;  
     Ancho=0;
     Profundidad=0;
    }
    public Dimension(double _Alto,double _Ancho,double _Profundidad){
        this.Alto=_Alto;
        this.Ancho=_Ancho;
        this.Profundidad=_Profundidad;
    }
  // metodos 

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(double Profundidad) {
        this.Profundidad = Profundidad;
    }
    
    public double getVolumen(){
     return  (Alto * Ancho * Profundidad);   
    }
    public String toString(){
        return "El alto es "+ Alto+ ". /n El Ancho es "+ Ancho+ ". "
              + "/n La profundidad es: "+ Profundidad + "/n El volumen es: "+ getVolumen();
    }
    
}
