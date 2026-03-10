package ejercicio9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Agenda {

    private List<Usuario> listaUsuarios;

    public Agenda() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario){

        for (Usuario u : listaUsuarios){

            if (usuario.getDni().equals(u.getDni())){
                System.out.println("Este usuario ya existe");
                return;
            }

        }

        System.out.println("Usuario añadido");
        listaUsuarios.add(usuario);
    }

    public void listarUsuarios(){

        for (Usuario u : listaUsuarios){
            System.out.println("Nombre = " + u.getNombre());
            System.out.println("Apellido = " + u.getApellido());
            System.out.println("DNI = " + u.getDni());
            System.out.println();
        }

    }

    public void exportarUsuarios(String ruta){

        File file = new File(ruta);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            for (Usuario u : listaUsuarios){
                bufferedWriter.write(u.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error en el input/output del archivo");
        }
    }
}
