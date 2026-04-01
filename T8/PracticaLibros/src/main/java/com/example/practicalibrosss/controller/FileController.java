package com.example.practicalibrosss.controller;

import com.example.practicalibrosss.model.Libro;

import java.io.*;
import java.util.List;

public class FileController {

    // Nombre del fichero donde se guardarán los archivos
    private final String FILE_NAME = "src/main/java/com/example/practicalibrosss/favoritos.obj";

    // Libros -> favoritos.obj
    public void exportarFavoritos(List<Libro> favoritos){
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))
        ) {
            // Escribe el objeto completo la lista de favoritos
            oos.writeObject(favoritos);
            System.out.println("\nFavoritos guardados correctamente!");
        } catch (IOException e){
            System.out.println("Error al exportar favoritos");
        }
    }

    // favoritos.obj -> Libros
    public List<Libro> importarFavoritos(){
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))
        ){
            // Lee el objeto del fichero y lo convierte a List<Libro>
            return  (List<Libro>) ois.readObject();
        } catch (IOException e) {
            System.out.println("No existe fichero de favoritos o error de lectura");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al convertir los datos");
        }

        // Si algo falla, devuelve null
        return null;
    }
}
