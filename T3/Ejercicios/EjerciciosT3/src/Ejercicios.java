import java.util.Scanner;

public class Ejercicios {

    Scanner scn;

    public void ejercicio1(){;

        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scn.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("No eres mayor de edad. No puedes votar");
        }

        scn.close();
    }

    public void ejercicio2(){

        scn = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = scn.nextInt();

        if (num == 0){
            System.out.println("El número es 0");
        } else if (num > 0){
            System.out.println("El número es positivo");
        } else if (num < 0) {
            System.out.println("El número es negativo");
        }

        scn.close();

    }

    public void ejercicio3(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu nota:");
        double nota  = scn.nextDouble();

        if (nota >= 5){
            System.out.println("¡Enhorabuena! Has aprobado");
        } else if (nota < 5) {
            System.out.println("Has suspendido");
        }

        scn.close();
    }

    public void ejercicio4(){

        scn = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra:");
        double importe_compra = scn.nextDouble();

        double importe_descontado;

        if (importe_compra >= 100){
            importe_descontado = importe_compra - (importe_compra * 0.10);
            System.out.println("Importe original: "+importe_compra);
            System.out.println("Descuento aplicado: "+importe_compra * 0.10);
            System.out.println("Importe final: "+importe_descontado);
        } else {
            System.out.println("No se aplica ningún descuento");
        }

        scn.close();
    }

    public void ejercicio5(){

        scn = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = scn.nextInt();

        int resto = num % 2;

        if (resto == 0 ){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        scn.close();
    }

    public void ejercicio6(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scn.nextInt();

        if (edad >= 16) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado. Debes tene al menos 16 años.");
        }

        scn.close();
    }

    public void ejercicio7(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu nota:");
        int nota = scn.nextInt();

        if (nota >= 0 && nota <= 10) {
            if (nota <= 4) {
                System.out.println("Tu calificación es: Suspenso");
            } else if (nota >= 5 && nota <= 6) {
                System.out.println("Tu calificación es: Aprobado");
            } else if (nota >= 7 && nota <=8) {
                System.out.println("Tu califación es: Notable");
            } else if (nota >= 9 && nota <= 10) {
                System.out.println("Tu calificación es: Sobresaliente");
            }
        }

        scn.close();
    }

    public void ejercicio8(){

        scn = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scn.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = scn.nextInt();

        if (num1 > num2){
            System.out.println("El número "+num1+" es mayor que "+num2);
        } else {
            System.out.println("El número "+num2+" es mayor que "+num1);
        }

        scn.close();
    }

    public void ejercicio9(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu peso en kg:");
        int peso = scn.nextInt();
        System.out.println("Introduce tu altura en metros:");
        double altura = scn.nextDouble();

        double IMC = peso / (altura*altura);

        if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Estás en peso normal");
        } else if (IMC < 18.5) {
            System.out.println("Estás por debajo de tu peso normal");
        } else if (IMC > 24.9) {
            System.out.println("Estás por encima de tu peso normal");
        }

        scn.close();
    }

    public void ejercicio10(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu altura en cm:");
        int altura = scn.nextInt();

        if (altura >= 120){
            System.out.println("Puedes pasar.");
        } else {
            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        }

        scn.close();
    }

    public void ejercicio11(){

        scn = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra:");
        double importeCompra = scn.nextDouble();
        System.out.println("¿Eres socio?");
        boolean eresSocio = scn.nextBoolean();
        double importeCompraDto;
        double dtoAplicado;

        if (eresSocio && importeCompra >= 200) {
            dtoAplicado = (importeCompra * 0.20);
            importeCompraDto = importeCompra - (dtoAplicado);
            System.out.println("Importe original: "+importeCompra);
            System.out.println("Eres socio y tu compra es >= 200€");
            System.out.println("Descuento aplicaco (20%): "+dtoAplicado+"€");
            System.out.println("Importe final: "+importeCompraDto+"€");
        }
    }

    public void ejercicio12(){

        scn = new Scanner(System.in);

        System.out.println("Introduce contraseña:");
        String pass = scn.next();
        boolean nCaracteres = pass.length() >=8
    }
}
