/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Elena Sanz
 */
public abstract class Cuenta {

    /* 2-¿SON NECESARIOS LOS GET Y SET?
    Si, son necesarios en una clase.

    5- QUE OCURRE SI NO LO IMPLENTAS?
    Da error, porque tiene que estar.
    
    6- ¿PUEDES MODIFICAR EL SALDO CON LA INFORMACIO...
     No, porque es privado. Lo tendría que hacer publico
    
    9- ¿QUE OCURRE...
    No dejaria, ya que anteriormete a CuentaJoven le habiamos dicho que no podia tener clases derivadas
        
     */
    private String numCuenta;
    public double saldo;

    //CONSTRUCTORES
    public Cuenta() {
        System.out.println("constructor por defecto");
    }

    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODO
    public abstract void pagarInteres();
            

}
