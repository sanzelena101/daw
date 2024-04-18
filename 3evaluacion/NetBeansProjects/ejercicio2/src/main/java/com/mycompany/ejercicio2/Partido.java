/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author Elena Sanz
 */
public class Partido {

    private String equipoLocal;
    private String equipoVisitante;
    private double probabilidadVictoriaLocal;
    private double probabilidadVictoriaVisitante;
    private double probabilidadGolLocal;
    private double probabilidadGolVisitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean partidoJugado;

    public Partido(String equipoLocal, String equipoVisitante, double probabilidadVictoriaLocal, double probabilidadVictoriaVisitante, double probabilidadGolLocal, double probabilidadGolVisitante, int golesLocal, int golesVisitante, boolean partidoJugado) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
        this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
        this.probabilidadGolLocal = 0;
        this.probabilidadGolVisitante = 0;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.partidoJugado = false;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public double getProbabilidadVictoriaLocal() {
        return probabilidadVictoriaLocal;
    }

    public void setProbabilidadVictoriaLocal(double probabilidadVictoriaLocal) {
        this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
    }

    public double getProbabilidadVictoriaVisitante() {
        return probabilidadVictoriaVisitante;
    }

    public void setProbabilidadVictoriaVisitante(double probabilidadVictoriaVisitante) {
        this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
    }

    public double getProbabilidadGolLocal() {
        return probabilidadGolLocal;
    }

    public void setProbabilidadGolLocal(double probabilidadGolLocal) {
        this.probabilidadGolLocal = probabilidadGolLocal;
    }

    public double getProbabilidadGolVisitante() {
        return probabilidadGolVisitante;
    }

    public void setProbabilidadGolVisitante(double probabilidadGolVisitante) {
        this.probabilidadGolVisitante = probabilidadGolVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean isPartidoJugado() {
        return partidoJugado;
    }

    public void setPartidoJugado(boolean partidoJugado) {
        this.partidoJugado = partidoJugado;
    }
        
}
    
  
    
