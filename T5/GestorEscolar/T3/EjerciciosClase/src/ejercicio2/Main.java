package ejercicio2;

import java.util.Scanner;

public class Main {

    /*
    2. Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
las siguientes acciones:
a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
    i. Aciertos: cuántas letras tiene en la misma posición que la palabra
    secreta.
    ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
    posición diferente.
    iii. Fallos: cuántas letras no están presentes en la palabra secreta.
El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] palabras = {"datos","cosas","lucia","manta"}; // posicion 1, 2, 3, 4
        String palabraSecreta = palabras[(int)(Math.random()*4)];
        String palabraUsuario;
        System.out.println("La palabra a adivinar es "+palabraSecreta );
        int intentos = 5;
        boolean adivinada = false;
        // cosas
        // datas
        // aciertos: 2
        // aprox: 1
        // fallos: 2
        do {
            do {
                System.out.println("Introduce la palabra");
                palabraUsuario = scanner.next();
                if (palabraUsuario.length() != 5){
                    System.out.println("Palabra inválida, por favor introduce otra");
                }
            } while (palabraUsuario.length() != 5);
            System.out.println("Intento gastado");
            intentos--;
            int numeroAciertos = 0, numeroAprox = 0, numeroErrores = 0;
            // analizar
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // i= 0, 1, 2, 3, 4
                // cosas
                // datas
                if (palabraUsuario.equals(palabraSecreta)){
                    System.out.println("Palabra adivinada");
                    numeroAciertos = 5;
                    adivinada = true;
                    break;
                }
                else if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)){
                    numeroAciertos++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) { // parseo a St
                    numeroAprox++;
                } else {
                    numeroErrores++;
                }
            }

            System.out.println("El numero de aciertos es "+numeroAciertos);
            System.out.println("El numero de errores es "+numeroErrores);
            System.out.println("El numero de aproximaciones es "+numeroAprox);

        }while (intentos > 0 && !adivinada);

        System.out.println("Saliendo del juego");
    }
}
