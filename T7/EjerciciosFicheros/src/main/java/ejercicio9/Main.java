package ejercicio9;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.agregarUsuario(new Usuario("David1","Ramirez1","544A"));
        agenda.agregarUsuario(new Usuario("David2","Ramirez2","544B"));
        agenda.agregarUsuario(new Usuario("David3","Ramirez3","544C"));
        agenda.agregarUsuario(new Usuario("David4","Ramirez4","544D"));
        agenda.agregarUsuario(new Usuario("David5","Ramirez5","544A"));
        System.out.println();

        agenda.listarUsuarios();

        agenda.exportarUsuarios("src/main/resources/usuariosEj9.txt");
    }
}
