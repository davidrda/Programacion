package ejercicio6;

public class Main {
    public static void main(String[] args) {
        double[] numerosDecimales = new double[]{4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        double sumaTotal = 0;
        double promedioTotal = 0;
        for (int i = 0; i < numerosDecimales.length; i++) {
            sumaTotal += numerosDecimales[i];
        }
        promedioTotal = sumaTotal/numerosDecimales.length;
        System.out.println("Suma total: " +sumaTotal);
        System.out.printf("Promedio total: %.2f" ,promedioTotal);
    }
}
