package ejercicio2;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Controller {

    public Producto[] APIcontroller(String api){

        try {
            Gson gson = new Gson();

            // Hace la petición HTTP
            HttpClient httpClient = HttpClient.newHttpClient();

            // Construye la petición HTTP
            HttpRequest httpRequest = HttpRequest
                    .newBuilder()
                    .uri(URI.create(api))
                    .GET()
                    .build();

            // Envío de la petición HTTP
            HttpResponse<String> httpResponse =
                    httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


            RespuestaAPI respuestaAPI = gson.fromJson(httpResponse.body(), RespuestaAPI.class);

            return respuestaAPI.products;
        } catch (IOException e) {
            System.out.println("Error IOException");
            return null;
        } catch (InterruptedException e) {
            System.out.println("Error InterruptedException");
            return null;
        }
    }
}
