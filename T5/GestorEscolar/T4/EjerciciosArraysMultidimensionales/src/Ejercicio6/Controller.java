package Ejercicio6;

public class Controller {
    private int[][] matriz = new int[3][4];

    // Se genera los números de matriz
    public void ejercicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }
        // Una vez generados, el metod0 se puede imprimir ya fuera del bucle
        imprimirMatriz();
        mayorColumna();
    }

    // Se crea el metod0 para imprimir
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            }
    }

    public void mayorColumna() {

        /*
        🔁 Regla para bucles anidados con matrices:
            for externo → lo que quieres fijar
            for interno → lo que quieres recorrer dentro de lo fijado
         */

        // 👉 Recorremos cada columna (j representa el índice de columna)
        for (int j = 0; j < matriz[0].length; j++) {
            // Inicializamos el mayor con el valor de la primera fila de la columna actual
            int mayor = matriz[0][j]; // El bucle hace 0,0 - 0,1 - 0,2 - 0,3

            // 🔁 Recorremos todas las filas (i representa el índice de fila)
            for (int i = 1; i < matriz.length; i++) { // El bucle hace 0,0 - 1,0 - 2,0
                // Comparas el valor actual de la columna j en la fila i
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j]; // Actualizas el mayor si encuentras uno más grande
                }
            }

            // 💡 Imprimimos el mayor valor de la columna j
            System.out.println("Mayor de columna " + j + ": " + mayor);
        }
    }


}
