module com.example.practicalibrosss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicalibrosss to javafx.fxml;
    exports com.example.practicalibrosss;
}