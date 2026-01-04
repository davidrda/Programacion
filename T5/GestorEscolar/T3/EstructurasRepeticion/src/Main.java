import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EjercicioCuadrado ejercicios = new EjercicioCuadrado();
        // ejercicios.cuadrado();
        //ejercicios.palindromo();

        /*
        // inicial ; final ; incremento
        // [0,5]
        // pide por teclado 10 numeros y di de todos ellos cuantos
        // son pares
        // son impares
        // el numero medio introducido

        int contadorPares=0, contadorImpares=0;
        int sumatorio=0;
        for (int i=0; i<5; i++){
            System.out.println("Introduce un numero en posicion "+i);
            int numero = scanner.nextInt();
            if(numero%2==0){
                contadorPares++;
            } else {
                contadorImpares++;
            }
            sumatorio += numero;
        }
        System.out.println("Saliendo del for");
        System.out.println("El numero de pares es "+contadorPares);
        System.out.println("El numero de impares es "+contadorImpares);
        System.out.println("El numero medio introducido es "+sumatorio/5);

        for (int i=0; i<11; i++){
            System.out.printf("%d * %d = %d%n", 5, i, 5*1);
        }
        /*
        for (int i=10; i>=0; i-=2){
            System.out.println("Ejecucion de linea repetida "+i);
        }
         */
    }
}
