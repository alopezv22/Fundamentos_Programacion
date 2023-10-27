import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        double ingreso, saldoActual = saldo_inicial, retiro;
        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.println("\n1. Ingresar dinero a la cuenta");
                System.out.println("2. Retirar dinero de la cuenta");
                System.out.println("3. Salir");
                System.out.print("Ingrese un número: ");
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Digite la cantidad que desea ingresar en cuenta: ");
                        ingreso = entrada.nextDouble();
                        saldoActual += ingreso;
                        System.out.println("El saldo Actual es: " + saldoActual);
                    }
                    case 2 -> {
                        System.out.print("Digite la cantidad que desea retirar: ");
                        retiro = entrada.nextDouble();
                        if (retiro <= saldoActual) {
                            saldoActual -= retiro;
                            System.out.println("Dinero en cuenta: " + saldoActual);
                        } else {
                            System.out.println("No cuenta con el saldo suficiente");
                        }
                    }
                    case 3 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida");
                }
            } while (opcion != 3);
            // 
        }
    }
}
