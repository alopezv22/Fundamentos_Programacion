import java.util.Scanner;

public class Examen2 {

    public static void main(String[] args) {

        int num_cuadrado = 1, cuadrado, limite;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println("|           Ingresa el numero limite para hacer el calculo:              |");
            System.out.println("|________________________________________________________________________|");

            limite = scanner.nextInt();

            if (limite <= 0) {
                System.out.println("__________________________________________________________________________");
                System.out.println("|                                                                        |");
                System.out.println("|                 Error: el número debe ser mayor a 0                    |");
                System.out.println("|________________________________________________________________________|");
            } else {
                break;
            }
        }

        System.out.println("__________________________________________________________________________");
        System.out.println("|                                                                        |");
        System.out.println("|          Los numeros cuadrados perfectos menores que:                  |");
        System.out.println("                                      "+limite+"  son:"                        );       
        System.out.println("|________________________________________________________________________|");

        while (num_cuadrado * num_cuadrado < limite) {
            cuadrado = num_cuadrado * num_cuadrado;
            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println(  "                                  "+cuadrado                     );       
            System.out.println("|________________________________________________________________________|");
            num_cuadrado++;
        }
        scanner.close();
    }
}