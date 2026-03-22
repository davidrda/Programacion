package com.example.mytiendaapp.controller;

import com.example.mytiendaapp.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private CheckBox checkVerLista;

    @FXML
    private ComboBox<String> comboTipo;
    // lista de elementos

    private ObservableList<String> perfiles;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editDni;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    @FXML
    private Spinner<?> spinnerEdad;
    // modelo de elementos
    private SpinnerValueFactory modelEdad;

    private DropShadow shadow;

    private ToggleGroup grupoGenero;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances();
        initGUI();
        actions();
    }

    private void initGUI() {
        spinnerEdad.setValueFactory(modelEdad);
        grupoGenero.getToggles().addAll(radioMasculino,radioFemenino);
        comboTipo.setItems(perfiles);
    }

    private void instances() {
        modelEdad = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 18, 1);
        perfiles = FXCollections.observableArrayList();
        perfiles.addAll("Administrador", "Usuario", "Trabajador");
        shadow = new DropShadow();
        grupoGenero = new ToggleGroup();
    }

    private void actions() {
        btnAgregar.setOnAction(e -> {
            String nombre = editNombre.getText();
            String apellido = editApellido.getText();
            String correo = editCorreo.getText();
            String dni = editDni.getText();
            String pass = editPass.getText();
            String perfil = comboTipo.getSelectionModel().getSelectedItem();
            int edad = (int) spinnerEdad.getValue();
            String genero = ((RadioButton)(grupoGenero.getSelectedToggle())).getText();

            System.out.println("Pulsado el boton agregar");
            e.getSource();

            User user = new User(nombre, apellido, correo, pass, dni, genero, perfil, edad);
        });
        btnVaciar.setOnAction(event -> {
            System.out.println("Pulsado el boton vaciar");
            event.getSource();
        });
        btnComprobar.setOnAction(event -> {
            System.out.println("Pulsado el boton comprobar");
            event.getSource();
        });
        // btnComprobar.setOnMouseEntered(new ManejoRaton());
        // btnVaciar.setOnMouseEntered(new ManejoRaton());
        // btnAgregar.setOnMouseEntered(new ManejoRaton());
        // btnAgregar.setOnMouseExited(new ManejoRaton());
        // btnVaciar.setOnMouseExited(new ManejoRaton());
        // btnComprobar.setOnMouseExited(new ManejoRaton());
    }
    
    class ManejoRaton implements EventHandler<MouseEvent>{

        @Override
        public void handle(MouseEvent mouseEvent) {
            if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED ) {

                ((Button) mouseEvent.getSource()).setEffect(shadow);

                if (mouseEvent.getSource() == btnComprobar) {
                    System.out.println("Evento raton entrando bComprobar");
                } else if (mouseEvent.getSource() == btnAgregar) {
                    System.out.println("Evento raton entrando bAgregar");
                } else if (mouseEvent.getSource() == btnVaciar) {
                    System.out.println("Evento raton entrando");
                }
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button) mouseEvent.getSource()).setEffect(null);
            }
        }
    } 
    

}
