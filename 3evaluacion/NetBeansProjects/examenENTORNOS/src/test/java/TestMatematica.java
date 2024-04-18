/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.examenentornos.Matematica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;

/**
 *
 * @author Elena Sanz
 */
public class TestMatematica {
      
    private Matematica matematica;
  
    
    @BeforeEach
        public void SetUp(){
             matematica= new Matematica(2,2);
    }
        
    @Test 
    @Order(1)
    public void suma (){
        assertEquals(4,matematica.suma());
    }
        
    @Test 
    @Order(2)
    public void resta (){
        assertEquals(0,matematica.resta());
    }
  
    @Test 
    @Order(3)
    public void multiplicar(){
        assertNotSame(3,matematica.multiplicar());
    }
    
    @Test 
    @Order(4)
    public void error(){
        fail ("error, pruebe más tarde ");
    }
    
      @Test 
    @Order(2)
    public void dividir(){
        assertEquals(1,matematica.resta());
    }
}