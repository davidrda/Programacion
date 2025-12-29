package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[] {40,32,84,16,29,47,90,51,20,11};
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 50){
                contador++;
            }
        }
    System.out.println("Cantidad de números mayores de 50:\n"+contador);
    }
}
