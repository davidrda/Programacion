package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Introduce el número 1: ");
            int n1 = scanner.nextInt();

            System.out.print("Introduce el número 2: ");
            int n2 = scanner.nextInt();
            int division = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Error. No se puede dividir entre 0");
        }
    }
}
