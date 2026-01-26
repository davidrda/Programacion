package model;


public final class Libro extends ElementoMultimedia{

    private String isbn;
    private int numPaginas;


    public Libro(String id, String titulo, String autor, String formato, double tamanio, String isbn, int numPaginas) {
        super(id, titulo, autor, formato, tamanio);
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", tamaño=" + tamanio +
                ", isbn='" + isbn + '\'' +
                ", páginas=" + numPaginas +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
