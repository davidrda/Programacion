import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {

        /*
        while -> estructura que repite un cuerpo siempre que una condición sea true
        cuantas ejecuciones minimo tiene este estamento -> 0 a N, no asegura ejecucion
        mientras (condicion) {
            cuerpo -> o romper con break o cambiar la condicion
        }
        ejecuta si es falso

        do-while -> se repite el cuerpo de un estamento siempre y cuando la condicion
        de repeticion es true -> 1 a N
         */

        // quiero pedir al usuario que me introduzca numeros
        // hasta tener un negativo
        Scanner scn = new Scanner(System.in);
        int intentos = 3;
        int pin = 1234;
        int pinUsuario = 0;
        boolean bloqueado =  false;
        while (intentos>=0 || pinUsuario != pin){
            System.out.println("Introduce un pin");
            pinUsuario = scn.nextInt();
            intentos--;
            if (intentos == 0){
                bloqueado = true;
            }
        }

        System.out.println("Sistema detenido");
    }
}
