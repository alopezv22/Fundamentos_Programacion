
package cuadradosperfectos;
        
        import java.util.Scanner;

public class CuadradosPerfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroMaximo = scanner.nextInt();
        scanner.close();

        int numero = 1;
        while (numero * numero < numeroMaximo) {
            int cuadrado = numero * numero;
            System.out.println("Cuadrado perfecto: " + cuadrado);
            numero++;
        }
    }
}

        
        
        
        
    
