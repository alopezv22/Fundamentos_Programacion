
package ejercicio_for;

import java.util.Scanner;

public class EjercicioFor {

   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           int Cp = 0;
           int Cceros  = 0;
           int Cn = 0;
           for (int i = 0; i < 20; i++) {
               System.out.print("Número " + (i + 1) + ": ");
               int numero = scanner.nextInt();
               
           
               if (numero % 2 == 0) {
                   Cp++;
               }
               
               
               if (numero == 0) {
                   Cceros++;
               }
               
               
               if (numero < 0) {
                    Cn++;
               }
           }  
           System.out.println("Cantidad de números pares: " + Cp);
           System.out.println("Cantidad de ceros: " + Cceros);
           System.out.println("Cantidad de números negativos: " + Cn);
           
       }
    }
}
    
    





