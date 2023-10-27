
import java.util.Scanner;

public class EjercicioconSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la categoría del trabajador (A, B, C o D): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Ingrese el sueldo actual del trabajador: ");
        double sueldo = scanner.nextDouble();
        double aumento;
        
               
        switch(categoria) {
            case 'A' -> aumento = sueldo * 0.18; // 
            case 'B' -> aumento = sueldo * 0.12; // 
            case 'C' -> aumento = sueldo * 0.09; // 
            case 'D' -> aumento = sueldo * 0.06; //
            default -> {
                System.out.println("Categoría no válida");
                return;
            }
        }
        
        double nuevoSueldo = sueldo + aumento;
        System.out.println("El nuevo sueldo del trabajador es: " + nuevoSueldo);
    }
}
