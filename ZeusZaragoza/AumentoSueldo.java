import java.util.Scanner;

public class AumentoSueldo{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número de trabajadores: ");
            int numTrabajadores = scanner.nextInt();
            for (int i = 1; i <= numTrabajadores; i++) {
                System.out.println("\nTrabajador #" + i);
                
                System.out.print("Ingrese la categoría del trabajador (A, B, C, D): ");
                char categoria = scanner.next().toUpperCase().charAt(0);
                
                double sueldo;
                System.out.print("Ingrese el sueldo del trabajador: ");
                sueldo = scanner.nextDouble();
                
                double porcentajeAumento = 0;
                
                switch (categoria) {
                    case 'A' -> porcentajeAumento = 18;
                    case 'B' -> porcentajeAumento = 12;
                    case 'C' -> porcentajeAumento = 9;
                    case 'D' -> porcentajeAumento = 6;
                    default -> {
                        System.out.println("Categoría no válida. El trabajador #" + i + " no recibirá aumento.");
                        
                        continue;
                    }
                }
                
            
                double aumento = sueldo * (porcentajeAumento / 100);
                
              
                double sueldoIncrementado = sueldo + aumento;
                
                
                System.out.println("Sueldo incrementado del trabajador #" + i + ": " + sueldoIncrementado);
            }
            
        }
    }
}
