package ejercicio5;

public class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public String getPuesto() {
        return "Gerente";
    }

    public double calcularSalarioTotal() {
        return salarioBase + bonus;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Salario total: " + calcularSalarioTotal());
    }
}
