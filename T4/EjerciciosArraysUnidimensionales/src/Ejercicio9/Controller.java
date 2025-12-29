package Ejercicio9;

public class Controller {
     public void inicio(){
         int[] arrayOriginal = {2,5,6,9,22,45,66};
         int[] arrayInvertido = new int[arrayOriginal.length];

         for(int i=0;i<arrayOriginal.length;i++){
             arrayInvertido[i]= arrayOriginal[arrayOriginal.length - 1 - i];
         }


         System.out.print("Array original: ");
         for (int i = 0; i < arrayOriginal.length; i++) {
             System.out.print(arrayOriginal[i] + " ");
         }

         System.out.print("\nArray invertido: ");
         for (int i = 0; i < arrayInvertido.length; i++) {
             System.out.print(arrayInvertido[i] + " ");
         }

     }
}
