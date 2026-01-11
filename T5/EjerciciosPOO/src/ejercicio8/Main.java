package ejercicio8;

public class Main {

    public static void main(String[] args) {

        Empleado[] arrayEmpleados = new Empleado[5];

        arrayEmpleados[0] = new Empleado("Desarrolladora","Ana", 35000);
        arrayEmpleados[1] = new Empleado("Diseñador","Adrian", 5000);
        arrayEmpleados[2] = new Empleado("Profesor","Borja", 3000);
        arrayEmpleados[3] = new Empleado("Piloto","Luis", 37000);
        arrayEmpleados[4] = new Empleado("Mecanica","Sandra", 18000);

        for (int i = 0; i < arrayEmpleados.length; i++) {
            System.out.print(i + 1 + ". ");
            arrayEmpleados[i].mostrarEmpleados();
        }

        int mayorSalario = 0;
        Empleado empleadoMayor = null;

        for (int i = 0; i < arrayEmpleados.length; i++) {
            if ( arrayEmpleados[i].getSalario() > mayorSalario){
                mayorSalario = arrayEmpleados[i].getSalario();
                empleadoMayor = arrayEmpleados[i];
            }
        }

        System.out.println();
        System.out.println("Empleado con mayor salario: "+empleadoMayor.getNombre()+" ("+mayorSalario+"€)");

        int sumaTotalSalario = 0;

        for (int i = 0; i < arrayEmpleados.length; i++) {
            sumaTotalSalario += arrayEmpleados[i].getSalario();
        }

        int promedioSalario = sumaTotalSalario/arrayEmpleados.length;

        System.out.println("El salario promedio es: "+promedioSalario+"€");
    }
}
