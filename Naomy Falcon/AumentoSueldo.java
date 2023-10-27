import java.util.Scanner;

public class AumentoSueldo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String categoria;
        double sueldo;
        double aumento;

        System.out.println("Ingrese la categoría del trabajador: ");
        categoria = sc.next();
        System.out.println("Ingrese el sueldo del trabajador: ");
        sueldo = sc.nextDouble();

        switch (categoria) {
            case "A":
                aumento = sueldo * 0.18;
                break;
            case "B":
                aumento = sueldo * 0.12;
                break;
            case "C":
                aumento = sueldo * 0.09;
                break;
            case "D":
                aumento = sueldo * 0.06;
            default:
                aumento = 0;
        }

        double sueldoIncrementado = sueldo + aumento;

        System.out.println("El sueldo incrementado del trabajador es: " + sueldoIncrementado);
    }
}
