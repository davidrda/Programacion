package model;

import java.util.Arrays;


public final class Video extends ElementoMultimedia{

    private String director;
    private String[] actores;

    public Video(String id, String titulo, String autor, String formato, double tamanio, String director, String[] actores) {
        super(id, titulo, autor, formato, tamanio);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", tamano=" + tamanio +
                ", director='" + director + '\'' +
                ", actores=" + Arrays.toString(actores) +
                '}';
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }
}
