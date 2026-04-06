package com.example.practicalibrosss.controller;

import com.example.practicalibrosss.model.Libro;
import com.example.practicalibrosss.service.BibliotecaController;
import com.example.practicalibrosss.service.FileController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InfoController implements Initializable {

    @FXML
    private Button btnFavoritos;

    @FXML
    private Button btnAtras;

    @FXML
    private Label lblIsbn;

    @FXML
    private Label lblPages;

    @FXML
    private Label lblPublisher;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblYear;

    private Libro libro;

    private BibliotecaController bibliotecaController;

    public void setLibro(Libro libro) {
        this.libro = libro;
        mostrarDatos();
    }

    private void mostrarDatos() {
        lblTitulo.setText(libro.getTitle());
        lblYear.setText(String.valueOf(libro.getYear()));
        lblPages.setText(String.valueOf(libro.getPages()));
        lblPublisher.setText(libro.getPublisher());
        lblIsbn.setText(libro.getIsbn());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    private void actions() {
        btnFavoritos.setOnAction(event -> {

            if (bibliotecaController == null || libro == null) {
                System.out.println("Error, datos no inicializados");
                return;
            }
            bibliotecaController.addFavorito(libro.getId());
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("¡Libro añadido!");
            alert.setContentText("Has añadido el libro a favoritos");
            alert.show();

            FileController fileController = new FileController();
            fileController.exportarFavoritos(bibliotecaController.getFavoritos());
        });

        btnAtras.setOnAction(event -> {
            abrirVistaBusqueda();
        });
    }

    private void abrirVistaBusqueda() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/practicalibrosss/busqueda-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            BusquedaController busquedaController = fxmlLoader.getController();
            busquedaController.setBibliotecaController(this.bibliotecaController);

            Stage stage = (Stage) btnAtras.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e){
            System.out.println("Error de input/output");
        }
    }

    public void setBibliotecaController(BibliotecaController bc) {
        this.bibliotecaController = bc;
    }
}
