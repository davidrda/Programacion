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
            System.out.println("Eres socio y tu compra es: "+importeCompra+"€");
            System.out.println("Descuento aplicado (20%): "+dtoAplicado+"€");
            System.out.println("Importe final: "+importeCompraDto+"€");
        } else if (eresSocio && importeCompra < 200){
            dtoAplicado = (importeCompra * 0.10);
            importeCompraDto = importeCompra - (dtoAplicado);
            System.out.println("Importe original: "+importeCompra);
            System.out.println("Eres socio y tu compra es: "+importeCompra+"€");
            System.out.println("Descuento aplicado (10%): "+dtoAplicado+"€");
            System.out.println("Importe final: "+importeCompraDto+"€");
        } else if (!eresSocio && importeCompra >= 300){
            dtoAplicado = (importeCompra * 0.05);
            importeCompraDto = importeCompra - (dtoAplicado);
            System.out.println("Importe original: "+importeCompra);
            System.out.println("NO eres socio y tu compra es: "+importeCompra+"€");
            System.out.println("Descuento aplicado (5%): "+dtoAplicado+"€");
            System.out.println("Importe final: "+importeCompraDto+"€");
        } else {
            System.out.println("Importe original: "+importeCompra);
            System.out.println("Descuento aplicado: 0€");
            System.out.println("Importe final: "+importeCompra);
        }
    }

    public void ejercicio12(){

        scn = new Scanner(System.in);

        System.out.println("Introduce contraseña:");
        String pass = scn.next();
        boolean nCaracteres = pass.length() >=8; // se indica la longitud que sea igual o mayor a 8
        System.out.println("La contraseña tiene al menos 8 caracteres? "+nCaracteres);
        boolean esValida = !(pass.equals("12345678") || pass.equals("password")); // no puede ser igual a eso
        System.out.println("La contraseña es prohibida? "+!esValida);
        boolean contieneNumero = pass.contains("1") || pass.contains("2") || pass.contains("3") || pass.contains("4") || pass.contains("5") || pass.contains("6") || pass.contains("7") || pass.contains("8") || pass.contains("9") || pass.contains("0");
        System.out.println("La pass contiene al menos un número? "+contieneNumero);
        boolean passValida = nCaracteres && esValida && contieneNumero;
        System.out.println("La contraseña es valida? "+passValida);

    }

    public void ejercicio13(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scn.nextInt();
        System.out.println("Introduce el día de la semana: ");
        int dia = scn.nextInt();
        int calculoEntrada = 0;
        boolean menorDe12 = edad < 12;
        if (edad > 12) {
            calculoEntrada = 0;
        } else if (edad < 17) {
            if (dia == 2) {
                calculoEntrada = 0;
            } else {
                calculoEntrada = 5;
            }
        } else if (edad < 64) {
            if (dia == 4){
                calculoEntrada = 7;
            } else {
                calculoEntrada = 10;
            }
        } else if (edad >= 65) {
            calculoEntrada = 6;
        }

        String diaSemana = "";
        boolean esMartes = dia == 2;

        if (dia == 1) {
            diaSemana = "Lunes";
        } else if (dia == 2) {
            diaSemana = "Martes";
        } else if (dia == 3) {
            diaSemana = "Miercoles";
        } else if (dia == 4) {
            diaSemana = "Jueves";
        } else if (dia == 5) {
            diaSemana = "Viernes";
        } else if (dia == 6) {
            diaSemana = "Sabado";
        } else if (dia == 7) {
            diaSemana = "Domingo";
        }

        System.out.println("Día de la semana: "+diaSemana);
        System.out.println("La entrada para la edad indicada es: "+calculoEntrada+" para el día "+diaSemana);
        System.out.println("Eres menor de 12?: "+menorDe12);
        System.out.println("Es martes? "+esMartes);
    }

    public void ejercicio14(){

        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scn.nextInt();
        System.out.println("Introduce tus ingresos mensuales");
        int ingresos = scn.nextInt();
        System.out.println("Tienes deudas pendientes?");
        boolean deudasPendientes = scn.nextBoolean();

        boolean edadEntre21y65 = edad >= 21 && edad <= 65;
        boolean requisitoIngresos = ingresos >= 1000;
        boolean elegible = !deudasPendientes && edadEntre21y65 && requisitoIngresos;

        if (elegible) {
            System.out.println("Eres elegible");
        } else {
            System.out.println("No eres elegible");
        }
    }

    public void ejercicio15(){

        scn = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete: ");
        int peso = scn.nextInt();
        System.out.println("Introduce la distancia de envío: ");
        int distancia  = scn.nextInt();
        System.out.println("Es envio urgente?");
        boolean envioUrgente = scn.nextBoolean();

        int precioBase = 5;
        int pesoExtra = 0;

        if (peso > 5) {
            pesoExtra = peso - 5;
        }

        int costePesoExtra = pesoExtra * 2;
        double costeTotal = 0;

        if (peso >=5){
            costeTotal = precioBase + costePesoExtra;
        }
        System.out.println("Coste adicional por peso: "+costePesoExtra);
        if (distancia > 100) {
            costeTotal = costeTotal + 10;
        }
        if (envioUrgente) {
            costeTotal = costeTotal * 1.5;
        }
        System.out.println("coste total del envío: "+costeTotal);
    }

    public void ejercicio1_1(){
        scn = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scn.nextInt();
        String diaSemana = "";

        if (numero >= 1 && numero <=7){
            switch (numero){
                case 1:
                    System.out.println("Lunes");
                    diaSemana = "Lunes";
                    break;
                case 2:
                    System.out.println("Martes");
                    diaSemana = "Martes";
                    break;
                case 3:
                    System.out.println("Miércoles");
                    diaSemana = "Miércoles";
                    break;
                case 4:
                    System.out.println("Jueves");
                    diaSemana = "Jueves";
                    break;
                case 5:
                    System.out.println("Viernes");
                    diaSemana = "Viernes";
                    break;
                case 6:
                    System.out.println("Sabado");
                    diaSemana = "Sabado";
                    break;
                case 7:
                    System.out.println("Domingo");
                    diaSemana = "Domingo";
                    break;
                default:
                    System.out.println("No está permitido este número");
            }
        }
        System.out.println("El día "+numero+" es: "+diaSemana);
    }

    public void ejercicio1_2(){
        scn = new Scanner(System.in);
        System.out.println("Introduce tu calificación (A-F): ");
        String calificacion = scn.nextLine();
        String resultado = "";

            switch (calificacion) {
                case "A":
                    resultado = "Excelente";
                    break;
                case "B":
                    resultado = "Muy bien";
                    break;
                case "C":
                    resultado = "Bien";
                    break;
                case "D":
                    resultado = "Suficiente";
                    break;
                case "F":
                    resultado = "Insuficiente";
                    break;
                default:
            }
        System.out.println("Calificación "+calificacion+ " : "+resultado);
    }

    public void ejercicio1_3(){
        scn = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero1 = scn.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numero2 = scn.nextInt();
        System.out.println("Introduce la operación: ");
        String operacion = scn.next();
        int resultado = 0;

        switch (operacion){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
        }
        // System.out.println("Resultado: "+numero1+" "+operacion+" "+numero2+" = "+resultado);
        System.out.printf("%d %s %d = %d%n",numero1,operacion,numero2,resultado);
    }

    public void ejercicio1_4(){

        scn = new Scanner(System.in);

        System.out.println("MENÚ");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");

        System.out.println("Elige una opción: ");
        int opcion = scn.nextInt();
        String resultado = "";

        switch (opcion){
            case 1:
                resultado = "Ver perfil";
                break;
            case 2:
                resultado = "Configuración";
                break;
            case 3:
                resultado = "Ayuda";
                break;
            case 4:
                resultado = "Salir";
                break;
            default:
                System.out.println("No es válido");
        }
        System.out.printf("Has seleccionado: %s%n",resultado);
    }

    public void ejercicio1_5(){

        scn = new Scanner(System.in);
        System.out.println("Introduce el número del mes (1-12):");
        int numeroMes = scn.nextInt();
        String resultado = "";

        switch (numeroMes){
            case 12, 1, 2:
                resultado = "Invierno";
                break;
            case 3, 4, 5:
                resultado = "Primavera";
                break;
            case 6, 7, 8:
                resultado = "Verano";
                break;
            case 9, 10, 11:
                resultado = "Otoño";
                break;
        }
        System.out.printf("El mes %d corresponde a: %s%n",numeroMes,resultado);
    }
}
