/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraynombres;

/**
 *
 * @author tony_
 */
public class EjercicioArrayNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nombres = {"Antonio", "Francisco", "Pilar", "David", "Miguel", "Margarita"};
        String[] apellidos = {"Martínez", "González", "Guiérrez", "Cantero", "Molina", "Serrano"};

        String[] nombresCompletos = {nombres [0] + " " + apellidos [0],
                                     nombres [1] + " " + apellidos [1],
                                     nombres [2] + " " + apellidos [2],
                                     nombres [3] + " " + apellidos [3],
                                     nombres [4] + " " + apellidos [4],
                                     nombres [5] + " " + apellidos [5]};

        System.out.println(nombresCompletos [0]);
        System.out.println(nombresCompletos [1]);
        System.out.println(nombresCompletos [2]);
        System.out.println(nombresCompletos [3]);
        System.out.println(nombresCompletos [4]);
        System.out.println(nombresCompletos [5]);

    }
    
}
