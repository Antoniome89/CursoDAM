/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horassemanales;

 import java.util.*;

/**
 *
 * @author tony_
 */
public class HorasSemanales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    System.out.print("Introduzca las horas de trabajo: ");    
    Scanner entrada = new Scanner (System.in);
    int horas = entrada.nextInt();   
    
    int sueldobase = horas * 16;
    int sueldoextra = (horas - 40) * 20;
    int sueldototal = sueldobase + sueldoextra;
    
    if (horas <= 40) {
        System.out.println("El sueldo es " + sueldobase + " €.");
    }else {
        System.out.println("El sueldo base es " + sueldobase + " €." + "\nEl sueldo de horas extras es " + sueldoextra + " €." + " \nEl sueldo total es " + sueldototal + " €.");
    }
    
    }
    
}
        

    

