package com.example.mytiendaapp.data;

import com.example.mytiendaapp.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Optional;

public class DataSet {

    // al ser static, la lista pertenece a la clase y no hace falta declarar el objeto en otras clases
    static private ObservableList<User> listUsers =
            FXCollections.observableArrayList(new User("Admin", "Admin", "admin@admin.com",
                    "admin", "1234", "Femenino", "admin", 50));

    public static ObservableList<User> getListUsers() {
        return listUsers;
    }

    public static void addUser(User user) {
        // lógica -> no se pueden meter dos usuarios con el mismo correo
        listUsers.add(user);
    }

    public static User getLogin(String email, String pass) {

        Optional<User> userOptional = listUsers.stream()
                .filter(item -> item.getCorreo().equals(email) && item.getPass().equals(pass))
                .findFirst();

        return userOptional.orElse(null);
    }
}
