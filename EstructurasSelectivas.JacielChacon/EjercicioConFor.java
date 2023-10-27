import java.util.Scanner;

public class EjercicioConFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosPares = 0;
        int ceros = 0;
        int numerosNegativos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            }

            if (numero == 0) {
                ceros++;
            }

            if (numero < 0) {
                numerosNegativos++;
            }
        }

        System.out.println("Cantidad de números pares: " + numerosPares);
        System.out.println("Cantidad de ceros: " + ceros);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);

        scanner.close();
    }
}