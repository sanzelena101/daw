/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Random;
/**
 *
 * @author Elena Sanz
 */
public class Mago extends Personaje{
    
    /**
     * Constructor para crear instancias de la clase Mago
     * @param ataque puntos de ataque del personaje
     * @param defensa puntos de defensa del personaje
     * @param vida puntos de vida del personaje
     * @param nombre nombre del personaje
     */
    public Mago(int ataque, int defensa, int vida,String nombre){
        super(ataque, defensa,vida,nombre);
    }

    /**
     * Método para que el Mago pueda curarse, tiene una probabilidad del 15% 
     */
    private void elevarVida(){
        int numAleatorio = (int) Math.floor(Math.random() * 5 + 1);
        int vidaPersonaje = getVida();
        if(numAleatorio == 2 && vidaPersonaje != 100){
            setVida(vidaPersonaje + 10);
            if(getVida() > 100){
                setVida(100);
            }
            System.out.println(getNombre() + " ha recuperado +10 ptos de vida!!!");
        }
    }

    /**
     * Método que realiza un ataque aleatorio comprendido entre 1 y el máximo ataque del personaje
     */
    public int atacar(){
        elevarVida();
         Random azar = new Random();
         int numeroAleatorio = azar.nextInt(5) + 1;
        //Ataque mínimo: 1, Máximo: según nivel de ataque
        int puntosAtaque = azar.nextInt(getAtaque()) + 1;
        if(numeroAleatorio == 2 && (puntosAtaque > getAtaque()/2)){
            System.out.println(getNombre() + " ha realizado un crítico de " + puntosAtaque*2 + "!!!");
            return puntosAtaque * 2;
        }
        return puntosAtaque;
    }

    /**
     * Método que laza un número aleatorio entre 1 y el máximo numero de defensa que tenga el personaje
     */
    public int defender(){
        elevarVida();
        Random azar = new Random();
        //Defensa mínima:1, Máxima: según nivel de defensa
        int puntosDefensa = azar.nextInt(getDefensa()) + 1;
        return puntosDefensa;
    }
    /**
     * Método que sobrescribe el método informacionPersonaje que hereda de la clase padre */    
    @Override
    public void informacionPersonaje(){
        super.informacionPersonaje();
        System.out.println("Clase: Mago \n");
    }
}
