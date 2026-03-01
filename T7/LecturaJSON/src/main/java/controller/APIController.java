package controller;

import com.google.gson.Gson;
import model.Clasificacion;
import model.Liga;
import model.Equipo;
import model.Team;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private String urlBase = "https://www.thesportsdb.com/api/v1/json/123/";

    public void obtenerLigas() {
        String urlLigas = urlBase + "all_leagues.php";
        try {
            Gson gson = new Gson(); // Sirve para convertir JSON -> objeto Java

            // HttpClient es una clase que permite hacer peticiones HTTP
            // HttpClient.newHttpClient() es el métod0 que crea el cliente
            HttpClient client = HttpClient.newHttpClient(); // Es como abrir el navegador pero desde Java

            // CONTRUCCIÓN DE LA PETICIÓN
            HttpRequest request = HttpRequest // Clase que crea la petición
                    .newBuilder() // Permite construir el objeto paso a paso
                    .uri(URI.create(urlLigas)) // Le decimos a la petición a qué URL va y convierte el string en un objeto URI
                    .GET().build(); // .GET -> Métod0 HTTP   .build() -> Construye el objeto request

            /* ENVIAR LA PETICIÓN
            Envía la petición al servidor.
            Cuando llegue la respuesta, trátala como texto.
            Guarda esa respuesta (que tendrá un String como body) en la variable response.*/
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            // CONVERTIR EL TEXTO EN JSONObject
            // response.body() -> Devuelve el JSON en formato String
            JSONObject objectLigas = new JSONObject(response.body());

            // Dentro del JSON hay una clave llamada "leagues" que es un array de 10 objetos
            JSONArray arrayLigas = objectLigas.getJSONArray("leagues");


            /*
            Dentro del for pasa esto:

            1️⃣ Coges un objeto JSON del array
            2️⃣ Lo conviertes a texto
            3️⃣ Gson lo transforma en objeto Java
            4️⃣ Ya puedes usarlo como cualquier objeto normal
             */
            for (int i = 0; i < arrayLigas.length(); i++) {
                JSONObject ligaJSON = arrayLigas.getJSONObject(i); // Dame el objeto que está en posición i del array
                Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class); // gson.fromJson( JSON_en_texto , Clase_destino )
                System.out.println(liga); // Se necesita que la clase Liga tenga toString
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void obtenerClasificacion(String id) {

        /*
        Este métod0 hace:
        1. Construye URL con parámetro
        2. Hace petición GET
        3. Recibe JSON
        4. Extrae array "table"
        5. Recorre equipos
        6. Convierte JSON → objetos Equipo
        7. Imprime datos formateados
         */

        String urlClasificacion = urlBase + "lookuptable.php?l=" + id; // El id es de una liga diferente

        try {
            Gson gson = new Gson(); // Objeto JSon -> Objeto Java en el for

            HttpClient client = HttpClient.newHttpClient(); // Objeto que sabe hacer peticiones HTTP

            // =========================================================================================
            // CONSTRUCCIÓN DE LA PETICIÓN - > Crear builder, poner URL, indicar GET, construir objeto final
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET().build();

            // =========================================================================================
            // ENVÍO DE LA PETICIÓN -> Envía petición, recibe respuesta, guarda body como texto (String).
            // El texto será JSON
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            // =========================================================================================
            // El BODY DE LA PETICIÓN SE CONVIERTE EN JSONOBJECT (Objeto manipulable)
            JSONObject objectClasificacion = new JSONObject(response.body());

            // =========================================================================================
            // La clave "table" es un objeto con un array de 5 objetos, con esto obtienes el array
            JSONArray arrayEquipos =
                    objectClasificacion.getJSONArray("table");

            // =========================================================================================
            // Coges un objeto individual del array (cada equipo es un objeto del array)
            // Ese objeto lo pasas a la clase Equipo, entonces cada equipo es un objeto Java
            // Imprimes sus datos
            for (int i = 0; i < arrayEquipos.length(); i++) {
                JSONObject equipoJSON = arrayEquipos.getJSONObject(i);
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.printf("%s - %s - %s - %s - %s%n",
                        equipo.getIntRank(),
                        equipo.getStrTeam(),
                        equipo.getIntWin(),
                        equipo.getIntDraw(),
                        equipo.getIntLoss());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerClasificacionCompleta(String id) {

        try {

            // 1️⃣ Construimos la URL completa con el parámetro de la liga
            String urlClasificacion = urlBase + "lookuptable.php?l=" + id;


            // 2️⃣ Objeto que convierte JSON ↔ Objetos Java
            Gson gson = new Gson();


            // 3️⃣ Cliente que permite realizar peticiones HTTP
            HttpClient client = HttpClient.newHttpClient();


            // 4️⃣ Construcción de la petición HTTP (Patrón Builder)
            // - Indicamos la URL
            // - Indicamos que el method es GET
            // - Construimos el objeto final request
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET()
                    .build();


            // 5️⃣ Enviamos la petición al servidor
            // - Recibimos la respuesta
            // - El body se obtiene en formato String (JSON en texto)
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());


            // 6️⃣ Convertimos el String JSON en un objeto JSON manipulable
            JSONObject objectClasificacion =
                    new JSONObject(response.body());


            // 7️⃣ Convertimos T0D0 el objeto JSON directamente
            // en nuestra clase Clasificacion
            // Esto funciona porque la estructura del JSON coincide
            // con la clase Clasificacion (que contiene "table")
            Clasificacion clasificacion =
                    gson.fromJson(objectClasificacion.toString(), Clasificacion.class);


            // 8️⃣ Recorremos el array "table" que está dentro de Clasificacion
            for (int i = 0; i < clasificacion.getTable().length; i++) {

                // Cada posición del array es un objeto Team
                Team team = clasificacion.getTable()[i];

                // Mostramos los datos formateados
                System.out.printf(
                        "%s - %s - %s - %s - %s%n",
                        team.getIntRank(),
                        team.getStrTeam(),
                        team.getIntWin(),
                        team.getIntDraw(),
                        team.getIntLoss()
                );
            }

        } catch (IOException e) {

            // Error de conexión o entrada/salida
            throw new RuntimeException("Error de conexión con la API", e);

        } catch (InterruptedException e) {

            // Si el hilo es interrumpido durante la petición
            Thread.currentThread().interrupt(); // buena práctica
            throw new RuntimeException("La petición fue interrumpida", e);
        }
    }

}
