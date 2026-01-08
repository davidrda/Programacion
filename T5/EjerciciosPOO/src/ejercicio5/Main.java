package ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Crear cuentas
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan García", 1500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", 800.0);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro Martín", 1200.0);

        // Hacer los movimientos
        System.out.println(cuenta1);
        cuenta1.depositar(500.0);

        System.out.println();
        System.out.println(cuenta2);
        cuenta2.retirar(150.0);

        System.out.println();
        System.out.println(cuenta3);
        cuenta3.retirar(1000.0);
        cuenta3.depositar(20000.0);

        // Saldos finales
        System.out.println();
        System.out.println("Saldos finales:");
        System.out.println(cuenta1.getTitular()+": "+cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular()+": "+cuenta2.getSaldo());
        System.out.println(cuenta3.getTitular()+": "+cuenta3.getSaldo());
    }
}
