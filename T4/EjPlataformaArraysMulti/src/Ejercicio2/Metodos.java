package Ejercicio2;

import java.util.Scanner;

public class Metodos {

    private int[] array = new int[10];

    public void valoresArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 19)+1);
        }
    }

    public void menuArray(){
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println();
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("a. Imprimir array");
            System.out.println("b. Mover a izquierda");
            System.out.println("c. Mover a derecha");
            System.out.println("d. Invertir");

            System.out.println();

            System.out.println("Elige opción:");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'a'->{
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i]+"\t");
                    }
                }
                case 'b'->{
                    int primero = array[0]; // Se guarda el primer elemento
                    for (int i = 0; i < array.length - 1; i++) {
                        array[i] = array[i+1]; // Desplazamos a la izquierda
                    }
                    array[array.length-1] = primero;

                    System.out.println("Array movido a la izquierda");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i]+"\t");
                    }
                    System.out.println();
                }
                case 'c'->{
                    int ultimo = array[array.length-1]; // se guarda el ultimo elemento
                    for (int i = array.length - 1; i > 0; i--) {
                        array[i] = array[i-1];
                    }

                    array[0] = ultimo;

                    System.out.println("Array movido a la derecha");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i]+"\t");
                    }
                    System.out.println();
                }
                case 'd'->{
                    int[] arrayInvertido = new int[array.length];
                    for (int i = 0; i < array.length; i++) {
                        arrayInvertido[i] = array[array.length-1-i];
                        System.out.print(arrayInvertido[i]+"\t");
                    }
                    System.out.println();
                }
                default -> {
                    System.out.println("No existe esta opción");
                }
            }
        } while (opcion == 'a'||opcion == 'b'||opcion == 'c' ||opcion == 'd');
    }
}
