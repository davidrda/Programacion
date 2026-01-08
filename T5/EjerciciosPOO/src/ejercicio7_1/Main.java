package ejercicio7_1;

public class Main {

    public static void main(String[] args) {

        Direccion direccion = new Direccion("San Antonio","Mislata", 46920);
        Cliente cliente = new Cliente("David", "david@gmail.com", direccion);

        System.out.println(cliente);
    }
}
