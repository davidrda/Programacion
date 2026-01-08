package ejercicio6;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
            System.out.println("Asignando nota "+nota+": Correcto.");
        } else {
            System.out.println("Asignando nota: "+nota+". Nota inválida. Tiene que ser una nota del 0 al 10.");
            System.out.println("Nota actual: "+this.nota);
        }
    }

    // toString para mostrar a la estudiante
    @Override
    public String toString() {
        return "Estudiante: "+nombre+", "+edad+" años";
    }
}
