import java.util.Scanner;

public class EjercicioConSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del trabajador (A, B, C, o D): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        double aumento = 0;

        switch (categoria) {
            case 'A':
                aumento = sueldo * 0.18;
                break;
            case 'B':
                aumento = sueldo * 0.12;
                break;
            case 'C':
                aumento = sueldo * 0.09;
                break;
            case 'D':
                aumento = sueldo * 0.06;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        double sueldoIncrementado = sueldo + aumento;

        System.out.println("Aumento salarial del " + (aumento * 100 / sueldo) + "%");
        System.out.println("Nuevo sueldo: " + sueldoIncrementado);

        scanner.close();
    }
}
