package ejercicio6;

import java.io.*;

// Crear un archivo CSV
public class Main {

    public static void main(String[] args) {

         Controller controller = new Controller();

         controller.addUsuario(new Usuario("David",25, 10));
         controller.addUsuario(new Usuario("Vanessa",24, 9));
         controller.addUsuario(new Usuario("Adrian",26, 8));

         controller.escribirFichero("src/main/resources/archivo2.csv");

         controller.leerFichero("src/main/resources/archivo2.csv");
    }
}
