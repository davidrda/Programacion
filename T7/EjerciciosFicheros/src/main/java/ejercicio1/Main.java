package ejercicio1;

import java.io.*;
import java.util.Scanner;

// ⚠️ EJERCICIO: Leer un fichero ⚠️

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la ruta del archivo a leer: ");
        String ruta = scanner.nextLine();

        // ⚠️ ESTO NO CREA EL ARCHIVO, SÓLO CREA EL OBJETO QUE REPRESENTA ESA RUTA ⚠️
        File file = new File(ruta);
        BufferedReader bufferedReader = null;

        if (file.exists()) {

            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }


            } catch (FileNotFoundException e) {
                System.out.println("Error al abrir el archivo");
            } catch (IOException e) {
                System.out.println("No cuentas con permisos suficientes");
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException | NullPointerException e) {
                    System.out.println("Error en el cerrado del fichero");
                }
            }
        }

        scanner.close();


    }
}
