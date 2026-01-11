package ejercicio11;

import ejercicio11.controller.Carrito;
import ejercicio11.model.Producto;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- TIENDA ONLINE ---");

        // Se crean los productos
        Producto portatil = new Producto(1, 12.99, "Portatil", 10);
        Producto teclado = new Producto(2, 20.99, "Teclado", 2);
        Producto monitor = new Producto(3, 159.49, "Monitor", 7);
        Producto raton = new Producto(4, 9.99, "Raton", 1);

        // Creamos el carrito
        Carrito carrito = new Carrito();

        // Se añaden productos al carrito
        carrito.anadirProducto(portatil,4);
        carrito.anadirProducto(raton,1);
    }
}
