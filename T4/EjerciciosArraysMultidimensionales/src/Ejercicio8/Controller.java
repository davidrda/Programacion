package Ejercicio8;

public class Controller {

    private int[][] matriz = new int[4][5];
    private int pares = 0;
    private int impares = 0;

    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 31);
                if (matriz[i][j] % 2 == 0){
                    pares++;
                } else{
                    impares++;
                }
            }
        }
        imprimirMatriz();
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public void imprimirMatriz(){
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
