package Ejercicio3;

import java.util.Scanner;

public class Controller {

    Scanner scn = new Scanner(System.in);
    private double[] notasAlumnos = new double[10];

    public void almacenarNotas() {

        double notaTotal = 0;
        double notaMedia;
        double notaMasAlta;
        double notaMasBaja;
        int aprobados = 0;
        int suspendidos = 0;

        // ================================
        // 1. PEDIR LAS NOTAS A LOS ALUMNOS
        // ================================
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            notasAlumnos[i] = scn.nextDouble();

            // Validación correcta usando WHILE
            while (notasAlumnos[i] < 0 || notasAlumnos[i] > 10) {
                System.out.println("Nota inválida. Introduce una nota entre 0 y 10:");
                notasAlumnos[i] = scn.nextDouble();
            }
        }

        // =======================================
        // 2. Inicializar nota más alta y más baja
        // =======================================
        notaMasAlta = notasAlumnos[0];
        notaMasBaja = notasAlumnos[0];

        // =======================================
        // 3. Calcular media, alta, baja y recuentos
        // =======================================
        for (int i = 0; i < notasAlumnos.length; i++) {

            double nota = notasAlumnos[i];
            notaTotal += nota;

            // Nota más alta
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }

            // Nota más baja
            if (nota < notaMasBaja) {
                notaMasBaja = nota;
            }

            // Aprobados y suspendidos
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }

        notaMedia = notaTotal / notasAlumnos.length;

        // ================================
        // 4. Mostrar resultados
        // ================================
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("La nota media es: " + notaMedia);
        System.out.println("La nota más alta es: " + notaMasAlta);
        System.out.println("La nota más baja es: " + notaMasBaja);
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspendidos: " + suspendidos);
    }
}
