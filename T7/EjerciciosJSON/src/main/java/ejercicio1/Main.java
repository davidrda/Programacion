package ejercicio1;

import com.google.gson.Gson;

import java.awt.color.ICC_ColorSpace;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {

        String url = "https://randomuser.me/api/";
        try{

            // Convierte el JSON -> Objeto Java
            Gson gson = new Gson();

            // Crea el cliente para hacer peticiones Http
            HttpClient cliente = HttpClient.newHttpClient();

            // CONSTRUCCIÓN DE PETICIÓN
            HttpRequest request = HttpRequest // Clase que crea la petición
                    .newBuilder() // Permite construir el objeto paso a paso
                    .uri(URI.create(url)) // Le decimos la URL a la petición y convierte el string en objeto URI
                    .GET() // Métod0 HTTP
                    .build(); // Construye el objeto request

            // ENVÍO DE LA PETICIÓN
            // Cuando llegue la respuesta, trátala como texto.
            // Guarda esa respuesta (que tendrá un String como body) en la variable response
            HttpResponse<String> response =
                    cliente.send(request,HttpResponse.BodyHandlers.ofString());

            // fromJson convierte el String JSON en un objeto Java
            // Le pasamos el body y la clase a la que queremos convertirlo
            RespuestaAPI respuesta = gson.fromJson(response.body(),RespuestaAPI.class);

            // Accedemos al primer usuario del array
            Usuario usuario = respuesta.results[0];

            System.out.println("Nombre: " + usuario.getName().getTitle() + " " +
                    usuario.getName().getFirst() + " " +
                    usuario.getName().getLast());

            System.out.println("Email: " + usuario.getEmail());

            System.out.println("Pais: " + usuario.getLocation().getCountry());

        } catch (IOException e){
            System.out.println("Error IOException");
        } catch (InterruptedException e){
            System.out.println("Error InterruptedException");
        }
    }
}
