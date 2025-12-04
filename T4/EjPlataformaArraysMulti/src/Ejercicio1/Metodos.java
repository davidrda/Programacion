package Ejercicio1;

import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    int[][] matriz1;
    int[][] matriz2;
    int[][] sumaMatrices;

    public void matrices(){
        System.out.println("¿Cuantas filas tendrá la matriz?");
        int filas = sc.nextInt();

        System.out.println("Cuantas columnas tendrá la matriz?");
        int columnas = sc.nextInt();

        matriz1 = new int[filas][columnas];
        matriz2 =  new int[filas][columnas];

        // Se le asigna un valor aleatorio a cada valor de matriz1
        System.out.println("MATRIZ 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random() * 51);
                System.out.print(matriz1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("MATRIZ 2:");
        // Se le asigna un valor aleatorio a cada valor de matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random() * 51);
                System.out.print(matriz2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        sumaMatrices = new int[filas][columnas];

        // Haces la suma de las 2 matrices
        System.out.println("MATRIZ 3:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(sumaMatrices[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

    }
}
