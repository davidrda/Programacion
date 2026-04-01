package com.example.practicalibrosss.controller;


import com.example.practicalibrosss.model.Libro;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BusquedaController implements Initializable {

    @FXML
    private Button btnBuscar;

    @FXML
    private TextField editLibro;

    private BibliotecaController bibliotecaController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        instances();
        actions();
        System.out.println(btnBuscar);

    }

    private void actions() {
        btnBuscar.setOnAction(event -> {
            buscarLibro();
        });
    }

    private void instances() {
        bibliotecaController = new BibliotecaController();
    }

    private void buscarLibro() {

        String texto = editLibro.getText().trim();
        if (texto.isEmpty()) {
            System.out.println("Valor vacío");
            return;
        }

        // Guarda el .getText de editLibro en la variable id
        int id = 0;
        try {
            id = Integer.parseInt((editLibro.getText().trim()));
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número válido");
        }

        // Primero se cargan los libros
        if (bibliotecaController.getLibros().isEmpty()) {
            bibliotecaController.importarLibros();
        }

        // Se busca libro por id, cogiendo el editLibro.getText
        Libro libro = bibliotecaController.buscarLibroPorId(id);

        if (libro != null) {
            abrirVistaInfo(libro);
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    private void abrirVistaInfo(Libro libro) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/practicalibrosss/info.view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            // Se obtiene el controller de la nueva vista
            InfoController infoController = fxmlLoader.getController();

            // Pasar el libro
            infoController.setLibro(libro);
            infoController.setBibliotecaController(bibliotecaController);

            // Cambiar ventana
            Stage stage = (Stage)btnBuscar.getScene().getWindow();
            stage.setTitle("Información del libro");
            stage.setScene(scene);
        } catch (IOException e){
            System.out.println("Error de input/output");
        }
    }
}
