/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Elena Sanz
 */
public class CuentaSuperCorriente extends CuentaCorriente {

    public CuentaSuperCorriente(String numCuenta, double saldo) {
        super(numCuenta, saldo);
    }

    @Override
    public void pagarInteres() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    
}
