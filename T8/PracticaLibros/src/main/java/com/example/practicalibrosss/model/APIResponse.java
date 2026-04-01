package com.example.practicalibrosss.model;

import lombok.Data;
import java.util.List;

/*
Se usa APIResponse porque el JSON no devuelve directamente una lista de libros,
devuelve "data", que contiene la lista de libros
 */

@Data
public class APIResponse {
    private List<Libro> data;
}
