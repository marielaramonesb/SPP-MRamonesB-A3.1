/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a3.pkg1;
import java.util.Scanner;

/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // paso 1. variables
        Scanner kb= new Scanner (System.in);
        System.out.println("Calculador de funciones trigonométricas");
        int valor= 0;
        int a;
        
        a= kb.nextInt();
        double  anguloRadianes= Math.toRadians(a);
        
        // use math de funciones coseno, tangente y ceno
        valor = (int) Math.cos(anguloRadianes);
        System.out.println("Coseno de " + a + "º = " + valor);
        
        valor = (int)Math.tan(anguloRadianes);
        System.out.println("Tangente de " + a + "º = " + valor);
        
        valor = (int)Math.sin(anguloRadianes);
        System.out.println("Seno de " + a + "º = " + valor);
        
    }
    
}
