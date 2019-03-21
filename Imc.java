/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author tony_
 */
public class Imc {
    
    String Nombre;
    String Apellido1;
    String Apellido2;
    double Altura;
    double Peso;
    
    
    public void showAtributes() {
     
        System.out.println(Nombre);
        System.out.println(Apellido1);
        System.out.println(Apellido2);
        System.out.println(Altura);
        System.out.println(Peso);
            
    }
    
    public void showImc() {
    
    double Imc = Peso /(Altura*Altura);  
    System.out.printf("%1.2f",Imc);
    
    if (Imc < 18.50) {
        System.out.println("\nBajo Peso");
        if (Imc < 16){
        System.out.println("Delgadez severa");
        }else if (Imc < 17){
        System.out.println("Delgadez moderada");
        }else if (Imc < 18.50){
        System.out.println("Delgadez leve");
        }       
    }else if (Imc < 25) {
        System.out.println("\nNormal");
    }else if (Imc < 30) {
        System.out.println("\nSobrepeso");
        System.out.println("Preobeso");
    }else if (Imc >= 30) {
        System.out.println("\nObesidad");
        if (Imc < 35) {
        System.out.println("Obesidad leve");
        }else if (Imc < 40) {
        System.out.println("Obesidad media");
        }else if (Imc > 40) {
        System.out.println("Obesidad mórbida");
        }
    } 
    }
}
    
    
    

