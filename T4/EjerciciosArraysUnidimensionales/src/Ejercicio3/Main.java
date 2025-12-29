package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre "+(i+1)+":");
            nombres[i] = sc.nextLine();
        }
        System.out.println("Nombre de la lista:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
