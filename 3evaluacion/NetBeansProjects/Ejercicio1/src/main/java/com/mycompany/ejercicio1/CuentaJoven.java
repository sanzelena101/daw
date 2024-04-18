/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Elena Sanz
 */
public final  class CuentaJoven extends Cuenta {

    public CuentaJoven(String numCuenta, double saldo) {
        super(numCuenta, saldo);
    }

    //METODO
    @Override
    public void pagarInteres() {
        this.setNumCuenta(this.getSaldo()*1,05);
}

