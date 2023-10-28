package Isaac_Dorta_Ejercicios_2;

import java.util.Scanner;

public class No_4_Borrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char categoria;
        double sueldo, aumento = 0;
        boolean salir = false;

        while (!salir) {
            System.out.print("Bienvenido | Sueldos de los Trabajadores | UniSur\n\n----------------------------------------------------------------\n¿Que desea realizar?\n\n1. Calcular saldo\n2. Salir\n\n");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            System.out.print("----------------------------------------------------------------\nIngrese la categoría que le corresponde\n\n"+
                             "Categoria | Aumento\n    A         18%\n    B         12%\n    C          9%\n    D          6%\n\n");

            switch (opcion) {
                case 1:
                    while (true) {
                        System.out.print("Ingrese la categoría del trabajador: ");
                        categoria = sc.next().charAt(0);

                        switch (categoria) {
                            case 'A':
                                aumento = 0.18;
                                break;
                            case 'B':
                                aumento = 0.12;
                                break;
                            case 'C':
                                aumento = 0.09;
                                break;
                            case 'D':
                                aumento = 0.06;
                                break;
                            default:
                                System.out.println("\n[ ERROR ] Categoría no válida.");
                                continue;
                        }

                        System.out.print("----------------------------------------------------------------\nIngrese el sueldo actual del trabajador: ");
                        sueldo = sc.nextDouble();

                        double nuevoSueldo = sueldo + (sueldo * aumento);

                        System.out.println("El aumento correspondiente es: " + (aumento * 100) + "%");
                        System.out.println("\nEl sueldo incrementado del trabajador es: " + nuevoSueldo + "\n----------------------------------------------------------------");

                        System.out.print("¿Desea calcular otro sueldo? (S para sí, N para no): ");
                        char respuesta = sc.next().charAt(0);

                        if (respuesta != 'S' && respuesta != 's') {
                            salir = true;
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        
        System.out.println("Saliendo del programa.");
        sc.close();
    }
}