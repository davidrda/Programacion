package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comprador {

    private String nombre, apellido, correo, direccion;
    private int telefono;
}
