import java.util.Scanner;

public class ProgresionAritmetica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primerTermino;
        int razon;
        int cantidadTerminos;

        System.out.println("Ingrese el primer término: ");
        primerTermino = sc.nextInt();
        System.out.println("Ingrese la razón: ");
        razon = sc.nextInt();
        System.out.println("Ingrese la cantidad de términos: ");
        cantidadTerminos = sc.nextInt();

        for (int i = 0; i < cantidadTerminos; i++) {
            int terminoActual = primerTermino + i * razon;

            System.out.println("El término " + (i + 1) + " es: " + terminoActual);
        }
    }
}
