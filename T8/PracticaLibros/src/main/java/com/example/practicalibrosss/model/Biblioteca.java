package com.example.practicalibrosss.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Biblioteca {

    private List<Libro> libros = new ArrayList<>();

    public void addLibro(Libro libro) {
        libros.add(libro);
    }
}
