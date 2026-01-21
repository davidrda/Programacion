package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

public class CampeonatoController {

    public void simularCampeonato (Campeonato campeonato) {

        Carrera[] carreras = campeonato.getListaCarreras();

        CarreraController carreraController = new CarreraController();

        for (int i = 0; i < carreras.length; i++) {

            System.out.println("=== CARRERA " + (i + 1) + " ===");

            carreraController.simularCarrera(carreras[i]);

        }

        mostrarClasificacion(campeonato.getCoches());

    }

    public void mostrarClasificacion(Coche[] coches) {

        // Ordenar coches por puntos (descendente)
        for (int i = 0; i < coches.length - 1; i++) {
            for (int j = i + 1; j < coches.length; j++) {
                if (coches[j].getPuntos() > coches[i].getPuntos()) {
                    Coche aux = coches[i];
                    coches[i] = coches[j];
                    coches[j] = aux;
                }
            }
        }

        System.out.println("=== CLASIFICACIÓN DEL CAMPEONATO ===");

        for (int i = 0; i < coches.length; i++) {
            System.out.println(
                    (i + 1) + "º - " +
                            coches[i].getMarca() + " " +
                            coches[i].getModelo() +
                            " | Puntos totales: " +
                            coches[i].getPuntos()
            );
        }
    }

}
