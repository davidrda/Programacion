package ejercicio10;

import javax.print.attribute.standard.DocumentName;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Don Quijote", "Miguel de Cervantes", 1, true));
        libros.add(new Libro("1984", "Orwell", 2, true));
        libros.add(new Libro("Cien años de soledad", "García Márquez", 3, false));
        libros.add(new Libro("Naruto", "David Ramirez", 4, true));
        libros.add(new Libro("Gracias a ti", "Vanessa Garcia", 5, false));
        libros.add(new Libro("Dragon Ball", "Akira Toriyama", 6, true));

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("David Ramirez", 101));
        usuarios.add(new Usuario("Adrian Garcia", 102));
        usuarios.add(new Usuario("Sergio Gasco", 103));
        usuarios.add(new Usuario("Fran Cortes", 104));
        usuarios.add(new Usuario("Vanessa Garcia", 105));




        System.out.println("--- BIBLIOTECA ---");
        for (Libro libro : libros){
            if (libro.estaDisponible()){
                System.out.println("- "+libro.getTitulo()+", "+libro.getAutor()+", ISBN: "+libro.getISBN());
            }
        }
        System.out.println();

        Prestamo prestamo1 = new Prestamo(libros.get(0),usuarios.get(0),"27/10/2025");
        System.out.println();
        prestamo1.devolucion();

        System.out.println();
        System.out.println("Libros disponibles ahora: ");
        for (Libro libro : libros){
            if (libro.estaDisponible()){
                System.out.println("- "+libro.getTitulo()+", "+libro.getAutor()+", ISBN: "+libro.getISBN());
            }
        }

    }
}
