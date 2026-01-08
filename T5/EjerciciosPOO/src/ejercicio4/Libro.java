package ejercicio4;

public class Libro {

    private String titulo = "El Quijote";
    private String autor = "Miguel de Cervantes";
    private int paginas = 300;


    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + paginas + " páginas";
    }
}
