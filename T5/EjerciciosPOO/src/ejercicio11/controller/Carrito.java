package ejercicio11.controller;

import ejercicio11.model.Producto;
import java.util.Map;
import java.util.HashMap;

public class Carrito {

    HashMap<Producto,Integer> carrito;

    public Carrito() {
        carrito = new HashMap<>();
    }

    public Carrito(HashMap<Producto, Integer> carrito) {
        this.carrito = carrito;
    }

    public void anadirProducto(Producto producto, int cantidad){
        // no se puede poner una cantidad no válida
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida");
            return;
        }

        // debe haber stock disponible
        if (producto.getStock() < cantidad) {
            System.out.println("Stock insuficiente");
            return;
        }

        // si el producto ya está en el carrito, se suma cantidad
        if (carrito.containsKey(producto)) {
            int cantidadActual = carrito.get(producto);
            carrito.put(producto, cantidadActual + cantidad);
        } else { // si no, se pone en el carrito
            carrito.put(producto,cantidad);
        }

        System.out.printf("Añadiendo %s (%.2f) x%d al carrito...%n",producto.getNombre(),producto.getPrecio(),cantidad);
    }

    public void eliminarProducto (Producto producto) {
        if (carrito.containsKey(producto)) {
            carrito.remove(producto);
            System.out.printf("Eliminando %s del carrito....%n",producto.getNombre());
        } else {
            System.out.println("El producto no está en el carrito");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Map.Entry<Producto, Integer> entry : carrito.entrySet()) {
            Producto p = entry.getKey();
            int cantidad = entry.getValue();
            total += p.getPrecio() * cantidad;
        }

        return total;
    }

    public void finalizarCompra(){
        System.out.println("Finalizando compra...");

        for (Map.Entry<Producto, Integer> entry : carrito.entrySet()) {
            Producto p = entry.getKey();
            int cantidad = entry.getValue();
            p.setStock(p.getStock() - cantidad);
        }

        carrito.clear();
        System.out.println("Compra realizada con éxito");
    }
}
