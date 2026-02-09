package ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        // El programa se repite hasta que el usuario introduzca un número válido
        while (!valido) {

            System.out.print("Introduce un número: ");
            String entrada = sc.nextLine();

            try {
                // Intentamos convertir el texto a entero
                numero = Integer.parseInt(entrada);
                valido = true; // Si llega aquí, es válido

            } catch (NumberFormatException e) {
                // Si no se puede convertir a entero
                System.out.println("Error: Eso no es un número válido. Inténtalo de nuevo.");
            }
        }

        System.out.println("Has introducido el número: " + numero);
        sc.close();
    }
}
