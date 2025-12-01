package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matriz = new int[2][4];

        Scanner sc = new Scanner(System.in);

        // se rellena la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el valor para posición " + i + ","+ j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // se imprime
        System.out.println("Matriz 2x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
