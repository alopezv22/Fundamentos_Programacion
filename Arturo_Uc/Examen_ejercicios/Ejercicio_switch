import java.util.Scanner;

public class Ejercicio_switch {
    public static void main(String[] args) {
       
        System.out.println("Ingresa el sueldo del trabajador: ");
        Scanner scannerSueldo = new Scanner(System.in);
        double sueldo = scannerSueldo.nextDouble();
        double aumentoSueldo;
        double aumento;
        
        System.out.println("""
                           Elige una de las siguientes opciones de categoria del trabajador, ingresando el numero de la opcion deseada. 
                            1.- A 
                            2.- B 
                            3.- C 
                            4.- D 
                            5.- Agregar nueva categoria """);
        Scanner scannerCategoria = new Scanner(System.in);
        int categoria = scannerCategoria.nextInt();
        
        switch(categoria){
            case 1:
                System.out.println("La categoria del trabajador es A, por lo que le corresponde un aumento del 18% \n");
                aumento = sueldo * 0.18;
                aumentoSueldo = aumento + sueldo;
                System.out.println("El nuevo sueldo del trabajador es de: " + aumentoSueldo);
                break;
                
            case 2:
                System.out.println("La categoria del trabajador es B, por lo que le corresponde un aumento del 12% \n");
                aumento = sueldo * 0.12;
                aumentoSueldo = aumento + sueldo;
                System.out.println("El nuevo sueldo del trabajador es de: " + aumentoSueldo);
                break;
                
            case 3:
                System.out.println("La categoria del trabajador es C, por lo que le corresponde un aumento del 9% \n");
                aumento = sueldo * 0.09;
                aumentoSueldo = aumento + sueldo;
                System.out.println("El nuevo sueldo del trabajador es de: " + aumentoSueldo);
                break;
            
            case 4:
                System.out.println("La categoria del trabajador es D, por lo que le corresponde un aumento del 6% \n");
                aumento = sueldo * 0.06;
                aumentoSueldo = aumento + sueldo;
                System.out.println("El nuevo sueldo del trabajador es de: $" + aumentoSueldo);
                break;
                
            case 5:
                System.out.println("Ingresa el nombre de la categoria: ");
                Scanner scannerNombre = new Scanner(System.in);
                String nombreCategoria = scannerNombre.nextLine();
                System.out.println("Ingresa el porcentaje de aumento en el sueldo que le corresponda a esta categoria: ");
                Scanner scannerAumento = new Scanner(System.in);
                double porcentajeAumento = scannerAumento.nextDouble();
                aumento = sueldo * (porcentajeAumento / 100);
                aumentoSueldo = aumento + sueldo;
                System.out.println("El nuevo sueldo del trabajador para la categoria " + nombreCategoria + ", con un aumento del " + porcentajeAumento + "% es de: \n $" + aumentoSueldo);
                break;   
            
            default:
                System.out.println("Elige una categoria valida");
        }
    }
    
}
