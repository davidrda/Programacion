package model;

public class Coche {

    private String marca, modelo;
    private int km;
    private int puntos;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        km = 0;
        puntos = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
