package ejercicio2.model;

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + ", " + numeroPuertas + " puertas");
    }
}
