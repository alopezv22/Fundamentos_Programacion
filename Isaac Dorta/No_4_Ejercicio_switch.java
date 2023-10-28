package Isaac_Dorta_Ejercicios_2;

import java.util.Scanner;

public class No_4_Ejercicio_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bienvenido | Sueldos de los Trabajadores | UniSur\n\n"+
                         "----------------------------------------------------------------\n"+
                         "Ingrese la categoría que le corresponde\n\n"+
                         "Categoria | Aumento\n"+
                         "    A         18%\n    B         12%\n    C          9%\n    D          6%");
        char categoria = sc.next().charAt(0);

        System.out.print("Ingrese el sueldo actual del trabajador: ");
        double sueldo = sc.nextDouble();

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
                System.out.println("Categoría no válida. Ingrese A, B, C o D.");
                return;
        }

        double nuevoSueldo = sueldo + aumento;

        System.out.println("El aumento correspondiente es: " + aumento);
        System.out.println("El sueldo incrementado del trabajador es: " + nuevoSueldo);

        sc.close();
    }
}