package model;

public final class Audio extends ElementoMultimedia{

    private double duracion; // en minutos
    private String soporte; // CD, Streaming, MP3, etc

    public Audio(String id, String titulo, String autor, String formato, double tamanio, double duracion,
                 String soporte) {
        super(id, titulo, autor, formato, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", tamano=" + tamanio +
                ", duracion=" + duracion +
                ", soporte='" + soporte + '\'' +
                '}';
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
