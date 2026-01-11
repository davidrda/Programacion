package ejercicio11.model;

public class Producto {

    private int codigo, stock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, double precio, String nombre, int stock) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
