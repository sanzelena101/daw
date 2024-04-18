/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supehores;

/**
 *
 * @author Nocturno
 */
public class Dimension {
    //clase dimension
    //atributos
    private double alto;
    private double ancho;
    private double profundidad;
    
    //metodos

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

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
         
            
    //constructores
    public Dimension (){
        alto=0;
        ancho= 0;
        profundidad =0;
    }
    
    public Dimension ( double _alto,double _ancho,double _profundidad){
        alto=_alto;
        ancho=_ancho;
        profundidad= _profundidad;
    }
      
    
    //seguimos con el ejercicio
    //metodos de calculo 
    public double getVolumen(){
     return alto*ancho*profundidad;
    }
    
    @Override
    public String toString(){
         return "el alto es" +alto+ "el ancho es" +ancho + "la profundidad es" +profundidad+ "y el volumen mavimo es" +getVolumen();
    }
 
}
