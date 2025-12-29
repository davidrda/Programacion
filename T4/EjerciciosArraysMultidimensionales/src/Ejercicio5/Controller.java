package Ejercicio5;

public class Controller {

    private double[][] matriz = new double[4][3];

    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                matriz[i][j] = (Math.random() * 9);
            }
        }
        imprimirMatriz();
        calcularPromedio();
    }

    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                System.out.printf("%.1f\t",matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void calcularPromedio(){
        // está fuera porque solo necesita info de otras variables de dentro del bucle
        double promedio = 0;
        for (int i = 0; i < matriz.length; i++) {
            // se declara dentro porque en cada vuelta se reinicia a 0
            // la sumaFila para poder sacar la suma de la otra fila
            double sumaFila = 0;

            for (int j = 0; j < matriz[1].length; j++) {
                // sumas el contenido de la fila. POR EJEMPLO: 1,2 + 3,4 + 4,7 = sumaFila
                sumaFila += matriz[i][j];
            }

            //aquí sacas el promedio de esa fila
            promedio = sumaFila / matriz[i].length;

            // %d = i
            // %.2f = promedio con sólo 2 decimales
            // \n = tabulación
            System.out.printf("Promedio fila %d: %.2f\n", i, promedio);

            //termina el bucle de esta fila y va a la siguiente
        }
    }
}
