module com.example.pokeapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires static lombok;
    requires java.net.http;
    requires java.xml;

    opens com.example.pokeapi.controller to javafx.fxml;
    opens com.example.pokeapi.model to com.google.gson;
    opens com.example.pokeapi to javafx.fxml;
    exports com.example.pokeapi;
    exports com.example.pokeapi.view;
    opens com.example.pokeapi.view to javafx.fxml;
}