package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            int[] array = {1, 2, 3, 4, 5};

            System.out.print("Indica la posición: ");
            int posicion = scanner.nextInt();
            System.out.println("Elemento en posición "+posicion+": "+array[posicion-1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Posición fuera de los límites del array");
        }

    }
}
