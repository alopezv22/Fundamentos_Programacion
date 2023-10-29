
package calculodesayuno;

import java.util.Scanner;

public class CalculoDesayuno {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.println("Tipos de desayuno:");
            System.out.println("1. Moderado ($45)");
            System.out.println("2. Mediano ($50)");
            System.out.println("3. Extra grande ($75)");
            System.out.println("4. Full ($120)");
            System.out.print("Ingrese el tipo de desayuno (1-4): ");
            int tipoDesayuno = scanner.nextInt();
          
            double costo = 0;
       
            switch (tipoDesayuno) {
                case 1 -> costo = 45;
                case 2 -> costo = 50;
                case 3 -> costo = 75;
                case 4 -> costo = 120;
                default -> System.out.println("Tipo de desayuno no válido. Costo = $0");
            }  
            double servicio = 0.05 * costo;
            double propinas = 0.02 * costo;
            double totalPagar = costo + servicio + propinas;
          
            System.out.println("Monto total a pagar: $" + totalPagar);
         
        }
    }
}

    
    

