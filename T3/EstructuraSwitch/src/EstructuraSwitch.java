import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();
        switch (nota){
            case 1:
                String nombre = "asasa";
                System.out.println("La nota vale 1, has suspendido con honores");
                break;

            case 5:
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Has sacado un sobresaliente");
                break;

            default:
                System.out.println("Esta nota no es analizable");
        }

        System.out.println("Terminando de analizar notas");
    }

    public void estructuraLambda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        String nombre = scanner.next();
        String apellido= "";
        switch (nombre.toLowerCase()){
            case "borja" ->{
                System.out.println("Nombre introducido: Borja");
                apellido = "";
            }
            case "maria" ->{
                System.out.println("Nombre introducido: María");
                apellido = "";
            }
            case "juan" ->{
                System.out.println("Nombre introducido: Juan");
                apellido = "";
            }
            case "marcos" ->{
                System.out.println("Nombre introducido: Marcos");
                apellido = "";
            }
            default -> {

            }
        }
        System.out.println(apellido);
    }

    public void estructuraChar(){
        char letra = 'e';
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("es vocal");
                break;
            default:
                System.out.println("Consonante");
        }
    }

    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor selecciona la opción a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Modulo");
        System.out.println("6 - Salir");
        System.out.println("Que quieres hacer");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1 ->{

            }
            case 2 ->{

            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{

            }
            case 6 ->{

            }
        }
    }
}
