
package ejercicio.pkgfor;

import java.util.Scanner;

public class EjercicioFor{
    public static void main(String[] args) {
      try (Scanner entrada = new Scanner(System.in)) {
        int cantidadpares =0;
        int ceros = 0;
        int canNegativos = 0;
        
        System.out.println("------------------");
        System.out.println("Ingresa 20 Numeros");
        System.out.println("------------------");
        
        for (int i = 0;i< 20;i++){
            int numero = entrada.nextInt();
            
            if (numero %2==0){
               cantidadpares++;
            }
            if (numero == 0){
                ceros ++;
            }
            if (numero<0){
               canNegativos++;
            } 
          }
          System.out.println("Cantidad de numeros pares: " + cantidadpares);
          System.out.println("------------------------------------------");
          System.out.println("Cantidad de numeros ceros: " + ceros);
          System.out.println("---------------------------------");
          System.out.println("Cantidad de numeros negativos:  " + canNegativos);
          System.out.println("---------------------------------------------");
          System.out.println("Fin del programa");
          System.out.println("----------------");
      
      }   
       
    }
    
}
