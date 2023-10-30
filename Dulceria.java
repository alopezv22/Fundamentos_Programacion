
package dulceria;    
        import java.util.Scanner;

public class Dulceria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de desayuno (1-4):");
        int tipoDesayuno = scanner.nextInt();
        
        double costoDesayuno = 0;

        switch (tipoDesayuno) {
            case 1:
                costoDesayuno = 45;
                break;
            case 2:
                costoDesayuno = 50;
                break;
            case 3:
                costoDesayuno = 70; 
            case 4:
                costoDesayuno = 120;
                break;
            default:
                System.out.println("Tipo de desayuno no válido. Error.");
                System.exit(1);
        }

       
        double servicio = costoDesayuno * 0.05;
        double propinas = costoDesayuno * 0.02;
        double montoTotal = costoDesayuno + servicio + propinas;

        
        System.out.println("Costo del desayuno: $" + costoDesayuno);
        System.out.println("Costo del servicio (5%): $" + servicio);
        System.out.println("Propinas (2%): $" + propinas);
        System.out.println("Monto total a pagar: $" + montoTotal);

        scanner.close();
    }
}

        
        
        
        
        
        
        
        
        
        

