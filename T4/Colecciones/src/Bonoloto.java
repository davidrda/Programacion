/*
Realizar el juego de bonoloto.
Para ello el sistema contara con dos cadenas de numeros
    - numeros del sistema
    - numeros del usuario
De primeras, el sistema guardará 5 numeros aleatorios entre 1-20
El sistema pedirá al usuario que introduzca sus numeros

El sistema deberá decidir si he ganado un premio. Para ello los premios se reparten de la siguiente forma

5 aciertos -> 1 millon de euros
4 aciertos -> 10mil
3 aciertos -> mil
1-2 aciertos -> 10 euros
0 -> prueba suerte la siguiente vez

numeros del sistema -> 9,12,3,5,11
numeros del usuario -> 12,9,6,10,3
 */

import java.util.Scanner;

public class Bonoloto {
    // todas las variables que pertenecen a una clase que no es Main, suelen ser privadas
    private int[] numerosSistema = new int[5];

    private int[] numerosUsuario = new int[5];

    private Scanner scanner = new Scanner(System.in);

    public void generarNumerosSistema(){
        for (int i = 0; i < numerosSistema.length; i++) {
            numerosSistema[i] = (int)(Math.random()*20)+1;
        }
    }

    public void pedirNumerosUsuario(){
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numero;
            do {
            System.out.println("Introduce un valor:");
            numero = scanner.nextInt();
            if (numero<1 || numero>20){
                System.out.println("Valor invalido");
            }
            }while (numero<1 || numero>20);
            numerosUsuario[i] = numero;
        }
    }
}
