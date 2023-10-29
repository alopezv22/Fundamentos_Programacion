package progresicionaritmetica;

import java.util.Scanner;

public class ProgresicionAritmetica {
 public static void main(String[] args) {
       
        try ( 
                Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Ingrese el primer término: ");
            int primerTermino = scanner.nextInt();
            System.out.print("Ingrese la razón: ");
            int razon = scanner.nextInt();
            System.out.print("Ingrese el número de términos: ");
            int numeroTerminos = scanner.nextInt();
            
            System.out.println("Términos de la progresión aritmética:");
            for (int i = 0; i < numeroTerminos; i++) {
                int termino = primerTermino + (i * razon);
                System.out.print(termino + " ");
            }
        
        }
    }
}

   
