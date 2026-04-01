package com.example.practicalibrosss.controller;

import com.example.practicalibrosss.model.Libro;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class InfoController implements Initializable {

    @FXML
    private Button btnFavoritos;

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

            FileController fileController = new FileController();
            fileController.exportarFavoritos(bibliotecaController.getFavoritos());
        });
    }

    public void setBibliotecaController(BibliotecaController bc) {
        this.bibliotecaController = bc;
    }
}
