package ejercicio5;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Depósito de "+cantidad+"€. Nuevo saldo: "+saldo);
    }

    public void retirar(double cantidad){
        saldo -= cantidad;
        System.out.println("Retiro de "+cantidad+"€. Nuevo saldo: "+saldo);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // toString para mostrar la cuenta
    @Override
    public String toString() {
        return "Cuenta de " + titular + ": " + saldo + "€";
    }
}
