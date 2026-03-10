package ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Usuario> listaUsuarios;

    public Controller() {
        listaUsuarios = new ArrayList<>();
    }

    public void escribirFichero(String ruta) {

        File file = new File(ruta);

        try (
                PrintWriter printWriter = new PrintWriter(new FileWriter(file));
        ) {
            printWriter.println("Nombre,Edad,Calificación");
            for (Usuario user : listaUsuarios) {
                printWriter.println(user);
            }

        } catch (IOException e) {
            System.out.println("Error en el input/output del archivo");
        }

    }

    public void leerFichero(String ruta){

        File file = new File(ruta);

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }

    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
}
