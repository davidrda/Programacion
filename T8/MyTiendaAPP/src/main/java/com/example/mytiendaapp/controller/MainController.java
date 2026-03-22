package com.example.mytiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    // tener una variable por cada uno de los elementos del fxml
    // document.querySelector('#id')
    // document.getElementById("id")

    @FXML
    private Button botonSaludar;

    @FXML
    private TextField editNombre;

    @FXML
    private Text textoSaludo;

    // Cuando el FXML está cargado y conectado -> ejecuta el metodo
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // todos los códigos que yo pongan aquí, se ejecuta nada más cargar la parte fxml
        botonSaludar.setOnAction(actionEvent -> {
            String texto = editNombre.getText();
            if (texto.isEmpty()){
                textoSaludo.setText("No hay nadie a quien saludar");
            } else {
                textoSaludo.setText("Hola "+texto+"!");
            }
        });
    }

    /*
        1. Se carga el FXML
        2. JavaFX crea los componentes
        3. Inyecta los @FXML en el controller
        4. Llama automáticamente a initialize()
        5. Dentro de initialize → defines el comportamiento del botón
        6. Usuario escribe en el TextField
        7. Usuario hace click
        8. Se ejecuta el código del botón
        9. Se actualiza el texto en pantalla
     */

}
