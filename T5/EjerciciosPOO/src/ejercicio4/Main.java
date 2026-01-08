package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Don Quijote","Cervantes");
        Libro libro3 = new Libro("Gracias a ti","Vanessa Garcia", 150);

        System.out.println("Libro 1: "+libro1);
        System.out.println("Libro 2: "+libro2);
        System.out.println("Libro 3: "+libro3);
    }
}
