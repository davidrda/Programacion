package ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la ruta: ");
        String ruta = scanner.nextLine();

        controller.listaArchivos(ruta);
    }
}
