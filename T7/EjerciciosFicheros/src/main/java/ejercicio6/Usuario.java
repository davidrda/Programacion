package ejercicio6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    private String nombre;
    private int edad;
    private double nota;

    // Si tu clase Usuario NO tiene un toString() sobrescrito, imprimirá algo así: ejercicio6.Usuario@6d06d69c
    @Override
    public String toString() {
        return nombre + "," + edad + "," + nota;
    }
}
