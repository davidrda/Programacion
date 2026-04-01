package com.example.practicalibrosss.controller;

import com.example.practicalibrosss.model.APIResponse;
import com.example.practicalibrosss.model.Libro;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIController {

    public List<Libro> getAPI(){

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create("https://stephen-king-api.onrender.com/api/books"))
                .build();

        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String body = httpResponse.body();
            Gson gson = new Gson();

            // JSON -> Objeto
            APIResponse response = gson.fromJson(body, APIResponse.class);

            // Devuelve data, que es una lista de libros
            return response.getData();

        } catch (IOException e) {
            System.out.println("Error de input/output");
            return null;
        } catch (InterruptedException e) {
            System.out.println("Error de InterruptedException");
            return null;
        }
    }
}
