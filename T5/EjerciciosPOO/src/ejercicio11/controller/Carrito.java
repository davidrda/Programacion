package ejercicio11.controller;

import ejercicio11.model.Producto;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Integer> cantidades;

    public Carrito() {
        listaProductos = new ArrayList<>();
        cantidades = new ArrayList<>();
    }

    public Carrito(ArrayList<Producto> listaProductos, ArrayList<Integer> cantidades) {
        this.listaProductos = listaProductos;
        this.cantidades = cantidades;

    }

    public void anadirProducto(Producto producto, int cantidad){
        boolean encontrado = false;

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo() == producto.getCodigo()) {
                int actual = cantidades
            }
        }

    }
}
