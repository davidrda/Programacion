package ejercicio5;

public abstract class Empleado {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract String getPuesto();

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Salario base: " + salarioBase);
    }
}
