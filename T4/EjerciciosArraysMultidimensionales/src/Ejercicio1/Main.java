package Ejercicio1;

/*
Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
Usa bucles for anidados para mostrar la matriz en formato de tabla.
 */

public class Main {
    public static void main(String[] args) {

        int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matriz 3x3:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
