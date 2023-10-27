import java.util.Scanner;

public class Dulceria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String desayuno;
        int costoBase;
        double costoServicio;
        double costoPropinas;
        double costoTotal;

        System.out.println("Ingrese el tipo de desayuno: ");
        desayuno = sc.next();

        switch (desayuno) {
            case "1":
                costoBase = 45;
                break;
            case "2" :
                costoBase = 50;
                break;
            case "3":
                costoBase = 75;
                break;
            case "4":
                costoBase = 120;
                break;
            default:
                costoBase = 0;
                System.out.println("El tipo de desayuno ingresado no existe.");
                return;
        }

        costoServicio = costoBase * 0.05;
        costoPropinas = costoBase * 0.02;

        costoTotal = costoBase + costoServicio + costoPropinas;

        System.out.println("El costo total es: " + costoTotal);
    }
}
