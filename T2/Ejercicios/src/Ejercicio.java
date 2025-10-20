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

    }
}
