package ejercicio4;

import ejercicio4.model.Circulo;
import ejercicio4.model.Cuadrado;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(8.5);
        System.out.println("Círculo con radio: "+circulo.getRadio());
        System.out.printf("Area: %.2f\n",circulo.calcularArea());

        Cuadrado cuadrado = new Cuadrado(5.8);
        System.out.println("Cuadrado con lado: "+cuadrado.getLado());
        System.out.printf("Area: %.2f",cuadrado.calcularArea());

    }
}
