package Ejercicio3;

public class Controller {

    private int[][] matriz = new int[4][4];
    private int suma = 0;

    public void ejercicio() {

        System.out.println("Matriz 4x4");
        // Se generan números aleatorios en la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 20);
                suma += matriz[i][j]; // suma todos los números generados
            }
        }
        imprimirMatriz();
        System.out.println("Suma: " + suma);
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
                System.out.println();
        }
    }
}
