/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author pi
 */
public class AppMainTest {
    
    public AppMainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of division method, of class AppMain.
     */
    @Test
    public void testDivision_Throw_IllegalArgumentException() {
        System.out.println("division");
        double a = 5;
        double b = 0.0;
        
        
        assertThrows(IllegalArgumentException.class, () -> {
       
           AppMain.division(a, b);
//          
    });
       
    }
    
        @Test
    public void testDivision () {
        System.out.println("division normal");
        double a = 6;
        double b = 2;
        double result = AppMain.division(a,b);
        
        assertEquals(result, 3);
       
//          
    }
    
        @Test
        @DisplayName("Test addition")
    public void testAddition() {
        
        double a = 5;
        double b = 2;
        double result = AppMain.addition(a,b);
            assertEquals(result, 7);

       
    }
    
            @Test
    public void testSoustraction() {
        System.out.println("Soutraction");
        double a = 5;
        double b = 2;
        double result = AppMain.soustraction(a,b);
            assertEquals(result, 3);

       
    }
    
               @Test
    public void testMultiplication() {
        System.out.println("Multiplication");
        double a = 5;
        double b = 2;
        double result = AppMain.multiplication(a,b);
            assertEquals(result, 10);

       
    }
    

    
}
