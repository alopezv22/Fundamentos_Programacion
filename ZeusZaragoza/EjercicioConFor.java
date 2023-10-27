import java.util.Scanner;

public class EjercicioConFor {

   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           int cantidadPares = 0;
           int cantidadCeros = 0;
           int cantidadNegativos = 0;
           for (int i = 0; i < 20; i++) {
               System.out.print("Ingrese el número #" + (i + 1) + ": ");
               int numero = scanner.nextInt();
               
           
               if (numero % 2 == 0) {
                   cantidadPares++;
               }
               
               
               if (numero == 0) {
                   cantidadCeros++;
               }
               
               
               if (numero < 0) {
                   cantidadNegativos++;
               }
           }  
           System.out.println("Cantidad de números pares: " + cantidadPares);
           System.out.println("Cantidad de ceros: " + cantidadCeros);
           System.out.println("Cantidad de números negativos: " + cantidadNegativos);
           
       }
    }
}
    
    

