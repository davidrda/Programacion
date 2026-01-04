package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[]{1,2,3,4,5,6,7};
        System.out.println("introduce el numero a buscar: ");
        int numeroBuscar = sc.nextInt();
        boolean existe = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                System.out.println("El número: "+numeroBuscar+" se encuentra en la posición "+numeros[i]);
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No existe el numero");
        }
        sc.close();
    }
}
