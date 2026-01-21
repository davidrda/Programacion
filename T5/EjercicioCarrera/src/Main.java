import controller.CampeonatoController;
import controller.CarreraController;
import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Se pide el número de coches
        System.out.println("Indica el número de coches que van a competir.");
        int numCoches = scanner.nextInt();

        if (numCoches < 3) {
            System.out.println("Se necesita un mínimo de 3 coches. Introduce de nuevo el número de coches.");
            numCoches = scanner.nextInt();
        }

        // Se crea el array de coches
        Coche[] coches = new Coche[numCoches];

        // Se crea cada coche
        for (int i = 0; i < numCoches; i++) {
            System.out.println("Coche " + (i + 1));
            System.out.print("Marca: ");
            String marca = scanner.next();

            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.println();

            coches[i] = new Coche(marca,modelo);
        }

        // Se pide el número de carreras
        System.out.println("Indica el número de carreras.");
        int numCarreras = scanner.nextInt();

        if (numCarreras <= 1) {
            System.out.println("Se necesita un mínimo de 2 carreras. Introduce de nuevo el número de carreras.");
            numCarreras = scanner.nextInt();
        }

        // Se crea el array de carreras
        Carrera[] carreras = new Carrera[numCarreras];

        // Se crea cada carrera
        for (int i = 0; i < numCarreras; i++) {
            System.out.print("Indica los km de la carrera " + (i + 1) + ": ");
            int distanciaTotal = scanner.nextInt();

            carreras[i] = new Carrera(distanciaTotal,coches);
        }

        // Se crea el campeonato
        Campeonato campeonato = new Campeonato(carreras, coches);

        CampeonatoController campeonatoController = new CampeonatoController();
        campeonatoController.simularCampeonato(campeonato);

        scanner.close();
    }
}
