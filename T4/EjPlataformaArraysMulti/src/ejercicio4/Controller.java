package ejercicio4;

import java.util.Random;

public class Controller {

    /*
    Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
    sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
    Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
    que un mismo equipo no puede jugar más de un partido
     */

    private String[] bombo1 = {"Espana","Portugal","Alemania","Colombia","Argentina"};
    private String[] bombo2 = {"Uruguay","Marruecos","Francia","Paises Bajos","Inglaterra"};

    public void emparejarEquipos(){

        mezclarBombos(bombo1);
        mezclarBombos(bombo2);

        for (int i = 0; i < bombo1.length; i++) {
            System.out.println(bombo1[i] + " vs " + bombo2[i]);
        }
    }

    private void mezclarBombos(String[] bombo){
        Random random = new Random();

        for (int i = 0; i < bombo.length; i++) {

            // Elegimos un índice aleatorio dentro del array (entre 0 y array.length - 1)
            int indiceAleatorio = random.nextInt(bombo.length);

            // Guardamos temporalmente el valor de la posición actual
            String temp = bombo[i];

            // Reemplazamos el valor actual con el que está en la posición aleatoria
            bombo[i] = bombo[indiceAleatorio];

            // En la posición aleatoria ponemos el valor guardado
            bombo[indiceAleatorio] = temp;

            // Resultado: Se intercambian dos elementos del array
        }
    }

}
