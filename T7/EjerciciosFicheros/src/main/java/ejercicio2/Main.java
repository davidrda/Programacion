package ejercicio2;

import java.io.*;
import java.util.Scanner;

// EJERCICIO: Buscar palabra en un archivo

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la ruta del archivo: ");
        String ruta = scanner.nextLine();

        System.out.println("Indica la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();

        File file = new File(ruta);
        BufferedReader bufferedReader = null;

        // Se comprueba si existe
        if (file.exists()) {
            try {
                int contador = 0;

                bufferedReader = new BufferedReader(new FileReader(file));

                String linea;

                // Leer línea por línea
                while ((linea = bufferedReader.readLine()) != null) {

                    // Se pasa a minúsculas
                    linea = linea.toLowerCase();

                    // Se divide la línea en palabras
                    String[] palabras = linea.split(" ");

                    // Recorremos cada palabra
                    for (String palabra : palabras) {
                        if (palabra.equals(palabraBuscada)) {
                            contador++;
                        }
                    }
                }

                System.out.println("La palabra \"" + palabraBuscada +
                        "\" aparece " + contador + " veces.");

            } catch (FileNotFoundException e) {
                System.out.println("Error en el archivo");
            } catch (IOException e) {
                System.out.println("Error");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
