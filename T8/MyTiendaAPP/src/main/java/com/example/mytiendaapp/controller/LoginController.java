package com.example.mytiendaapp.controller;

import com.example.mytiendaapp.HelloApplication;
import com.example.mytiendaapp.data.DataSet;
import com.example.mytiendaapp.model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField editCorreo;


    @FXML
    private TextField editPass;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    private void actions() {
        btnLogin.setOnAction(event -> {

            // Hay que comprobar que los dos campos estan rellenos (no está hecho)

            // Metes la info en variables
            String email = editCorreo.getText();
            String pass = editPass.getText();
            // hacer el filtrado de la lista o de la BD (SELECT)
            User user = DataSet.getLogin(email, pass);
            // Filtrado: Si loguea -> carga otra ventana. Si no loguea, error
            if (user != null){

                // Crea la ventana
                Stage ventanaPrincipal = new Stage();

                // ========== Crea un scene y carga parte gráfica =============
                try {

                    // Cargo el fichero según el perfil
                    FXMLLoader fxmlLoader;
                    switch (user.getPerfil().toLowerCase()){
                        case "admin":
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                            ventanaPrincipal.setTitle("Formulario de administración");
                            break;
                        case "usuario":
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tienda-view.fxml"));
                            ventanaPrincipal.setTitle("Tienda de productos");
                            break;
                        default:
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                    }

                    // Activo el fichero y se lo asocio a una escena
                    Scene scene = new Scene(fxmlLoader.load());

                    // La escena se la asocio a una ventana
                    ventanaPrincipal.setScene(scene);

                    // Enseño la ventana
                    ventanaPrincipal.show();

                    // La ventana actual (login) la cierro
                    ((Stage)(btnLogin.getScene().getWindow())).close();

                } catch (IOException e) {
                    System.out.println("Error en la carga de la ruta");
                } catch (NullPointerException e) {
                    System.out.println("Error de null");
                }
                // =================================================================
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Fallo");
                alert.setContentText("Fallo en el login");
                alert.show();
            }
        });
    }
}
