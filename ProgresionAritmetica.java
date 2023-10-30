
package progresionaritmetica;
        import java.util.Scanner;

public class ProgresionAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el valor del primer término (a1): ");
        int a1 = scanner.nextInt();

        
        System.out.print("Ingrese el valor de la razón (d): ");
        int d = scanner.nextInt();

        
        System.out.print("Ingrese el número de términos (n): ");
        int n = scanner.nextInt();

        
        System.out.println("Los términos de la progresión aritmética son:");
        for (int i = 0; i < n; i++) {
            int termino = a1 + i * d;
            System.out.println("Término " + (i + 1) + ": " + termino);
        }
    }
}

        
  
