package ejercicio3;

public class Main {
    /*
    Crea una clase Rectangulo con atributos base y altura.
    Añade métodos calcularArea() y calcularPerimetro() que devuelvan el área y el perímetro respectivamente.
    Crea un objeto y muestra los resultados.
     */
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Area: "+rectangulo.calcularArea());
        System.out.println("Perimetro: "+rectangulo.calcularPerimetro());
    }
}
