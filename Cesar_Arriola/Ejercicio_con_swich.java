package ejercicio_con_switch;
import java.util.Scanner;
public class Ejercicio_con_switch {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("**************************************************");
        System.out.println("Ingresar Categoría Del Trabajador (A, B, C, o D): ");
        System.out.println("**************************************************");

        char categoria = entrada.next().toUpperCase().charAt(0);
        
        System.out.println("*****************************************");
        System.out.println("Ingrese el sueldo actual del trabajador: ");
        System.out.println("*****************************************");
        
        double sueldo = entrada.nextDouble();
        double aumento;
        
        switch(categoria) {
            case 'A' -> aumento = sueldo * 0.18; // 
            case 'B' -> aumento = sueldo * 0.12; // 
            case 'C' -> aumento = sueldo * 0.09; // 
            case 'D' -> aumento = sueldo * 0.06; //
            default -> {
                
                System.out.println("***********************");
                System.out.println("Caracteres no validos");
                System.out.println("***********************");

                
                return;
            }
        }
        
        double Aumentosueldo = sueldo + aumento;
        
        System.out.println("************************************************************");
        System.out.println("El sueldo del trabajador recibira un aumento: " + Aumentosueldo);
        System.out.println("************************************************************");

    }
}
