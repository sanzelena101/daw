/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasdesueprheroes;
import java.util.ArrayList;

/**
 *
 * @author fatimazouhraelhassna
 */
public class Coleccion {
    // atributos 
    private String nombreColeccion; 
    private ArrayList<Figura> listaFiguras;
    
    // constructor 
    public Coleccion(String nombreColeccion){
        this.nombreColeccion= nombreColeccion;
         this.listaFiguras =new ArrayList();
    }
    
    // metodos 
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
   
  //metodos propios 
    //MIRARLO ME HA COSTADO
    public void añadirFigura(Figura fig){
        boolean figuraExistente = false;

        for (Figura f : listaFiguras) {
            if (f.getCodigo().equals(fig.getCodigo())) {
                System.out.println("La figura que intentas añadir ya está en la colección");
                figuraExistente = true;
                break; 
            }
        }
        if (!figuraExistente) {
            listaFiguras.add(fig);
        }
    }
    public void subirPrecio(double cantidad, String codigo){
        
      for(Figura f:listaFiguras){// for each 
          if(f.getCodigo().equals(codigo)){
           f.subirPrecio(cantidad);
           }
        }   
    }
    
    public String toString(){
        String texto="";
            for(Figura fig: listaFiguras){
            texto+=fig.toString()+"/n";
            }
        return texto; 
    }
     public String conCapa(){
         String texto="";
         for(Figura fig: listaFiguras){
             if(fig.getSuperheroe().isCapa()){
                 texto=fig.toString()+"\n"; 
             }  
         }
         return texto;
     }
         
    public Figura masValioso(){
        double precioMayor = 0.0;
        Figura fmayor= null; 
          for(Figura fig: listaFiguras){
              if(fig.getPrecio()>precioMayor){
                  precioMayor=fig.getPrecio();
                    fmayor=fig;
              }
          } 
         return  fmayor;    
       }
       
       public double getValorColeccion(){
           double preciototal=0.0;
            for(Figura fig: listaFiguras){
              preciototal+= fig.getPrecio();
          } 
        return preciototal;  
       }
       
      public double getVolumenColeccion(){
          double volumenTotal=200;
           for(Figura fig: listaFiguras){
              volumenTotal += fig.getDimensiones().getVolumen(); 
           }
          return volumenTotal; 
      }    
}
