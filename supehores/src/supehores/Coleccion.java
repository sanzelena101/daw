/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supehores;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class Coleccion {
    //atributos
    private String nombreColeccion;
    private Figura listaFiguras []= new Figura [5];
    private ArrayList <Figura> listaFiguras;
    
    //contructor 
    public Coleccion (String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        this.listaFiguras = new ArrayList <String> ();
    }
    
    
    //metodos

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public Figura[] getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(Figura[] listaFiguras) {
        this.listaFiguras = listaFiguras;
    }
    
    
    // los constructores tienen el mismo nombre que la calse 
    //constructores
   public void añadirFiguras (Figura fig)
            for( figura f:listaFiguras){
                if(f.getcodigo()== fig.getcodigo){
                    System.out.println ("La figura que intentas meter ya esta en merida);
                }
                else{
                    listaFiguras.add(fig);
                }
            }
   
     public void subirPrecio (double cantidad, String id){
         for (Figura f:listaFiguras){ //for each
             if(f.getCodigo().equals (id)) {
                 f.subirPrecio(cantidad);
             }
         }
     }
    
     @Override
     public String toString(){
         String texto=" ";
         for (Figura fig:listaFiguras){
             if(fig.getSuperheroe().isCapa()){
                 texto+= fig.toString()+"\n";
             }
         }
         return texto;
     }
     
     
     public String ConCapa(){
         String texto="";
         for (Figura fig: listaFiguras){
             if(fig.getSuperheroe(.isCapa()){
                 // faltan cosas
         }
     }
      return texto;
}
     
   public Figura masValioso(){
       double precioMayor =0.0;
       Figura fMayor = null;
    
        for(Figura fig:listaFiguras){
            if(fig.getPrecio()>precioMayor){
                precioMayor = fig.getPrecio();
                fMayor = fig;
                }
            }
         return fig;    
   }

   
  public double getValorColeccion() {
        double valorTotal = 0.0;

        for (Figura fig : listaFiguras) {
            fig.getPrecio() += fig.getPrecio();
        }
        fig.getPrecio ()+= preciototal;
        return valorTotal;
    }
   
  
      public double getVolumenColeccion() {
        double volumenTotal = 0.0;

        for (Figura figura : figuras) {
            volumenTotal += figura.calcularVolumen();
        }

        volumenTotal += 200.0;

        return volumenTotal;
    }

    void añadirFigura(Figura figura1) {
        boolean figuraExistente = false;
        
        for(Figura f:lsitaFiguras){
            if (f.getCodigo().equas(figura1.getCodigo())){
                System.out.println("La figura que intentas añadir ya esta en la coleccion");
                figuraExistente = true;
                break;
            }
        }
        if (!figuraExitente ){
            listaFiguras.add(figura1)
        }
    }
	
   
}
