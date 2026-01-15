package ejercicio4.model;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        double area = (radio*radio) * Math.PI;
        return area;
    }
}
