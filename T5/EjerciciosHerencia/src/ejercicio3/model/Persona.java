package ejercicio3.model;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void presentarse(){
        System.out.println("Hola, soy "+nombre+" y tengo "+edad+" años");
    }
}
