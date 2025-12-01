package Ejercicio7;

public class Controller {
    private int[][] matriz = new int[3][4];

    // Se genera los números de matriz
    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }
        // Una vez generados, el metod0 se puede imprimir ya fuera del bucle
        imprimirMatriz();
    }

    // Se crea el metod0 para imprimir
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            }
    }

    public void transponerMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {}
        }
    }

}
