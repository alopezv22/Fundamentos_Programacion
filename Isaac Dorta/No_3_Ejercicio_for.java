import java.util.Scanner;

public class No_3_Ejercicio_for {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qty_numPares = 0;
        int qty_numCeros = 0;
        int qty_numNegativo = 0;

        for (int i = 0; i < 20; i++){
            System.out.print("Ingresa el No."+(i + 1)+": ");
            int num = scanner.nextInt();

            if (num %2 == 0 && num != 0){
                qty_numPares++;
            }
            if (num < 0){
                qty_numNegativo++;
            }
            if (num == 0){
                qty_numCeros++;
            }
            if (num != 0){
                while (true) {
                    if (num %10 == 0) {
                        qty_numCeros++;
                    }
                    num /= 10;
                    if (num >-10 & num < 10){
                        break;
                    }
                }
            }
        }
        System.out.println("Cantidad de números pares: "+qty_numPares);
        System.out.println("Cantidad de ceros: "+qty_numCeros);
        System.out.println("Cantidad de números negativos: "+qty_numNegativo);
    }
}
