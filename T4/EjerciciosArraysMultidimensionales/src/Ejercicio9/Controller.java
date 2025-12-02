package Ejercicio9;

public class Controller {

    private int[][] matriz = new int[10][10];

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
