package com.example.mytiendaapp.controller;

import com.example.mytiendaapp.model.Product;
import com.example.mytiendaapp.model.ProductResponse;
import com.google.gson.Gson;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ResourceBundle;

public class TiendaController implements Initializable {

    @FXML
    private Button btnCerrar;

    @FXML
    private Button btnCompra;

    @FXML
    private Button btnDetalle;

    @FXML
    private TableColumn<Product, String> columnaNombre; // <Qué le das, en qué formato>

    @FXML
    private TableColumn<Product, Number> columnaPrecio; // <Qué le das, en qué formato>

    @FXML
    private TableColumn<Product, Number> columnaStock; // <Qué le das, en qué formato>

    @FXML
    private TextField editFiltro;

    @FXML
    private TableView<Product> tablaProductos;
    private ObservableList<Product> listProducts;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances(); // Inicializas
        initGUI(); // Configuras la tabla
        loadJSONProducts(); // Carga los datos del JSON
        // actions();
    }

    /*private void actions() {
        btnCompra.setOnAction(event -> {

        });
    }*/

    private void initGUI() {
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("title")); // muestra "title" del JSON en la GUI
        columnaPrecio.setCellValueFactory(new PropertyValueFactory<>("price")); // muestra "price" del JSON en la GUI
        columnaStock.setCellValueFactory(new PropertyValueFactory<>("stock")); // muestra "stock" del JSON en la GUI
        tablaProductos.setItems(listProducts); // pones la lista de productos en la tabla
    }

    private void instances() {
        listProducts = FXCollections.observableArrayList();
    }

    private void loadJSONProducts() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest  httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create("https://dummyjson.com/products"))
                .GET() // petición por defecto
                .build();
        try {
            HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String body = httpResponse.body();
            Gson gson = new Gson();
            ProductResponse productResponse = gson.fromJson(body, ProductResponse.class);
            listProducts.setAll(productResponse.getProducts()); // Metes el JSON en listProducts

        } catch (IOException e) {
            System.out.println("Error de IOExc");
        } catch (InterruptedException e) {
            System.out.println("Error de InterruptedExc");
        }


    }
}
