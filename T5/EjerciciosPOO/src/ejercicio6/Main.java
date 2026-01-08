package ejercicio6;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Vanessa García", 24);

        System.out.println(estudiante);
        System.out.println();
        estudiante.setNota(4);
        estudiante.setNota(11);
        estudiante.setNota(8.8);
        estudiante.setNota(14.0);
    }
}
