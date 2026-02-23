package ejercicio4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


// EJERCICIO: Obtener info de un archivo

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File file = new File(ruta);

        if (file.exists() && file.isFile()) {

            System.out.println("Información del archivo " + file.getAbsolutePath());

            // Tamaño en bytes
            long tamanoBytes = file.length();

            // Convertimos a MB (más legible)
            double tamanoMB = tamanoBytes / (1024.0 * 1024.0);
            System.out.printf("Tamaño: %d bytes (%.6f MB)\n",tamanoBytes, tamanoMB);

            // FECHA
                // Fecha de última modificación
                long ultimaModificacion = file.lastModified();

                // Convertimos a milisegundas a fecha legible
                Date fecha = new Date(ultimaModificacion);

                //Formateamos la fecha
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaFormateada = formato.format(fecha);

                System.out.println("Última modificación: " + fechaFormateada);

            // Permisos
            System.out.println("- Permisos:");
            System.out.println("   Lectura: " + (file.canRead() ? "Sí" : "No"));
            System.out.println("   Escritura: " + (file.canWrite() ? "Sí" : "No"));
            System.out.println("   Ejecución: " + (file.canExecute() ? "Sí" : "No"));

            // Es oculto
            System.out.println("Es oculto? " + (file.isHidden() ? "Sí" : "No"));

        } else {
            System.out.println("El archivo no existe");
        }

        scanner.close();
    }
}
