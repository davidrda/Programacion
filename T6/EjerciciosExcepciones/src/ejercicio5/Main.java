package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Introduce el primer número: ");
            int num1 = scanner.nextInt();

            System.out.println("Introduce el segundo número: ");
            int num2 = scanner.nextInt();

            scanner.nextLine(); // limpiar buffer

            System.out.println("Introduce la operación (+, -, *, /)");
            String operador = scanner.nextLine();
            int resultado = 0;
            switch (operador) {
                case "+" -> {
                    resultado = num1 + num2;
                }
                case "-" -> {
                    resultado = num1 - num2;
                }
                case "*" -> {
                    resultado = num1 * num2;}
                case "/" -> {
                    resultado = num1 / num2;

                }
            }
            System.out.printf("Resultado: %d %s %d = %d%n",num1,operador,num2, resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir números válidos");
        } catch (InputMismatchException e) {
            System.out.println("Error: error de Scanner");

        } finally {
            System.out.println("Fin del programa");
        }
    }
}

