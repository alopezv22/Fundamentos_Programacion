import java.util.Scanner;

public class CuadradosPerfectos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int cuadrado;

        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();

        int i = 1;
        while (i * i < numero) {
            cuadrado = i * i;

            System.out.println(cuadrado);
            i++;
        }
    }
}

