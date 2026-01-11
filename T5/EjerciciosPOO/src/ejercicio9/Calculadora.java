package ejercicio9;

public class Calculadora {

    public static void suma(int num1, int num2) {

        System.out.println("Suma: " + num1 + " + " + num2 + ": " + (num1 + num2));
    }

    public static void resta(int num1, int num2) {

        System.out.println("Resta: " + num1 + " - " + num2 + ": " + (num1 - num2));
    }

    public static void multiplica(int num1, int num2) {

        System.out.println("Multiplicación: " + num1 + " * " + num2 + ": " + (num1 * num2));
    }

    public static void divide(double num1, double num2) {

        System.out.println("División: " + num1 + " / " + num2 + ": " + (num1 / num2));
    }

    public static void potencia(int num1, int num2) {

        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = resultado * num1;
        }

        System.out.println("Potencia: " + num1 + " ^ " + num2 + ": " + (resultado));
    }
}
