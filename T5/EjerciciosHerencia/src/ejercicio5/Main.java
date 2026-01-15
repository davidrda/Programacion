package ejercicio5;

import ejercicio5.Empleado;
import ejercicio5.Gerente;
import ejercicio5.Desarrollador;

public class Main {

    public static void main(String[] args) {

        Empleado e1 = new Gerente("Ana", 48332.43, 7000);
        Empleado e2 = new Desarrollador("David", 62000, "Java");

        e1.mostrarInfo();
        System.out.println();
        e2.mostrarInfo();
    }
}
