import java.util.Scanner;

public class Ejercicio {

    Scanner scn;

    public void ejercicio1(){;
        /*
        Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco
        operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).
         */
        scn = new Scanner(System.in);
        // 1 - pide al usuario
        // 2 -  haz los calculos
        // 3 - muestra el resultado
        System.out.println("Introduce el primer número:");
        int numero1 = scn.nextInt();
        System.out.println("Introduce el primer número:");
        int numero2 = scn.nextInt();

        int suma = numero1 + numero2;
        int resta  = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
        System.out.println("Módulo (resto): "+modulo);

    }

    public void ejercicio2(){;
        /*
        Escribe un programa que pida dos números al usuario y muestre el resultado de todas
        las comparaciones relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
         */
        scn = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = scn.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scn.nextInt();

        // calculos
        boolean linea1 = num1>num2;
        boolean linea2 = num1<num2;
        boolean linea3 = num1==num2;
        boolean linea4 = num1!=num2;
        boolean linea5 = num1>=num2;
        boolean linea6 = num1<=num2;


        // muestra resultados
        System.out.println("¿"+num1+" es mayor que "+num2+"?: "+linea1);
        System.out.println("¿"+num1+" es menor que "+num2+"?: "+linea2);
        System.out.println("¿"+num1+" es igual a "+num2+"?: "+linea3);
        System.out.println("¿"+num1+" es diferente de "+num2+"?: "+linea4);
        System.out.println("¿"+num1+" es mayor o igual que "+num2+"?: "+linea5);
        System.out.println("¿"+num1+" es menor o igual que "+num2+"?: "+linea6);

    }

    public void ejercicio3(){;
        int valorInicial = 100;
        System.out.println("Valor inicial: "+valorInicial);

        valorInicial += 50;
        System.out.println("Después de sumar 50(+=): "+valorInicial);

        valorInicial -= 30;
        System.out.println("Después de restar 50(-=): "+valorInicial);

        valorInicial *= 2;
        System.out.println("Después de multiplicar por 2 (*=): "+valorInicial);

        valorInicial /= 4;
        System.out.println("Después de dividir entre 4 (/=): "+valorInicial);

    }

