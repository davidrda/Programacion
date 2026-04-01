import com.example.practicalibrosss.controller.APIController;
import com.example.practicalibrosss.controller.BibliotecaController;
import com.example.practicalibrosss.controller.FileController;
import com.example.practicalibrosss.model.Libro;

import java.io.File;
import java.util.List;

public class Main {

    static void main(String[] args) {
        APIController apiController = new APIController();

        List<Libro> libros = apiController.getAPI();


        BibliotecaController bibliotecaController = new BibliotecaController();

        bibliotecaController.importarLibros();

        System.out.println("\nBuscar libro por id:");
        System.out.println("\t" + bibliotecaController.buscarLibroPorId(1));

        System.out.println("\nMostrar los títulos de los libros: ");
        for (Libro libro : bibliotecaController.getLibros()){
            System.out.println("\t" + libro.getTitle());
        }

        bibliotecaController.addFavorito(4);
        bibliotecaController.addFavorito(5);
        bibliotecaController.addFavorito(6);
        //bibliotecaController.addFavorito(1000);

        System.out.println("\nMostrar favoritos:");
        for (Libro libro : bibliotecaController.getFavoritos()){
            System.out.println("\t" + libro);
        }

        FileController fileController = new FileController();

        fileController.exportarFavoritos(bibliotecaController.getFavoritos());
        System.out.println(fileController.importarFavoritos());


    }
}
