
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_while {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        Scanner contadorScanner = new Scanner(System.in);
        int contador = 1;
        int cuadrado_perfecto;
    
        System.out.print("Se mostrara una lista de numeros enteros cuadrados perfectos mayores a cero y menores al numero que ingreses a continuacion: ");
        int contador_final = contadorScanner.nextInt();

        while((contador * contador) <= contador_final){
            cuadrado_perfecto = contador * contador;
            lista_numeros.add(cuadrado_perfecto);            
            contador ++;
        }
        System.out.println("Los numeros enteros cuadrados perfectos mayores a cero y menores que " + contador_final + " son: \n" + lista_numeros);
    }
    
}
