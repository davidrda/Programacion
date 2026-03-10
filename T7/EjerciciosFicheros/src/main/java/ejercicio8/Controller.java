package ejercicio8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    public void contadorPalabras(String ruta){

        File file = new File(ruta);
        HashMap <String, Integer> mapa = new HashMap<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String linea;
            String[] palabras;
            int contador = 0;

            while ((linea = bufferedReader.readLine()) != null){

                linea = linea.toLowerCase();
                linea = linea.replaceAll("[^a-záéíóúüñ ]", "");

               palabras =  linea.split("\\s+");

               for (String palabra : palabras){

                   contador++;

                   if (mapa.containsKey(palabra)){ // Si existe en el mapa, se actualiza sumándole +1
                       mapa.put(palabra, mapa.get(palabra) + 1);
                   } else { // Si no existe, se crea con el valor 1 predeterminado
                       mapa.put(palabra, 1);
                   }
               }
            }

            System.out.println("Número total de palabras: " + contador);

            // Se pasa el mapa a lista
            List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());

            // Se ordena la lista
            lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("Las 5 palabras más frecuentes: ");

            // Recorre máximo 5 elementos y también comprueba lista.size para evitar errores si hay menos de 5 palabras
            for (int i = 0; i < 5 && i < lista.size(); i++) {


                Map.Entry<String, Integer> entry = lista.get(i);

                System.out.println((i+1) + ". " + entry.getKey() + ": " + entry.getValue() + " veces");
            }

        } catch (IOException e){
            System.out.println("Error en la lectura del archivo");
        }
    }
}
