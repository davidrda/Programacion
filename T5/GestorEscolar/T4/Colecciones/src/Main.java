import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // defino el array segun el numero de elementos
        boolean[] aciertos = new boolean[4];
        // [false,false,false,false]
        String[] palabras = new String[3];
        // [null,null,null] -> guarda un nulo
        Object[] cosas = new Object[5];
        // [null,null,null,null,null]
        // [1,false,"hola",9.5,'a'] -> se guarda un poco de tod0
        int[] numerosConcretos = new int[]{5, 3, 1, 10, 8};
        // [5,3,1,10,8]
        // 0 1 2 3 4 -> posiciones
        //Integer[] numerosConcretos2 = new Integer[]{};
        boolean[] aciertosConcretos = new boolean[]{false, true, true};
        String[] palabrasConcretas = new String[]{"hola", "programacion", "array"};
        Object[] cosasConcretas = new Object[]{1, "adios", false, 0.0,"hola", 'a'};
        /*
        for (int i = 0; i < cosasConcretas.length; i++) {
            System.out.println("El elemento es "+cosasConcretas[i]);
        }
         */
        for (Object item : cosasConcretas) {
            if (item instanceof Integer) {
                if ((int)item>0){
                    System.out.println("El numero es mas grande que 0");
                }
            } else if (item instanceof String) {
                System.out.println("La longitud de palabra es "+item.toString().length());
            }
        }
        /*
        // [0,0,0,0,0,0]
        // 0 1 2 3 4 5 -> posiciones
        int longi = numeros.length;
        System.out.println("Longitud: " + longi);
        // modificar elementos
        numeros[0] = 19;
        numeros[numeros.length-1] = 30;
        // acceder a uno de los elementos
        System.out.println("El elemento de la primera posición es "+numeros[0]);
        System.out.println("El elemento de la primera central es "+numeros[numeros.length/2]);
        System.out.println("El elemento de la última posición es "+numeros[numeros.length-1]);
        // mostrar todos los elementos del array
        /* Utilizado para poder recorrer una posición inicial hasta una final
        Utilizado para modificar el valor de las posiciones
        for (int i = 0; i<numeros.length; i++) {
            if(numeros[i]%2 != 0){
            System.out.printf("El elemento en posición %d es %d%n",i,numeros[i]);
            }
        }
        // [19,0,0,0,0,30]
        // Utilizado para recorrer el valor de las posiciones
        int contador = 0;
        for ( int item : numeros ){
            System.out.println("El elemento en iteración es "+item+" en posición "+contador);
            contador++;
        }
         */
        /*
        // acciones que puedo realizar con los arrays
        // saber la longitud del array -> cuantos elementos hay en el array
        System.out.println("Cuantos numeros vas a querer guardar");
        int tamanio = scanner.nextInt();
        int[] numeros = new int[tamanio]; // se crea un array de 7 posiciones
        // guardar numeros aleatorios entre el 1 y el 50
        for (int i = 0; i < tamanio; i++) {
            numeros[i] = (int) (Math.random() * 50)+1; // 0-50 [23,14,29,37,41]
            System.out.println(numeros[i]);
        }
        System.out.println("Que numero quieres buscar");
        int numeroBuscar = scanner.nextInt(); // 23
        int contador = 0;
        // boolean encontrado = false;
        int posicion = -1;
        // pedir al usuario el numero buscado
        // el sistema deberá decirme donde está el  23 encontrado. En caso de no tener 23

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                System.out.println("La posición del numero buscado es "+i);
                posicion = i;
            }
        }

        if (posicion==-1) {
            System.out.println("El numero no se encuentra en la colección");
        } else {
            System.out.println("La posición del numero buscado es "+posicion);
        }
        
         */
        /*for (int item : numeros) {
            if (item == numeroBuscar) {
                System.out.println("hola");
                contador++;
            }
        }
        System.out.println("El numero de veces que esta el numero buscado es " + contador);
         */
    }
}
