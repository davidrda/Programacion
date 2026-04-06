import com.example.practicalibrosss.service.APIController;
import com.example.practicalibrosss.service.BibliotecaController;
import com.example.practicalibrosss.service.FileController;
import com.example.practicalibrosss.model.Libro;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        APIController apiController = new APIController();


        BibliotecaController bibliotecaController = new BibliotecaController();

        FileController fileController = new FileController();

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.printf("""
                Elige opción:
                
                ======= MENÚ =======
                1. Importar libros de la API
                2. Buscar libro por ID
                3. Mostrar los títulos de los libros
                4. Añadir favorito por ID
                5. Mostrar favoritos
                6. Exportar favoritos
                7. Importar favoritos\n
                """
            );

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    bibliotecaController.importarLibros();
                }
                case 2 -> {
                    System.out.println("Indica el id:");
                    int id = scanner.nextInt();
                    Libro libro = bibliotecaController.buscarLibroPorId(id);
                    System.out.println("ID: " + id + " : " + libro + "\n");
                }
                case 3 -> {
                    System.out.println("Mostrar los títulos de los libros: ");
                    for (Libro libro : bibliotecaController.getLibros()){
                        System.out.println("\t" + libro.getTitle());
                    }
                }
                case 4 -> {
                    System.out.println("Indica el id:");
                    int id = scanner.nextInt();
                    bibliotecaController.addFavorito(id);
                }
                case 5 -> {
                    System.out.println("Mostrar favoritos:");
                    for (Libro libro : bibliotecaController.getFavoritos()){
                        System.out.println("\t" + libro);
                    }
                }
                case 6 -> {
                    fileController.exportarFavoritos(bibliotecaController.getFavoritos());
                }
                case 7 -> {
                    System.out.println("Libros importados: " + fileController.importarFavoritos());
                }
                default -> {
                    System.out.println("Opción inválida");
                    return;
                }
            }
        } while (opcion != 0);

    }
}
