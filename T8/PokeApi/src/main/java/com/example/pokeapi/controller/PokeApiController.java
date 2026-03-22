package com.example.pokeapi.controller;

import com.example.pokeapi.PokeService;
import com.example.pokeapi.model.Pokemon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PokeApiController implements Initializable {

    @FXML
    private TextField editPokemon;

    @FXML
    private Button buscarPokemon;

    // Servicio para llamar a la API
    private PokeService service;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Se ejecuta automáticamente al cargar la ventana
        instances(); // crear objetos
        actions(); // configurar eventos

    }

    private void instances() {
        // Creamos el servicio (API) una vez
        service = new PokeService();
    }

    private void actions() {

        // Cuando haces click en el botón... ⬇️
        buscarPokemon.setOnAction(event -> {

            try {
                // Leer lo que escribe el usuario
                String nombre = editPokemon.getText();

                // Comprueba si está vacio
                if (nombre.isEmpty()){
                    System.out.println("No has introducido nada");
                    return;
                }

                // Llamas a la API
                Pokemon pokemon = service.buscarPokemon(nombre);

                // Compruebas si existe el pokemon
                if (pokemon == null) {
                    System.out.println("Pokemon no encontrado");
                    return;
                }

                // Cargas la ventana FXML
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/com/example/pokeapi/pokemon-view.fxml"));

                Parent root = loader.load();

                // Obtienes el controller de la nueva ventana
                PokeController pokeController = loader.getController();

                // Le pasas el pokemon
                pokeController.setPokemon(pokemon);

                // Creas y muestras la ventana
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Detalle Pokemon");
                stage.show();

            } catch (IOException e){
                System.out.println(e.getMessage());
            }

        });
    }
}
