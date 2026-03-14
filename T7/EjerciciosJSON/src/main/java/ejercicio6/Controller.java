package ejercicio6;

import com.google.gson.Gson;
import ejercicio6.model.Pregunta;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Controller {

    public void ej6(){

        String url = "https://opentdb.com/api.php?amount=3&type=multiple";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();

        try {

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            JSONObject jsonObject = new JSONObject(httpResponse.body());
            JSONArray jsonArray = jsonObject.getJSONArray("results");

            Gson gson = new Gson();
            Pregunta pregunta;

            for (int i = 0; i < jsonArray.length(); i++) {

                // Guardo cada pregunta en una variable
                JSONObject preguntaJson = jsonArray.getJSONObject(i);

                // La almaceno en la clase Pregunta como String
                pregunta = gson.fromJson(preguntaJson.toString(), Pregunta.class);

                System.out.printf("""
                        Categoria: %s
                        Question: %s
                        Correct answer: %s%n
                        """
                        , pregunta.getCategory()
                        , pregunta.getQuestion()
                        , pregunta.getCorrectAnswer()
                );

            }

        } catch (IOException e) {
            System.out.println("Error de io");
        } catch (InterruptedException e) {
            System.out.println("Error de red");
        }
    }
}
