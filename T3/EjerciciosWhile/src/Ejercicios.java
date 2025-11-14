import java.util.Scanner;

public class Ejercicios {
    Scanner scanner;

    public void ejercicio1(){
        scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Contando con while:");
        int contador = 1;

        while (contador <= numero){
            System.out.println(contador);
            contador++;
            }
    }

    public void ejercicio2(){
        scanner = new Scanner(System.in);

        int passCorrecta = 1234;
        int pass;

        do {
            System.out.println("Introduce la contraseña: ");
            pass = scanner.nextInt();

            if (pass != passCorrecta) {
                System.out.println("Contraseña incorrecta");
            }
        } while (pass != passCorrecta);

        System.out.println("Contraseña correcta");

        scanner.close();
    }

    public void ejercicio3(){

        scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int suma = 0;

        while (numero > 0) {
            suma = suma + numero;
            System.out.println("Suma actual: "+suma);
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa terminado. Suma total: "+suma);

        scanner.close();
    }

    public void ejercicio4(){

        scanner = new Scanner(System.in);

        System.out.println("Adivina el número 1 y 10!");
        int intento = 0;
        int numeroSecreto = (int)(Math.random()*10)+1;
        int numIntentos = 0;
        /*
        Math.random() → genera un número decimal aleatorio entre 0.0 y 1.0 (nunca llega a 1).
        Math.random() * 10 → da un número entre 0.0 y 9.999....
        (int) → convierte ese número en un entero (corta los decimales).
        + 1 → hace que el número esté entre 1 y 10 en lugar de entre 0 y 9.
         */

        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            numIntentos++;

        } while (intento != numeroSecreto);
        System.out.println("Correcto! Has adivinado el número en "+numIntentos+" intentos.");
        scanner.close();

    }

    public void ejercicio5(){
        scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("---MENÚ---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver hora");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Hola! Como estas?");
                }
                case 2 -> {
                    System.out.println("Nos vemos pronto!");
                }
                case 3 -> {
                    System.out.println("La hora actual es: 10:30");
                }
                default  -> {
                    System.out.println("No existe esta opción");
                }
            }
        } while (opcion != 4);

        System.out.println("Hasta luego!");
        scanner.close();
    }

    public void ejercicio6(){
        scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("Cuenta atras: ");

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
            if (numero < 1){
                System.out.println("Despegue!");
            }
        }
        scanner.close();
    }

    public void ejercicio7(){
        scanner = new Scanner(System.in);

        int contador = 1;
        System.out.println("¿Cuantas calificaciones vas a introducir?");
        int numCalificaciones = scanner.nextInt();
        double sumaTotal = 0;
        double calificacion;

        while (contador <= numCalificaciones){
            System.out.println("Introduce la calificación "+contador+": ");
            calificacion = scanner.nextInt();
            sumaTotal = sumaTotal + calificacion;

            contador++;
        }
        double promedio = sumaTotal/numCalificaciones;
        System.out.println("Suma total: "+sumaTotal);
        System.out.println("Promedio de calificaciones: "+promedio);
    }

    public void ejercicio8(){
        scanner = new Scanner(System.in);

        int edad;

        do {
            System.out.println("Introduce tu edad: ");
            edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad no válida. Debe estar entre 0 y 120.");
            }

        } while (edad < 0 || edad > 120);
        System.out.println("Edad válida: " + edad + " años. ¡Gracias!");

        scanner.close();
    }

    public void ejercicio9(){
        scanner = new Scanner(System.in);



    }
}

