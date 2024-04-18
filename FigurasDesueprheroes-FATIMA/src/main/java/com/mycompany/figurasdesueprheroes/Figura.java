/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasdesueprheroes;

/**
 *
 * @author fatimazouhraelhassna
 */
public class Figura {
    // aributos 
    private String codigo;
    private double precio; 
    private Dimension dimensiones;
    private Superheroe superheroe;// asociacion  

// constructores 
public Figura(String _codigo,double _precio,Dimension _dimensiones, Superheroe _superheroe){

this.codigo =_codigo;
this.precio =_precio;
this.dimensiones= _dimensiones; 
this.superheroe=_superheroe;

}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }



    public String toString(){
        return "Figura = " + "codigo: "+ codigo + 
                " precio = "+ precio + 
                "\n "+ superheroe + "\n"+ dimensiones; 
    }
    public void subirPrecio(double cantidad ){
        precio += cantidad; 
    }
   
    
}
