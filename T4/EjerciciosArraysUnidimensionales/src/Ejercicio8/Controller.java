package Ejercicio8;

import java.util.Scanner;

public class Controller {
    String[] array = new String[]{"gato","perro","perro","gato","perro","gato","gato","gato","gato","perro"};
    Scanner sc = new Scanner(System.in);
    String palabra;
    int contador;

    public void contarArray(){
    System.out.println("Di una palabra del array");
    palabra = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if(palabra.equals(array[i])){
                contador++;
            }
        }
        System.out.println("La palabra "+palabra+" está "+contador+" veces.");
    }
}
