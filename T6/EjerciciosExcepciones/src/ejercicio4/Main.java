package ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        try {
            validarEdad(edad);
            System.out.printf("Edad válida: %d años%n",edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validarEdad(int edad) throws EdadInvalidaException{
        if (edad < 0) {
            throw new EdadInvalidaException("Error: La edad no puede ser negativa");
        }

        if (edad > 120) {
            throw new EdadInvalidaException("Error: La edad no puede ser mayor que 120");
        }
    }


}
