package com.example.pokeapi.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


// Lanzador creando la primera ventana (Stage), poniendole una escena (formada por un fxml)

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Carga la parte gráfica en el FXMLoader
        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("/com/example/pokeapi/main-view" +
                        ".fxml"));

        // Crea la escena y le asocia la parte gráfica
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);

        // Pone la escena en la ventana
        stage.setScene(scene);

        // Pone el título en la ventana
        stage.setTitle("Poke Api");

        // Muestra la ventana
        stage.show();
    }
}
