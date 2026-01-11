package ejercicio10;

public class Prestamo {

    private String fechaPrestamo;
    private Libro libro;
    private Usuario usuario;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.usuario = usuario;
        this.libro = libro;

        prestamo();
    }

    public void prestamo(){
        System.out.println("Usuario " + usuario.getNombre() + " (Socio " + usuario.getNumeroSocio() + ") intenta tomar prestado " + libro.getTitulo());


        if (libro.estaDisponible()){
            libro.prestar();
            System.out.println("Prestamo realizado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolucion(){
        System.out.println("Usuario " + usuario.getNombre() + " (Socio " + usuario.getNumeroSocio() + ") devuelve " + libro.getTitulo());

        if (!libro.estaDisponible()){
            libro.devolver();
            System.out.println("Libro devuelto");
        }
    }


    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

}
