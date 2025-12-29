package ejercicio4;

import java.util.Scanner;
/*
4. Crea un programa para jugar una partida virtual de dardos entre dos
jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
partiendo desde 301.
Reglas:
• Nada más empezar pide el nombre de cada jugador
• Cada jugador comienza con 301 puntos.
• En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
aleatorio entre 0 y 60 (simulando puntuación en dardos).
• La puntuación del turno es la suma de los 3 dardos.
• Resta la puntuación del turno al total de puntos del jugador.
• Si la puntuación restante es menor que 0, se considera que el jugador "se
pasa" y su total no cambia ese turno.
• El primer jugador que llegue exactamente a 0 gana la partida.
• Después de cada turno, muestra las puntuaciones actuales y quién va
ganando (el que tiene menos puntos).
• Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaro jugadores
        System.out.println("Indica el nombre del jugador 1");
        String jugador1 = sc.nextLine();
        System.out.println("Indica el nombre del jugador 2");
        String jugador2 = sc.nextLine();

        int puntosJugador1 = 301;
        int puntosJugador2 = 301;
        int turno = 0;
        int dardos = (int)(Math.random()*60)+1;

        do {
            for (int i = 0; i < turno; i++) {
                for (int j = 0; j < 3 ; j++) {
                    puntosJugador1 -= dardos;
                }
            puntosJugador1 = puntosJugador1 - dardos;
            if (puntosJugador1 < 0) {
                puntosJugador1 += dardos;
                System.out.println("Te has pasado de puntos, no se cuenta esta tirada");
            } else if (puntosJugador1 == 0) {
                System.out.println("Felicidades "+jugador1+". Has ganado");
                break;
            }
                System.out.println("Puntuación del jugador 1: "+puntosJugador1);

                for (int x = 0; x < 3 ; x++) {
                    puntosJugador2 -= dardos;
                }
            puntosJugador2 = puntosJugador2  - dardos;
            if (puntosJugador2 < 0) {
                puntosJugador2 += dardos;
                System.out.println("Te has pasado de puntos, no se cuenta esta tirada");
            } else if (puntosJugador2 == 0) {
                System.out.println("Felicidades "+jugador2+". Has ganado");
                break;
            }
            System.out.println("Puntuación del jugador 2: "+puntosJugador2);

            turno++;
            }
        } while (puntosJugador1 != 0 || puntosJugador2 != 0);
        System.out.println("La partida tomó: "+turno+" turnos");
    }
}
