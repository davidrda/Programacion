package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{18,42,38,48,91,2};
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }
        }
        System.out.println("Mayor: " + numeroMayor);
        System.out.println("Menor: " + numeroMenor);
    }
}
