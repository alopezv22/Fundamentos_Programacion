import java.util.Scanner;

public class NumerosPCN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numero;
        int contadorPares = 0;
        int contadorCeros = 0;
        int contadorNegativos = 0;


        for (int i = 1; i <= 20; i++) {

            System.out.println("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }

            if (numero == 0) {
                contadorCeros++;
            }

            if (numero < 0) {
                contadorNegativos++;
            }
        }


        System.out.println("La cantidad de números pares es: " + contadorPares);
        System.out.println("La cantidad de ceros es: " + contadorCeros);
        System.out.println("La cantidad de números negativos es: " + contadorNegativos);
    }
}
