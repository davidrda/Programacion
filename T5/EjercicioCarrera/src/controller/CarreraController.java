package controller;

import model.Carrera;
import model.Coche;

import java.util.Random;

public class CarreraController {

    public void resetearCarrera(Coche[] coches){ // Se ponen los km de todos los coches a 0

        for (int i = 0; i < coches.length; i++) {
            coches[i].setKm(0);
        }

    }

    public void simularCarrera (Carrera carrera) {

        Coche[] coches = carrera.getListaCoches(); // Es el array de coches
        int distanciaTotal = carrera.getDistanciaTotal();

        resetearCarrera(coches);

        Random random = new Random();
        boolean carreraTerminada = false;

        // Mientras la carrera siga activa, se activa el bucle donde cada coche gana Km
        while (!carreraTerminada) {
            for (int i = 0; i < coches.length; i++) {
                int avance = random.nextInt(31) + 20;
                coches[i].setKm(coches[i].getKm() + avance);

                if (coches[i].getKm() >= distanciaTotal) {
                    carreraTerminada = true;
                    break;
                }
            }
        }

        posicionarCoches(carrera.getListaCoches());

        asignarPuntos(carrera.getListaCoches());

        imprimirResultados(carrera.getListaCoches());



    }

    public void posicionarCoches(Coche[] coches){
        // Se posiciona cada coche en su podio según los km
        for (int i = 0; i < coches.length - 1; i++) {
            for (int j = i + 1; j < coches.length; j++) {
                if (coches[j].getKm() > coches[i].getKm()) {
                    Coche aux = coches[i];
                    coches[i] = coches[j];
                    coches[j] = aux;
                }
            }
        }
    }

    public void asignarPuntos (Coche[] coches) {

        // Se asignan los puntos, los coches ya estan en su posición,
        // por lo que a cada posición se le otorgan sus puntos
        if (coches.length > 0) {
            coches[0].setPuntos(coches[0].getPuntos() + 10);
        }
        if (coches.length > 1) {
            coches[1].setPuntos(coches[1].getPuntos() + 8);
        }
        if (coches.length > 2) {
            coches[2].setPuntos(coches[2].getPuntos() + 6);
        }
    }

    public void imprimirResultados(Coche[] coches) {

        int[] puntos = {10, 8, 6};

        for (int i = 0; i < coches.length; i++) {

            int puntosCarrera = 0;
            if (i < puntos.length) {
                puntosCarrera = puntos[i];
            }

            System.out.println(
                    (i + 1) + "º - " +
                            coches[i].getMarca() + " " +
                            coches[i].getModelo() +
                            " | Puntos: " +
                            puntosCarrera);
        }
    }
}
