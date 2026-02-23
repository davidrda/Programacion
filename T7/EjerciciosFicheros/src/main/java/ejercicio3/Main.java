package ejercicio3;


import java.io.*;
import java.util.Scanner;

// EJERCICIO: Copiar de un archivo a otro

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el archivo de origen: ");
        String rutaOrigen = scanner.nextLine();

        System.out.println("Indica el archivo de destino: ");
        String rutaDestino = scanner.nextLine();

        File fileOrigen = new File(rutaOrigen);
        File fileDestino = new File(rutaDestino);

        // Se comprueba que el origen existe y es un archivo (no una carpeta)
        if (!fileOrigen.exists() || !fileOrigen.isFile()) {
            System.out.println("No existe el archivo de origen o no es un archivo.");
            scanner.close();
            return;
        }

        /*
        Aseguramos que la carpeta destino exista (si hay carpeta en la ruta)
        File carpetaDestino = fileDestino.getParentFile();
        if (carpetaDestino != null && !carpetaDestino.exists()) {
            boolean creada = carpetaDestino.mkdirs();
            if (!creada) {
                System.out.println("No se pudo crear la carpeta de destino.");
                scanner.close();
                return;
            }
        }
        */

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOrigen));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileDestino))
        ) {
            String linea;

            while ((linea = bufferedReader.readLine()) != null) { // Lee la línea
                bufferedWriter.write(linea); // La escribe en fileDestino
                bufferedWriter.newLine(); // Salto de línea IMPORTANTE
            }

            System.out.println("El archivo ha sido copiado correctamente");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo " + e.getMessage());
        }

    }

}
