/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a03.pkg1;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables 
        double a  , sen  , cos ;
        //a = angulo , sen = seno , cos =coseno , 
        
        
        Scanner T = new Scanner (System.in) ;
        
        System.out.println("Introduce un angulo entre 0 y 360");
        a=T.nextDouble() ;
        
        //se resuelve el seno y coseno 
        double b = Math.toRadians(a) ;
        sen = Math.sin(b) ;
        cos = Math.cos(b) ;
        
        //Mostrar resultado
        System.out.println("El seno del angulo es " + sen);
        
        System.out.println("El coseno del angulo es " + cos);
                
        
        
        
        
    }
    
}
