import java.util.Scanner;

public class Ejercicio2_switch {

    public static void main(String[] args) {
        
        Scanner scanner_desayuno = new Scanner(System.in);
        double costo, costo_final, servicio, propina;
        double pago = 0;
        int contador = 0;
        int contador_final;
        
        System.out.println("""
                           Bienvenido a la cafeteria de la Universidad del Sur.
                           Primero ingresa la cantidad de desayunos que desea comprar: 
                           """);
        contador_final = scanner_desayuno.nextInt();
        while(contador < contador_final){
            System.out.println("""
                           Elija el tipo de desayuno que desee (ingrese el numero de la opcion deseada):
                           1. Moderado
                           2. Mediano
                           3. Extra grande
                           4. Full
                           """);
        int desayuno = scanner_desayuno.nextInt();
        switch(desayuno){
            case 1:
                costo = 45;
                servicio = costo * 0.05; 
                propina = costo * 0.02;
                costo_final = costo + servicio + propina;
                pago += costo_final;
                contador ++;
                break;
            case 2:
                costo = 50;
                servicio = costo * 0.05; 
                propina = costo * 0.02;
                costo_final = costo + servicio + propina;
                pago += costo_final;
                contador ++;
                break;
            case 3:
                costo = 75;
                servicio = costo * 0.05; 
                propina = costo * 0.02;
                costo_final = costo + servicio + propina;
                pago += costo_final;
                contador ++;
                break;
            case 4:
                costo = 120;
                servicio = costo * 0.05; 
                propina = costo * 0.02;
                costo_final = costo + servicio + propina;
                pago += costo_final;
                contador ++;
                break;
            default:
                costo = 0;
                servicio = costo * 0.05; 
                propina = costo * 0.02;
                costo_final = costo + servicio + propina;
                pago += costo_final;
                System.out.println("""
                                   Error
                                   No existe el producto seleccionado. Vuelva a intentar.
                                   """);
        }
        }
        System.out.println("\nEl total a pagar es de: $" + pago + "\nEl costo incluye un pago de 5% por servicio, y 2% de propina.\nGracias por comprar con nosotros. Que tenga un buen dia.");
        
    }   
}
