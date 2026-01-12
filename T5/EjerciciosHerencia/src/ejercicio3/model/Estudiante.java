package ejercicio3.model;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Estoy estudiando "+curso+"º de DAM");
    }
}
