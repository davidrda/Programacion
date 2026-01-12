package ejercicio2.model;

public class Vehiculo {

    private String marca, modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}
