/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Elena Sanz
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        
       ArrayList<Cuenta>arrayCuentas= new ArrayList<>();
       
        CuentaCorriente cC= new CuentaCorriente("55454", 52.300) {};
        CuentaJoven cJ= new CuentaJoven("6654", 300) {};
        CuentaSuperCorriente cSC= new CuentaSuperCorriente("5223", 100) {};
        CuentaSuperJoven cSJ= new CuentaSuperJoven("54", 10.000) {};
        
        arrayCuentas.add(cC);
        arrayCuentas.add(cJ);
        arrayCuentas.add(cSC);
        arrayCuentas.add(cSJ);
        
     
     
        
        
    }
}


