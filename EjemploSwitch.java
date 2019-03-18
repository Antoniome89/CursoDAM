/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

/**
 *
 * @author tony_
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*int month = 14;
       String season = "";
       
       if (month == 1 || month == 2 || month == 3){
           season =   "Invierno" ;
       }else if ( month == 4 || month == 5 || month == 6) {
            season = "Primavera";
       }else if ( month == 7 || month == 8 || month == 9) {
            season = "Verano";
       }else if ( month == 10 || month == 11 || month == 12) {
            season = "Otoño";
       }           
       System.out.println("La estación para el mes " + month + " es: " +   season );*/
       
     String name = "Carmen";
     int    age  =  34;
     
    if (name == "Paco") {
        if (age <= 30) {
            if (age == 30){
            System.out.println("Es Paco y tiene 30 años.");
            }else {
                  System.out.println("Es Paco y es menor de 30 años.");
            }
        }else {
            System.out.println("Es Paco y es mayor de 30 años.");
        }
               
}   else {
        System.out.println("No es Paco");
}
}
}
       
    
       
            
                     
                


