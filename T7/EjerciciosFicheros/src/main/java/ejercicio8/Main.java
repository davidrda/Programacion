package ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Indica la ruta: ");
        String ruta = scanner.nextLine();
        controller.contadorPalabras(ruta);


    }
}
