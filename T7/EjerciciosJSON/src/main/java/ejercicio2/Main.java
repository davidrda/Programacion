package ejercicio2;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        //controller.APIcontroller("https://dummyjson.com/products?limit=5");

        Producto[] array = controller.APIcontroller("https://dummyjson.com/products?limit=5");

        for (int i = 0; i < array.length; i++) {
            System.out.println("ID: " + array[i].getId());
            System.out.println("Title: " + array[i].getTitle());
            System.out.println("Precio: " + array[i].getPrice());
            System.out.println();
        }
    }
}