    public void ejercicio4(){;
        /*
        Desarrolla un programa que pida un número al usuario y determine
        si es par o impar usando el operador módulo. Muestra el resultado por consola.
         */
        scn = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scn.nextInt();

        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("El número " + numero + " es par (resto al dividir entre 2: " + resto + ")");
        }
        else {
            System.out.println("El número " + numero + " es impar (resto al dividir entre 2: " + resto + ")");
        }
    }

    public void ejercicio5(){;
        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scn.nextInt();

        System.out.println("¿Tienes el carnet de conducir?");
        boolean tieneCarnet = scn.nextBoolean();

        boolean esMayor = edad >= 21;

        System.out.println("¿Eres mayor de 21 años?: "+esMayor);
        System.out.println("¿Tienes carnet?: "+tieneCarnet);

        boolean alquilarCoche = esMayor && tieneCarnet;

        System.out.println("¿Puedes alquilar un coche?: "+alquilarCoche);

        scn.close();
    }

    public void ejercicio6(){;
        scn = new Scanner(System.in);

        System.out.println("Introduce el precio del producto:");
        int precioProducto = scn.nextInt();
        System.out.println("Introduce el porcentaje de descuento:");
        double porcentajeDescuento = scn.nextDouble();

        porcentajeDescuento = porcentajeDescuento/100;

        System.out.println("Precio original: "+precioProducto);

        double precioDescuento = precioProducto * porcentajeDescuento;
        System.out.println("Descuento: "+precioDescuento);

        double precioFinal = precioProducto - precioDescuento;
        System.out.println("Precio final: "+precioFinal);

        scn.close();

    }

    public void ejercicio7(){;
        scn = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scn.nextInt();
        System.out.println("¿Eres estudiante?:");
        boolean eresEstudiante = scn.nextBoolean();

        boolean eresMenor26 = edad < 26;
        System.out.println("¿Eres menor de 26 años?: "+eresMenor26);
        System.out.println("¿Eres estudiante?: "+eresEstudiante);
        System.out.println("¿NO eres estudiante?: "+!eresEstudiante);

        boolean descuentoJoven = eresMenor26 && eresEstudiante;
        System.out.println("¿Tiene descuento joven?: "+descuentoJoven);
        System.out.println("¿Tiene descuento estudiante?: "+eresEstudiante);

        boolean descuentoEspecial = eresMenor26 && eresEstudiante;
        System.out.println("¿Tienes descuento especial?: "+descuentoEspecial);

        scn.close();
    }

    public void ejercicio8(){;
        scn = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = scn.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scn.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = scn.nextInt();

        int suma = num1 + num2 + num3;
        double promedio = suma/3;
        double resultadoFinal = (num1 * num2) / num3;

        System.out.println("Suma de los tres números: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.println("Resultado de (num1 * num2) / num3: "+resultadoFinal);

        scn.close();
    }

    public void ejercicio9(){;
        scn = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        int nota1 = scn.nextInt();
        System.out.println("Introduce la nota del segundo examen:");
        int nota2 = scn.nextInt();
        System.out.println("Introduce la nota del tercer examen:");
        int nota3 = scn.nextInt();

        double notaMedia = (nota1 + nota2 + nota3)/3;
        System.out.println("Nota media: "+notaMedia);

        boolean haAprobado = notaMedia >=5;
        System.out.println("¿Ha aprobado?: "+haAprobado);

        boolean notable = notaMedia >=7;
        System.out.println("¿Tiene notable?: "+notable);

        boolean sobresaliente = notaMedia >=9;
        System.out.println("¿Tiene sobresaliente?: "+sobresaliente);

    }

    public void ejercicio10() {
        ;
        /*
        scn = new Scanner(System.in);

        System.out.println("Introduce el salario por hora:");
        int salarioHora = scn.nextInt();
        System.out.println("Introduce las horas trabajadas:");
        int horasTrabajadas = scn.nextInt();
        boolean horasExtra = horasTrabajadas > 40;
        System.out.println("¿Has hecho horas extra? "+horasExtra);

        int horasNormales = Math.min(horasTrabajadas, 40);
        int numHorasExtra = Math.max(horasTrabajadas - 40, 0);

        System.out.println("Horas normales (máximo 40): "+horasNormales);
        System.out.println("Horas extra: "+numHorasExtra);

        System.out.println("Trabajaste más de 40 horas?: "+horasExtra);

        boolean permitido = true;
        System.out.println("¿Tienes derecho a horas extra?: "+permitido);

        boolean aplicanHorasExtra = horasExtra && permitido;
        System.out.println("¿Se aplican horas extra?: "+aplicanHorasExtra);

        double salario = horasNormales * salarioHora;
        System.out.println("Salario por horas normales: "+salario);

        double salarioExtras = numHorasExtra * (salarioHora*2);
        System.out.println("Salario por horas extra (al doble): "+salarioExtras);

        double salarioTotal = salario + salarioExtras;
        System.out.println("Salario total: "+salarioTotal);

        scn.close();


    }
    */
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Indica cuanto cobras por hora:");
        int salarioHora = lectorTeclado.nextInt();

        System.out.println("Indica cuántas horas has trabajado:");
        int horasTrabajadas = lectorTeclado.nextInt();

        System.out.println("¿Has trabajado horas extras?");
        boolean horasExtras = lectorTeclado.nextBoolean();

        int salarioTotal = 0;
        salarioTotal += 40 * salarioHora;

        if (horasExtras && horasTrabajadas > 40) {
            int numeroHorasExtras = horasTrabajadas - 40;
            salarioTotal += numeroHorasExtras * (salarioHora * 2);
        }

        //System.out.println("El salario cobrado este mes es " + salarioTotal);
        // 3.19 = %.2f (si quieres que salga 3.00 por ejemplo sería %.f
        // 3 = %d
        // "Euros" = %s
        // true = %b
        // A = %c
        System.out.printf("El salario cobrado este mes es %d euros\n",salarioTotal);

        lectorTeclado.close();
    }
}
