/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poductomain;

/**
 *
 * @author Nocturno
 */
public class ProductoR extends Porducto {
    private String codSup; 
    public ProductoR(String FechaCad, int numlote,String codSup){
        super(FechaCad,numlote); 
        this.codSup=codSup; 
    }

    public String getCodSup() {
        return codSup;
    }

    public void setCodSup(String codSup) {
        this.codSup = codSup;
    }

           
    public String toString(){
         return super.toString()+" \nEl codigo de supervision "+ codSup;
        
    }
    
}
