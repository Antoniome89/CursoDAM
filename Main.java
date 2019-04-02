import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Personas> personas = new ArrayList();
        Personas pepe = new Personas("Pepe", 30);
        personas.add(new Personas("Ana", 14));
        Personas antonio = new Personas("Antonio", 30);
        Personas maria = new Personas("María", 16);
        Personas natalia = new Personas("Natalia", 18);


        personas.add(pepe);
        personas.add(antonio);
        personas.add(maria);
        personas.add(natalia);



        System.out.println("Lista completa de personas: ");
        for (int i = 0; i < personas.size(); i++) {

            System.out.println(personas.get(i).nombre + " " + personas.get(i).edad);
        }

        //Buscar nombre en el Array y mostrar edad:


        System.out.println("///////////////////////////////////");
        System.out.println("Introduce un nombre: ");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        for (int i = 0; i < personas.size(); i++) {
            if (nombre.equalsIgnoreCase(personas.get(i).nombre)) {
                System.out.println(personas.get(i).nombre + " tiene " + personas.get(i).edad + " años.");
                break;
            } else if (i == (personas.size ()- 1) && !nombre.equalsIgnoreCase(personas.get(i).nombre)){
                System.out.println("No hay coincidencias.");
            }

        }
        entrada.close();

        System.out.println("///////////////////////////////////");

        //Buscar nombre en el Array y mostrar solo los que sean mayores de edad:


        System.out.println("Solo mayores de edad:");

        for(int j=0; j < personas.size();j++){

            if (personas.get(j).edad > 17) {

                System.out.println(personas.get(j).nombre + personas.get(j).edad);
            } else if (personas.get(j).edad < 18) {
                System.out.println("No procede.");
            }


        }

    }
}






