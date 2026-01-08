package ejercicio1;

import ejercicio1.model.Persona;

public class Main {

    /*
    Crea una clase llamada Persona con dos atributos: nombre y edad.
    Define un constructor que inicialice estos atributos.
    En el métod0 main, crea un objeto de tipo Persona y muestra sus datos.
    */

    /*
    Amplía la clase Persona del ejercicio anterior añadiendo métodos getter y setter para los atributos nombre y edad.
    Crea un objeto, modifica sus valores usando los setters y muestra los datos usando los getters.
     */
    public static void main(String[] args) {

        Persona persona = new Persona();

        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());

        persona.setNombre("Vanessa");
        persona.setEdad(24);

        System.out.println("Datos modificados:");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());

    }
}
