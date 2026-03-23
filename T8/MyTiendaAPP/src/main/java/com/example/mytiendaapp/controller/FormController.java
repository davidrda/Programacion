package com.example.mytiendaapp.controller;

import com.example.mytiendaapp.model.User;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import lombok.Value;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private ListView<User> listViewUsuarios;

    private  ObservableList<User> listaUsers; // Conectado a ListView

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private Button btnEliminar;

    @FXML
    private CheckBox checkVerLista;

    @FXML
    private ComboBox<String> comboTipo;
    // lista de elementos

    private ObservableList<String> perfiles;
    // Conectado a ComboBox

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
    private Spinner<?> spinnerEdad;
    // modelo de elementos
    private SpinnerValueFactory modelEdad; // conectado a spinnerEdad

    private DropShadow shadow;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    private ToggleGroup grupoGenero; // radioFemenino o radioMasculino

    // initialize carga primero el FXML y luego ejecuta su métod0
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances(); // Creas los objetos
        initGUI(); // Configuras la interfaz
        actions(); // Asignas eventos
    }


    // Creas datos en memoria antes de que carguen en pantalla
    private void instances() {

        // Configuras los valores del Spinner
        modelEdad = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 18, 1);

        // Creas un observableList de perfiles y añades después
        perfiles = FXCollections.observableArrayList();
        perfiles.addAll("Administrador", "Usuario", "Trabajador");

        // Creas un observableList de listaUsers
        listaUsers = FXCollections.observableArrayList();

        // Creas el objeto DropShadow
        shadow = new DropShadow();

        // Creas el Toggle grupoGenero
        grupoGenero = new ToggleGroup();
    }

    // Esto es el enchufe entre datos y pantalla
    private void initGUI() {

        // A la listView le añades la listaUsers
        listViewUsuarios.setItems(listaUsers);

        // Al spinner le añades modelEdad
        spinnerEdad.setValueFactory(modelEdad);

        // Añades al toggle radioMasculino y radioFemenino
        grupoGenero.getToggles().addAll(radioMasculino, radioFemenino);

        //  Al comboTipo le añades los perfiles
        comboTipo.setItems(perfiles);

        // Si check está seleccionado, enseñas listView a la derecha, sino null
        if (checkVerLista.isSelected()) {
            borderGeneral.setRight(listViewUsuarios);
        } else {
            borderGeneral.setRight(null);
        }
    }

    private void actions() {
        // ====== Directa ======
        btnAgregar.setOnAction(e -> {

            // seleccionado -> toggle seleccionado
            Toggle seleccionado = grupoGenero.getSelectedToggle();
            String genero = null;

            // si el toggle está seleccionado, genero coge el texto del radio selccionado
            if (seleccionado != null) {
                genero = ((RadioButton)seleccionado).getText();
            }

            // Si algún hueco queda vacío...
            if (editNombre.getText().isEmpty()
                    || editPass.getText().isEmpty()
                    || editApellido.getText().isEmpty()
                    || editCorreo.getText().isEmpty()
                    || grupoGenero.getSelectedToggle() == null
                    || comboTipo.getSelectionModel().getSelectedIndex() == -1
            ) {
                // Enseña este dialogo !!!
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Faltan datos");
                alert.setContentText("Por favor comprueba todos los datos");
                alert.show();
            } else {
                // Si no está vacio, mete cada info en Java
                String nombre = editNombre.getText();
                String apellido = editApellido.getText();
                String correo = editCorreo.getText();
                String dni = editDni.getText();
                String pass = editPass.getText();
                String perfil = comboTipo.getSelectionModel().getSelectedItem();
                int edad = (int) spinnerEdad.getValue();

                // Y crea un user, agregalo a la lista, y enseña el dialogo
                User user = new User(nombre, apellido, correo, pass, dni, genero, perfil, edad);
                listaUsers.add(user);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Usuario añadido");
                alert.setContentText("Usuario añadido con éxito");
                alert.show();
                clearFields();
            }


        });

        btnVaciar.setOnAction(event -> {
            clearFields();
        });
        btnComprobar.setOnAction(event -> {
            User user = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (user == null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Error");
                alert.setContentText("No hay nada seleccionado");
                alert.show();
            } else {
                System.out.println("Nombre: "+user.getNombre());
                System.out.println("Apellido: "+user.getApellido());
                System.out.println("Correo: "+user.getCorreo());
            }
        });

        btnEliminar.setOnAction(event -> {
            User user = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (user == null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Error");
                alert.setContentText("No hay nada seleccionado");
                alert.show();
            } else {
                listaUsers.remove(user);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Eliminado");
                alert.setContentText("Usuario eliminado con exito");
                alert.show();
                listViewUsuarios.getSelectionModel().select(-1);

            }
        });

        // ======= Indirecta ========
        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());
        // ===== Propiedad =====
        checkVerLista.selectedProperty()
                .addListener((obs, oldVal, newVal) -> {
            if (newVal) { //checked
                borderGeneral.setRight(listViewUsuarios);
            } else { // unchecked
                borderGeneral.setRight(null);
            }
        });

    }

    private void clearFields(){
        editNombre.clear();
        editApellido.clear();
        editCorreo.clear();
        editDni.clear();
        editPass.clear();
        comboTipo.getSelectionModel().select(-1);
        grupoGenero.selectToggle(null);
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent mouseEvent) {
            if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {

                ((Button) mouseEvent.getSource()).setEffect(shadow);

                if (mouseEvent.getSource() == btnComprobar) {
                    System.out.println("Evento raton entrando bComprobar");
                } else if (mouseEvent.getSource() == btnAgregar) {
                    System.out.println("Evento raton entrando bAgregar");
                } else if (mouseEvent.getSource() == btnVaciar) {
                    System.out.println("Evento raton entrando bVaciar");
                } else if (mouseEvent.getSource() == btnEliminar) {
                    System.out.println("Evento raton entrando bEliminar");
                }
            } else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button) mouseEvent.getSource()).setEffect(null);
            }
        }
    }


}
