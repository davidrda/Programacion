package ejercicio11.model;

public class Cliente {

    private String nombre, email, carrito;

    public Cliente() {
    }

    public Cliente(String nombre, String email, String carrito) {
        this.nombre = nombre;
        this.email = email;
        this.carrito = carrito;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCarrito() {
        return carrito;
    }
    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
}
