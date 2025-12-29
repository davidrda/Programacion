package Ejercicio10;

import java.util.Scanner;

public class Controller {

    Scanner sc = new Scanner(System.in);
    private int estudiantes;
    private int asignaturas;
    private double[][] matriz;
    double promedio;
    double sumaPromedio = 0;

    public void programaEstudiantes(){
        System.out.println("¿Cuantos estudiantes hay?");
        estudiantes = sc.nextInt();
        System.out.println("Cuantos asignaturas hay?");
        asignaturas = sc.nextInt();
        matriz = new double[estudiantes][asignaturas];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce nota del estudiante " + (i + 1) + ", asignatura " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public void tablaNotas(){
        System.out.println("\t-- TABLA DE NOTAS --");
        System.out.print("         "); // espacio antes del encabezado
        // encabezados de columnas
        for (int j = 0; j < asignaturas; j++) {
            System.out.print("Asig"+(j+1)+"  ");
        }
        System.out.println();

        // filas con las notas de cada estudiante
        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Est "+(i+1)+": ");
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("%5.1f ", matriz[i][j]); // %5.1f -> un decimal, usando 5 espacios para que quede alineado
            }
            System.out.println();
        }
    }

    public void promedioEstudiantes(){
        System.out.println("\t-- PROMEDIO POR ESTUDIANTE --");
        for (int i = 0; i < estudiantes; i++) {
            sumaPromedio = 0;
            for (int j = 0; j < asignaturas; j++) {
                sumaPromedio += matriz[i][j];
            }
            promedio = sumaPromedio/asignaturas;
            System.out.printf("Estudiante %d: %.2f\n", (i+1), promedio);
        }
    }

    public void promedioAsignaturas(){
        System.out.println("\t-- PROMEDIO POR ASIGNATURA --");
        for (int j = 0; j < asignaturas; j++) {
            sumaPromedio = 0;
            for (int i = 0; i < estudiantes; i++) {
                sumaPromedio += matriz[i][j];
            }
            promedio = sumaPromedio/estudiantes;
            System.out.printf("Asignatura %d: %.2f\n", (j+1), promedio);
        }
    }

}
