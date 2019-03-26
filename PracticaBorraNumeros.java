
package practica;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica {

   
    public static void main(String[] args) {
       ArrayList<Integer> values = new ArrayList(); 
       Scanner sc = new Scanner(System.in);
       int n;
       
       System.out.println("Introduce un número. -99 para salir.");        
       n = sc.nextInt();
       
       while (n != -99) {
                 values.add(n);
                 System.out.print("Introduce entero. -99 para salir.");
                 n = sc.nextInt();
        }
       
       System.out.println(values);
       
       Scanner sc1 = new Scanner (System.in);
       int m;
       
       System.out.println("Introduce el número malo: ");
       m = sc1.nextInt();
       
       int i = 0;
       for (i = 0; i < values.size(); i++) {
           
           if ((values.get(i))%(m) == 0){
           values.remove(i);
           }
       }
       System.out.println (values);
       
       
       }
}
       
       
       
       
       
    


