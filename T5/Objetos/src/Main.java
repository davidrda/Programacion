import model.Coche;
import model.Comprador;

public class Main {

    public static void main(String[] args) {

        Coche mercedes = new Coche("Mercedes","ClaseC",300,70000);
        Coche mondeo = new Coche("Ford","Focus",150,40000,5);

        Comprador comprador = new Comprador("Borja","Martin","borja@gmail.com","Madrid",8373738);
        System.out.println("La dirección del coche es: "+comprador.getDireccion());
    }
}
