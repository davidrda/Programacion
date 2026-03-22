package com.example.pokeapi;

import com.example.pokeapi.model.Pokemon;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeService {

    /*
    1. Crea el cliente
    2. Construcción de petición
    3. Envío de petición
     */

    Gson gson = new Gson();

    // Métod0 que retorna el pokemon
    public Pokemon buscarPokemon(String nombrePokemon){

        String ruta = "https://pokeapi.co/api/v2/pokemon/";


        // Creas el cliente
        HttpClient httpClient = HttpClient.newHttpClient();

        // Construyes la petición
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(ruta+nombrePokemon))
                .build();

        try {

            // Envías la petición
            HttpResponse<String> httpResponse =
                    httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // Lo metes en la clase Pokemon
            Pokemon pokemon = gson.fromJson(httpResponse.body(), Pokemon.class);

            // retornas el pokemon
            return pokemon;

        } catch (IOException e){
            System.out.println("Error de input/output");
            return null;
        } catch (InterruptedException e) {
            System.out.println("Error de red");
            return null;
        }
    }

}
