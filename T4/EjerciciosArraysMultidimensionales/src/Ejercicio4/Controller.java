package Ejercicio4;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    private int[][] matriz = new int[3][5];
    private int encontrarNumero;

    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 20);
            }
        }
        impresionMatriz();
        System.out.println("Introduce el número a buscar: ");
        encontrarNumero = sc.nextInt();
        buscarNumero(encontrarNumero);
    }

    public void impresionMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private boolean encontrado = false;

    public void buscarNumero(int encontrarNumero){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == encontrarNumero) {
                    System.out.println("El número encontrado está en posición:"+ i + "," + j);
                    encontrado = true;
                }
            }
            if (encontrado){
                break;
            }
        }
        if (!encontrado){
            System.out.println("Número no encontrado");
        }
    }


}
