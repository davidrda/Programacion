package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Mishi", 3);

        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println();

        gato.mostrarInfo();
        gato.hacerSonido();
    }
}
