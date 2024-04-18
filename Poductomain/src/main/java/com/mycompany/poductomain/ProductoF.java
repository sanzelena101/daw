/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poductomain;

/**
 *
 * @author Nocturno
 */
public class ProductoF extends Porducto{
    private String fechaE; 
    private String paisO; 
    
    public ProductoF(String FechaCad, int numlote,String fechaE,String paisO ){
        super(FechaCad,numlote); 
        this.fechaE=fechaE; 
        this.paisO=paisO; 
        
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }
       
    public boolean esEspana(){
        boolean esespaña=false;
        if(paisO == "España"){
            getPaisO();
            esespaña=true;
        }
        return esespaña;
    }
    public String toString(){
         return super.toString()+" La fecha de envasado: "+fechaE+" y el pais de origen: "+paisO;
        
    }
    
}
