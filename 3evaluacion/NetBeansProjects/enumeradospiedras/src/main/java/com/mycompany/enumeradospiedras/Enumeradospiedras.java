/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumeradospiedras;

/**
 *
 * @author Elena Sanz
 */
public class Enumeradospiedras {

    public static void main(String[] args) {
        int contador=1;
       for (Piedras p: Piedras.values()){
           System.out.println("Tipo de piedras" +contador +": ");
           p.toStrinng()
       }
    }
}
