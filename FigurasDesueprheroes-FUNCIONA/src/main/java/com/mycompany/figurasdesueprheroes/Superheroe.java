/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasdesueprheroes;

/**
 *
 * @author fatimazouhraelhassna
 */
public class Superheroe {
    private String nombre; 
    private String descripcion;
    private boolean capa; 
 // contructor   

    public Superheroe(String _nombre) {
        this.nombre = _nombre;
        this.descripcion =" ";
        this.capa = false;
    }
    
    
    // metodos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    @Override
   public String toString(){
       String resp=" ";
       if (capa){
              resp = "si" ;
            }
            else{ 
            resp= "no";
       }    
        return "El nombre de el Súper Héroe es "+ nombre + "." + " \n Su descripcion es: " + descripcion + "\n Y " + resp+ " lleva capa" ;
       }
    
 
    
}
