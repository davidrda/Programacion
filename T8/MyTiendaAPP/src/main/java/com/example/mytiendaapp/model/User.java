package com.example.mytiendaapp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private String nombre, apellido, correo, pass, dni, genero, perfil;

    private int edad;

    @Override
    public String toString() {
        return nombre;
    }
}
