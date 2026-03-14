package ejercicio5;

import com.google.gson.Gson;
import ejercicio5.model.Pokemon;
import ejercicio5.model.Stat;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Controller {

    public void ej5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el pokemon: ");
        String nombrePokemon = scanner.nextLine();

        String ruta = "https://pokeapi.co/api/v2/pokemon/";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(ruta + nombrePokemon))
                .build();

        try {
            // Guardas la respuesta en formato String
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Pokemon pokemon = gson.fromJson(httpResponse.body(), Pokemon.class);

            System.out.printf("""
                    Nombre: %s
                    Altura: %d m
                    Peso: %d kg%n
                    """
                    , pokemon.getName()
                    , pokemon.getHeight()
                    , pokemon.getWeight()/10
            );

            for (int i = 0; i < 3; i++) {

                Stat stat = pokemon.getStats().get(i);

                System.out.printf("""
                        %d. Nombre Stat: %s
                        Base Stat: %d%n
                        """
                        , i + 1
                        , stat.getStat().getName()
                        , stat.getBaseStat()
                );
            }

        } catch (IOException e) {
            System.out.println("Error de input/output");
        } catch (InterruptedException e) {
            System.out.println("Error de red");
        }

    }
}
