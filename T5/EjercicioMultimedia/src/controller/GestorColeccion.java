package controller;

import model.Audio;
import model.ElementoMultimedia;
import model.Libro;
import model.Video;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorColeccion {

    private ArrayList<ElementoMultimedia> coleccion;

    private Scanner sc = new Scanner(System.in);

    public GestorColeccion() {
        coleccion = new ArrayList<>();
    }

    public boolean existeId(String id) {
        for (ElementoMultimedia e : coleccion) {
            if (e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void anadirElemento() {
        System.out.println("¿Qué quieres añadir?");
        System.out.println("1. Libro");
        System.out.println("2. Vídeo");
        System.out.println("3. Audio");

        int opcion = sc.nextInt();
        sc.nextLine();

        String id;
        do {
            System.out.println("Id: ");
            id = sc.nextLine();

            if (existeId(id)) {
                System.out.println("Ya existe un elemento con ese id");
            }
        } while (existeId(id));

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Formato: ");
        String formato = sc.nextLine();

        System.out.print("Tamaño: ");
        double tamanio = sc.nextDouble();

        sc.nextLine();


        switch (opcion) {
            case 1 -> { // LIBRO
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();

                System.out.print("Número de páginas: ");
                int numPaginas = sc.nextInt();

                ElementoMultimedia elemento = new Libro(id, titulo, autor, formato, tamanio, isbn, numPaginas);
                coleccion.add(elemento);

                System.out.println("Libro añadido correctamente");
            }
            case 2 -> { // VIDEO
                System.out.print("Director: ");
                String director = sc.nextLine();

                System.out.print("Número de actores: ");
                int numActores = sc.nextInt();
                sc.nextLine();

                String[] actores = new String[numActores];
                for (int i = 0; i < numActores; i++) {
                    System.out.print("Actor " + (i + 1) + ": ");
                    actores[i] = sc.nextLine();
                }

                ElementoMultimedia elemento = new Video(id, titulo, autor, formato, tamanio, director, actores);
                coleccion.add(elemento);
                System.out.println("Video añadido correctamente");
            }
            case 3 -> { // AUDIO
                System.out.println("Duracion en minutos: ");
                int duracion = sc.nextInt();
                sc.nextLine();

                double duracionHoras = duracionTotal(duracion); // Se pasa a horas

                System.out.println("Soporte: ");
                String soporte = sc.nextLine();

                ElementoMultimedia elemento = new Audio(id, titulo, autor, formato, tamanio, duracionHoras,
                        soporte);
                coleccion.add(elemento);
                System.out.println("Audio añadido correctamente");
            }
            default -> {
                System.out.println("Opción no válida");
            }
        }
    }

    public double duracionTotal(int duracion) {
        return (double) duracion / 60;
    }

    public void eliminarElemento(String id) {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getId().equals(id)) {
                coleccion.remove(i);
                System.out.println("Elemento eliminado.");
                return;
            }
        }
        System.out.println("No hay ningún elemento asociado a ese id.");

    }

    public void listarElementos() {
        if (coleccion.isEmpty()) {
            System.out.println("La colección está vacía.");
            return;
        }

        for (ElementoMultimedia e : coleccion) {
            System.out.println(e);
        }
    }

    public void buscarPorAutor(String autor) {
        System.out.println("Buscando por el autor " + autor);
        boolean encontrado = false;

        for (ElementoMultimedia e : coleccion) {
            if (e instanceof Libro && e.getAutor().equals(autor)) {
                System.out.println(e.getTitulo());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay libros de ese autor.");
        }
    }

    public void buscarPorActor(String actor) {
        System.out.println("Buscando por el actor " + actor);
        boolean encontrado = false;

        for (ElementoMultimedia e : coleccion){
            if (e instanceof Video) { // Si de cada elemento de colección (e), hay algún Video, cambia de e a video
                // (Video)
                Video video = (Video) e;

                for (int i = 0; i < video.getActores().length; i++) {
                    if (video.getActores()[i].equals(actor)) {
                        System.out.println(video.getTitulo());
                        encontrado = true;
                        break;
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado vídeos con ese actor.");
        }
    }

    public void buscarPorDirector(String director) {
        System.out.println("Buscando por el director " + director);
        boolean encontrado = false;

        for (ElementoMultimedia e : coleccion){
            if (e instanceof Video) {
                Video video = (Video) e;

                if (video.getDirector().equals(director)){
                    System.out.println(video.getTitulo());
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado vídeos con ese director.");
        }
    }

    public void menu(){
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Listar elementos");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Buscar por actor");
            System.out.println("6. Buscar por director");
            System.out.println("0. Salir");

            System.out.println("\nIndica la acción:");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1-> {
                    anadirElemento();
                }
                case 2-> {
                    System.out.println("Id a eliminar: ");
                    String id = sc.nextLine();
                    eliminarElemento(id);
                }
                case 3-> {
                    listarElementos();
                }
                case 4-> {
                    System.out.println("Indica el autor: ");
                    String autor = sc.nextLine();
                    buscarPorAutor(autor);
                }
                case 5-> {
                    System.out.println("Indica el actor: ");
                    String actor = sc.nextLine();
                    buscarPorAutor(actor);
                }
                case 6-> {
                    System.out.println("Indica el director: ");
                    String director = sc.nextLine();
                    buscarPorAutor(director);
                }
                case 0-> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);


    }


}
