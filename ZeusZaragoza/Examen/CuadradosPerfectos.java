package cuadradosperfectos;

import java.util.Scanner;
public class CuadradosPerfectos {
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Ingrese un número límite: ");
            int limite = scanner.nextInt();
          
            int numero = 1;
           
            while (numero * numero < limite) {
     
                int cuadrado = numero * numero;
                
             
                System.out.println("Cuadrado perfecto: " + cuadrado);
                
               
                numero++;
            }
           
        }
    }
}

    
    

