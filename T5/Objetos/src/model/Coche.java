package model;

public class Coche {

    private String marca, modelo, color;

    private int cv, numeroPuertas, precio;

    public Coche(){}

    public Coche(String marca, String modelo, int cv, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }
    public Coche(String marca, String modelo, int cv, int precio, int numeroPuertas){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(String marca, int cv, String color, int numeroPuertas) {
        this.marca = marca;
        this.cv = cv;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
