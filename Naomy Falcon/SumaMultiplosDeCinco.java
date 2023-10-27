import java.util.Scanner;

public class SumaMultiplosDeCinco {

    public static void main(String[] args) {
        int numero = 5;
        int suma = 0;

        while (numero < 50) {

            suma += numero;

            numero += 5;
        }

        System.out.println("La suma de los múltiplos de 5 menores a 50 es: " + suma);
    }
}
