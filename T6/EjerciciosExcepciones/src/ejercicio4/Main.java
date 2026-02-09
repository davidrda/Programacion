package ejercicio4;

import java.util.Scanner;

public class Main {

    public class EdadInvalidaException extends Exception {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Controller controller = new Controller();

            System.out.println("Introduce tu edad: ");
            int edad = scanner.nextInt();

            controller.validarEdad(edad);

        }
    }
}
