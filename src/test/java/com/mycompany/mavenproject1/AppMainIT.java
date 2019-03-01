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

/**
 *
 * @author pi
 */
public class AppMainIT {
    
    public AppMainIT() {
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
     * Test of main method, of class AppMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AppMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class AppMain.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = AppMain.addition(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soustraction method, of class AppMain.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = AppMain.soustraction(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class AppMain.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = AppMain.multiplication(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class AppMain.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = AppMain.division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
