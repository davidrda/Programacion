package model;

public class Decisiones {

    public void estructuraIF(int nota){
        System.out.println("Vamos a explicar la estructura IF");
        if (nota >= 5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspendido");
        }
    }

    public void estructuraIFELSEIF(double nota) {
        System.out.println("Iniciando la evaluación del examen");
        /*
        if (nota >= 0 && nota <= 10) {
            if (nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else {
                System.out.println("Examen de MH");
            }
        } else {
            System.out.println("Rango incorrecto");
        }*/
    }
}
