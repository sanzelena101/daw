/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetocoche;

/**
 *
 * @author Nocturno
 */
public class Coche {
    //atributos 
    private String matricula;
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int velocidadActual;
    private boolean motorGripado= false;
    
    //constructor
    public Coche (String _marca, String _modelo, int _velocidadActual){
    this.marca = _marca;
    modelo = _modelo;
    velocidadActual = _velocidadActual;
    }
    
    //metodos

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    //metodos propios
    public void acelerar (int velocidad){
        this.velocidadActual += velocidadActual;
    }
    public void frenar (int velocidad){
        this.velocidadActual -= velocidad;
    }
    
    public void motor (){
        this.motorGripado = true;
    }

    public boolean isMotorGripado() {
        return motorGripado;
    }

    public void setMotorGripado(boolean motorGripado) {
        this.motorGripado = motorGripado;
    }
    
    
}


