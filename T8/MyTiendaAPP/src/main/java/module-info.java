
// Configuraciones y usos de cada uno de los modulos de la aplicación desarrollada

module com.example.mytiendaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires org.json;


    opens com.example.mytiendaapp to javafx.fxml;
    exports com.example.mytiendaapp;

    exports com.example.mytiendaapp.model;
    opens com.example.mytiendaapp.model to javafx.fxml;

    exports com.example.mytiendaapp.controller;
    opens com.example.mytiendaapp.controller to javafx.fxml, org.json;
}