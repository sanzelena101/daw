/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Elena Sanz
 */
public abstract class Personaje {
     //Propiedades
    private int ataque;
    private int defensa;
    private int vida;
    private String nombre;

    /**
     * Constructor para darle un estado inicial a los atributos
     * @param ataque puntos de ataque del personaje
     * @param defensa puntos de defensa del personaje
     * @param vida puntos de vida del personaje
     * @param nombre nombre del personaje
     */
    public Personaje(int ataque, int defensa, int vida, String nombre){
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.nombre = nombre;
    }

    /**
     * Método abstracto que deberán implementar las clases que heredan de la clase Personaje
     * 
     */
    public abstract int defender();
    /**
     * Método abstracto que deberán implementar las clases que heredan de la clase Personaje
     * 
     */
    public abstract int atacar();

    /**
     * Método para modificar el nombre del personaje
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Devuelve la cantidad máxima de ataque del personaje
     * @return puntos de ataque máximos
     */
    public int getAtaque(){
        return ataque;
    }

    /**
     * Método para setear la vida del personaje
     * @param vida puntos de vida
     */
    public void setVida(int vida){
        this.vida = vida;
    }

    /**
     * Método que devuelve la cantidad de vida del personaje
     * @return puntos de vida del personaje
     */
    public int getVida(){
        return vida;
    }

    /**
     * Devuelve el nombre del personaje
     * @return nombre del personaje
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Devuelve los puntos de defensa del enemigo
     * @return puntos de defensa máximo
     */
    public int getDefensa(){
        return defensa;
    }

    /**
     * Método que muestra información de los personajes
     */
    public void informacionPersonaje(){
        System.out.println("Nombre: " + nombre + "\nAtaque: " + ataque + "\nVida: " + vida + "\nDefensa: " + defensa);
    }
}

