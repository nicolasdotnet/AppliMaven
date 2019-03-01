package com.mycompany.mavenproject1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class AppMain 
{
    
    private static final Logger Log = LogManager.getLogger(AppMain.class);
    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Log.debug("Debug");
        Log.info("Info");
        Log.warn("Warn");
        Log.error("Error");
        Log.fatal("Fatal");
        
        Log.info("Appending string: {}.","Bonjour !");
    }
    
    public static double addition (double a,double b) {

        
        return a+b;
    
    }
    
    
    
    public static double soustraction(double a, double b) {

        return a - b;

    }
    
    public static double multiplication (double a,double b) {
    
        return a*b;
    
    };
    
    
    public static double division (double a,double b) throws IllegalArgumentException{
        if (b==0){
            
            throw new IllegalArgumentException("Fatal basouka");
        
        }
 
    
        return a/b;
    
    }

}
