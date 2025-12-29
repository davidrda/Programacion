package Ejercicio7;

public class Controller {
    private int[][] matriz = new int[3][4];
    private int[][] matrizTranspuesta = new int[4][3];

    // Se genera los números de matriz
    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }
        // Una vez generados, el metod0 se puede imprimir ya fuera del bucle
        imprimirMatrizOriginal();
        transponerMatriz();
        imprimirMatrizTranspuesta();
    }

    // Se crea el metod0 para imprimir
    public void imprimirMatrizOriginal(){
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            }
    }

    public void transponerMatriz(){
        // Transponemos: se intercambian filas por columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
                // fila, columna -> columna, fila
            }
        }
    }

    public void imprimirMatrizTranspuesta(){
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
