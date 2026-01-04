public class Sudoku {
    private int[][] sudoku = new int[3][3];

    public void empezarJuego() {
        int totalFilas = sudoku.length;
        int totalColumnas = sudoku[0].length;

        for (int i = 0; i < totalFilas; i++) {
            for (int j = 0; j < totalColumnas; j++) {
                int aleatorio;
                do {
                    aleatorio = (int)(Math.random() * 30);  // 0 a 29
                } while (estaNumero(aleatorio, i, j));  // revisamos solo lo que ya está lleno
                sudoku[i][j] = aleatorio;
            }
        }

        // Imprimir la matriz final
        System.out.println("Sudoku generado:");
        for (int[] fila : sudoku) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    // ✅ Solo revisa las celdas que ya se llenaron (antes de i, j)
    private boolean estaNumero(int numero, int filaActual, int colActual) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (i > filaActual || (i == filaActual && j >= colActual)) {
                    return false;  // no revises lo que aún no está lleno
                }

                if (sudoku[i][j] == numero) {
                    return true;  // número ya existe, está repetido
                }
            }
        }
        return false; // número no está, puedes usarlo
    }

    public static void main(String[] args) {
        Sudoku s = new Sudoku();
        s.empezarJuego();
    }
}
