package ejercicio2;

import ejercicio2.model.Coche;
import ejercicio2.model.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Lamborghini", "Urus");
        Coche coche = new Coche("Golf", "GTI", 5);

        vehiculo.mostrarInfo();
        coche.mostrarInfo();
    }
}
