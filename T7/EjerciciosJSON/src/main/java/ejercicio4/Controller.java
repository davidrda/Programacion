package ejercicio4;

import com.google.gson.Gson;
import ejercicio4.model.Usuario;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Controller {

    public void APIcontroller4 () {

        String url = "https://jsonplaceholder.typicode.com/";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(url+"posts/1"))
                .build();


        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            JSONObject jsonObject = new JSONObject(httpResponse.body());


            String urlFinal = url + "users/" + jsonObject.get("userId");

            httpRequest = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlFinal))
                    .build();

            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            JSONObject usuarioJson = new JSONObject(httpResponse.body());

            Gson gson = new Gson();
            Usuario usuario = gson.fromJson(String.valueOf(usuarioJson), Usuario.class);

            System.out.printf("""
                Título del post: %s
                Nombre del usuario: %s
                Ciudad del usuario: %s
                """
                    , jsonObject.getString("title")
                    , usuario.getName()
                    , usuario.getAddress().getCity()
            );


        } catch (IOException e) {
            System.out.println("Error de io");
        } catch (InterruptedException e) {
            System.out.println("Error de red");
        }
    }
}
