/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.date;

import java.util.Date;

/**
 *
 * @author Elena Sanz
 */
public class Dateprueba {

    public static void main(String[] args) {
      long ms =System.currentTimeMillis();
        Date date = new Date(ms);
        System.out.println(date);
    }
   
}
