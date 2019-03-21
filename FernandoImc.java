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
public class FernandoImc {
    
    public static void main (String args []) {
    
        Imc Fernando = new Imc ();
        Fernando.Nombre = "Fernando";
        Fernando.Apellido1 = "Carrasco";
        Fernando.Apellido2 = "Molina";
        Fernando.Altura = 1.89;
        Fernando.Peso = 65;
        
        
       Fernando.showAtributes();
       Fernando.showImc();
        
    }   
}
