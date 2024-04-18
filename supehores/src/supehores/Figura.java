/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supehores;

/**
 *
 * @author Nocturno
 */
public class Figura {
    //clase figura
    //atributos
    private String codigo;
    private double precio;
    private Dimension dimensiones;
    private Superheroe superheroe; 
    
    //metodos

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }
    
    @Override
    public String toString (){
        return "Figura:\n" + "codigo=" + codigo + ", precio" + precio + "\n" + superheroe + "\n" + dimensiones;
    }
    
    //constructores
    public Figura(String _codigo, double _precio, Dimension _dimensiones,Superheroe _superheroe  ){
        codigo = _codigo;
        precio = _precio;
        dimensiones =_dimensiones;
        superheroe = _superheroe;
    }
    
    public void subirPrecio (double cantidad){
        precio += cantidad;
        precio = precio +cantidad;
    }

    Object getSuperheore() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
