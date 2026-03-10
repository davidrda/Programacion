package ejercicio7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public void listaArchivos(String ruta) {

        File file = new File(ruta);

        if (!file.exists() && !file.isDirectory()) {
            System.out.println("La ruta no existe o no es un directorio");
            return;
        }

        System.out.println("Directorio: " + ruta);

        // Obtenemos todos los archivos y subdirectorios de esa ruta
        File[] elementos = file.listFiles();

        // Formateador para mostrar la fecha con formato dia/mes/año hora:minuto
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        //Recorremos cada elemento (archivo o carpeta) dentro del directorio
        for (File item : elementos) {

            // Obtenemos la fecha de última modificación y la convertimos en objeto Date
            Date fecha = new Date(item.lastModified());

            // Formateamos la fecha para que se vea legible
            String fechaFormateada = simpleDateFormat.format(fecha);

            // Si el elemento es un archivo
            if (item.isFile()) {
                System.out.println(
                        "- [ARCHIVO] " + item.getName() + // Nombre del archivo
                                " (" + item.length() + " bytes)" + // Tamaño en bytes
                                " - Última modificación: " + fechaFormateada // Fecha formateada
                );
            }

            // Si el elemento es un directorio
            if (item.isDirectory()) {
                System.out.println(
                        "- [DIRECTORIO] " + item.getName() +      // Nombre del directorio
                                " - Última modificación: " + fechaFormateada // Fecha formateada
                );
            }

        }


    }
}
