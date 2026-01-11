package ejercicio8;

public class Empleado {

    private String nombre, puesto;
    private int salario;

    public Empleado(String puesto, String nombre, int salario) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarEmpleados() {
        System.out.println(nombre + " - " + puesto + " - " + salario + "€");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
