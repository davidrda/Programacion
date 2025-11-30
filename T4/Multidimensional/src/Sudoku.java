public class Sudoku {
    // todas las variables que esten dentro de una clase que no sea main deben ser privadas (encapsulamiento)
    private int[][] sudoku = new int[3][3];

    public void empezarJuego() {
        // se rellena la matriz con numeros aleatorios
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * 10);
                } while (estaNumero(aleatorio));
                // preguntar
                sudoku[i][j] = aleatorio;
            }
        }
        for (int[] fila : sudoku) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("Mostrando los numeros de una columna concreta");
        numerosColumna(1);
        System.out.println("Mostrando los numeros de una fila concreta");
        numerosFila(0);
    }

    // recorre cada item y si item == numero retorna true, o sea, dices que sí está repetido
    private boolean estaNumero(int numero) {
        for (int[] fila : sudoku) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    // solo los numeros de la primera columna
    public void numerosColumna(int nColumna){
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println(sudoku[i][nColumna]);
        }
    }

    public void numerosFila(int nFila){
        for (int i = 0; i < sudoku[nFila].length; i++) {
            System.out.print(sudoku[nFila][i]+"\t");
        }
    }
}