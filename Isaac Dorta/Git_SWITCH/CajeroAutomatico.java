import java.util.Scanner;
import java.io.*;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double saldo = obtenerSaldo();
        int opcion;
        double ingreso, retiro;

        System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
        System.out.println("Bienvenido a \u001B[34mEl Gran Banco \u001B[32mMX");
        System.out.println("\n\u001B[30m----------------------------------------------------------------\u001b[0m\n");
        System.out.println("Menu | \u001B[34mBanco \u001B[32mMX\u001B[0m\n\n¿Qué decea realizar?\u001B[0m\n\u001B[36mTiene que poner un número de nuestro menú para proseguir.\u001B[0m\n\n1. Deposito\n2. Retiro\n\u001B[41m3. Salir\n\u001B[0m");
        System.out.println("Tu saldo actual es de: \u001B[32m"+saldo+"\u001B[0m\n");

        System.out.print("Ingresar un número: ");
        opcion = entrada.nextInt();

        System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");

        switch (opcion) {
            case 1:
                System.out.print("Digite la cantidad que desea ingresar en cuenta: ");
                ingreso = entrada.nextDouble();
                saldo += ingreso;

                System.out.println("El saldo actual es: \u001B[32m" + saldo);
                System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
                guardarSaldo(saldo);
                break;
                
            case 2:
                System.out.print("Digite la cantidad que desea retirar: ");
                retiro = entrada.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;

                    System.out.println("El saldo actual es: \u001B[31m" + saldo);
                    System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
                    guardarSaldo(saldo);
                } else {
                    System.out.println("No cuenta con el saldo suficiente");
                    System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
                }
                break;
                
            case 3:
                System.out.println("Vuelva pronto");
                System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
                break;
                
            default:
                System.out.println("Opción no válida");
                System.out.println("\n\u001B[30m----------------------------------------------------------------\u001B[0m\n");
                break;
        }
        entrada.close();
    }

    public static double obtenerSaldo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("saldo.txt"));
            double saldo = Double.parseDouble(reader.readLine());
            reader.close();
            return saldo;
        } catch (IOException e) {
            return 1000.0;
        }
    }

    public static void guardarSaldo(double saldo) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("saldo.txt"));
            writer.write(Double.toString(saldo));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}