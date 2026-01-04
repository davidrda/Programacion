import java.util.Scanner;

public class EjercicioCuadrado {

    public void cuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el tamaño del cuadrado");
        int tamanio = scanner.nextInt();

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1) { // si estas en la primera o ultima fila, pinta
                    System.out.print(" * ");
                } else if (j == 0 || j == tamanio - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }

    }

    public void palindromo() {

        // Palabra a comprobar
        String palabra = "allivessevilla";

        // Suponemos que es palíndromo hasta que se demuestre lo contrario
        boolean esPalindromo = true;

        // Recorremos solo la mitad de la palabra
        for (int i = 0; i < palabra.length() / 2; i++) {

            // Comparamos la letra de adelante con la de atrás
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false; // Si son diferentes, no es palíndromo
                break; // Ya no hace falta seguir comprobando
            }
        }

        // Mostramos el resultado
        if (esPalindromo) {
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra no es palíndromo");
        }

        double numero = 2.45;
        String[] diasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        System.out.println(diasSemana[6]);
        for (int i = 0; i < 7 ; i++) {
            if (i % 2 == 0){
            System.out.println(diasSemana[i]);

            }

        }

        //for i -> (recorrer, preguntar y modificar) inicio; final; incremento
        //    : coleccionARecorrer
        for ( String item  : diasSemana){ // item recorre cada día en bucle, item: Lunes, item: Martes, etc
            System.out.println(item);
        }



    }
}
