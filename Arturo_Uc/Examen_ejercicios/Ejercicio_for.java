
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2_for {

    public static void main(String[] args) {
    
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        Scanner scanner_progresion = new Scanner(System.in);
        
        System.out.println("Este programa tiene la funcion de mostrar los terminos de una progresion aritmetica determinada.\n Primero ingresa la cantidad numeros que quieras obtener:");
        int conteo_final = scanner_progresion.nextInt();
        System.out.println("Ahora ingresa el valor de la razon de la progresion aritmetica: ");
        int razon = scanner_progresion.nextInt();
        System.out.println("Por ultimo, ingresa el numero con el que empieza la progresion: ");
        int primer_numero = scanner_progresion.nextInt();
        lista_numeros.add(primer_numero);
        
        for (int contador = 0; contador <= conteo_final; contador ++){
            primer_numero += razon;
            lista_numeros.add(primer_numero);
        }
        System.out.println("Los terminos de la progresion aritmetica determinada a partir de los parametros ingresados son: \n" + lista_numeros);
    }
    
}
