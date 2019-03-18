 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

/**
 *
 * @author tony_
 */

import java.util.*;

public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("Introduzca la nota:");
        Scanner entrada = new Scanner (System.in);
        int nota = entrada.nextInt();
              
            
        String resultado = "";
        
        switch (nota){
        case 1: case 2: case 3: case 4:
            resultado = "Suspenso";
            break;
        case 5: case 6:
            resultado = "Aprobado";
            break;
        case 7: case 8:
            resultado = "Notable";
            break;
        case 9: case 10:
            resultado = "Sobresaliente";
            break;
        default:
            resultado = "Nota incorrecta.";
                           
        } 
        System.out.println("La calificación obtenida es: " + resultado);
    }
    
}
