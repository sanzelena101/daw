/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supehores;

/**
 *
 * @author Nocturno
 */
public class Superheroe {
    
    //atributos 
    
    private String nombre;
    private String descripcion;
    private boolean capa;
    
    
    //metodos
    
    public Superheroe (String _nombre){
        this.nombre= "";
        this.descripcion=" ";
        this.capa= false;
         
    }
    
    //constructores

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
    
    //Metodo to String
    @Override
    public String toString(){
       String respuesta="";
       if (capa)
           respuesta = "si";
           
       else{
            respuesta= "no";
        }
     return "el nombre es" + nombre + descripcion + "y" + respuesta + "lleva capa";   
        
    }
            
    

}
