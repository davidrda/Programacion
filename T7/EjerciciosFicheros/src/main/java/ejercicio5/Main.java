package ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File file = new File(ruta);
        int contador = 0;

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null ) { // Lee la línea
                contador++;
            }

            System.out.printf("El archivo contiene %d líneas%n",contador);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
