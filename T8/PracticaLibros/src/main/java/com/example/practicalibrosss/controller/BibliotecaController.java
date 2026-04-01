package com.example.practicalibrosss.controller;

import com.example.practicalibrosss.model.Biblioteca;
import com.example.practicalibrosss.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {

    private Biblioteca biblioteca;
    private List<Libro> favoritos;
    private  APIController apiController;


    public BibliotecaController() {
        this.biblioteca = new Biblioteca();
        this.favoritos = new ArrayList<>();
        this.apiController = new APIController();
    }

    public void importarLibros(){
        List<Libro> libros = apiController.getAPI();
        if (libros != null) {
            biblioteca.setLibros(libros);
            System.out.println("Libros importados!");
        } else {
            System.out.println("No se han podido importar los libros");
        }
    }

    public List<Libro> getLibros(){
        return  biblioteca.getLibros();
    }

    public Libro buscarLibroPorId(int id){
        for (Libro libro : biblioteca.getLibros()){
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public void addFavorito(int id) {
        Libro libro = buscarLibroPorId(id);

        if (libro != null && !favoritos.contains(libro)) {
            System.out.printf("Libro con id:%d añadido a favoritos\n",id);
            favoritos.add(libro);
        } else {
            System.out.println("Error, no se puede agregar a favoritos\n");
        }
    }

    public  List<Libro> getFavoritos(){

        return favoritos;
    }
}
