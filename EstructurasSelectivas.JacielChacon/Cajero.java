import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        final double saldoInicial = 1000.0; // Saldo inicial
        double saldoActual = saldoInicial; // Saldo actual
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a su cajero");
        boolean continuar = true;

        while (continuar) {
            System.out.println("Su saldo actual es: " + saldoActual);
            System.out.println("Seleccione una opción:");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Salir");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad que desea retirar: ");
                    double retiro = entrada.nextDouble();
                    if (retiro > 0) {
                        if (retiro <= saldoActual) {
                            saldoActual -= retiro;
                            System.out.println("Retiro exitoso. Su saldo actual es: " + saldoActual);
                        } else {
                            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
                        }
                    } else {
                        System.out.println("Por favor, ingrese una cantidad válida.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldoActual += deposito;
                        System.out.println("Depósito exitoso. Su saldo actual es: " + saldoActual);
                    } else {
                        System.out.println("Por favor, ingrese una cantidad válida.");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por utilizar nuestro cajero.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}