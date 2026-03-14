package ejercicio3;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Controller {

    public void APIcontroller3 (String api) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué producto quieres ver?");
        String idProducto = scanner.nextLine();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(api + idProducto))
                .build();


        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            JSONObject producto = new JSONObject(httpResponse.body());

            System.out.printf("""
                    Title: %s
                    Description: %s
                    Category: %s
                    """
                    , producto.get("title")
                    , producto.get("description")
                    , producto.get("category")
            );


        } catch (IOException e) {
            System.out.println("Error de io");
        } catch (InterruptedException e) {
            System.out.println("Error de red");
        } catch (JSONException e) {
            System.out.println("Item no encontrado");
        }
    }
}
