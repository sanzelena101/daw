/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubo.caja;

/**
 *
 * @author Nocturno
 */
public class Caja {
    
    //atributos
    private double largo;
    private double alto;
    private double ancho;
    
    
    
    //constructores

    public Caja(double _largo, double _alto, double _ancho) {
        this.largo = _largo;
        this.alto = _alto;
        this.ancho = _ancho;
    }
    
    
    
    
    //metodos
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
     
    public double volumen (){

         return (alto*ancho*largo);
    }
    
    public String toString (){
              return "la caja tiene las dimensiones: " + alto + "de alto" + ancho + "de ancho" + " y de largo"+ largo ;
    }
   
}
