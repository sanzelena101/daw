/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Elena Sanz
 */
public abstract class Personajes {
    
    private int NivelAtaque;
    private int NivelDefensa;
    private int NivelVida;
    private String nombre;

    public Personajes(int NivelAtaque, int NivelDefensa, int NivelVida, String nombre) {
        this.NivelAtaque = NivelAtaque;
        this.NivelDefensa = NivelDefensa;
        this.NivelVida = NivelVida;
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return NivelAtaque;
    }

    public void setNivelAtaque(int NivelAtaque) {
        this.NivelAtaque = NivelAtaque;
    }

    public int getNivelDefensa() {
        return NivelDefensa;
    }

    public void setNivelDefensa(int NivelDefensa) {
        this.NivelDefensa = NivelDefensa;
    }

    public int getNivelVida() {
        return NivelVida;
    }

    public void setNivelVida(int NivelVida) {
        this.NivelVida = NivelVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
    
    
 
    
}
