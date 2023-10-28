import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio_for {

    public static void main(String[] args) {
        ArrayList<Long> lista_numeros = new ArrayList<>();
        int contadorPares = 0;
        int contadorCeros = 0;
        int contadorNegativos = 0;
        
       Scanner scannerNumero = new Scanner(System.in);
       System.out.println("Ingresa 20 numeros enteros uno por uno: ");
       for (int contadorGeneral = 1; contadorGeneral <= 4 ; contadorGeneral ++){
        long numero = scannerNumero.nextLong();
        lista_numeros.add(numero);
       
            if ((numero % 2)== 0){
                contadorPares ++;
            }
 
            if (numero < 0){
                contadorNegativos ++;
            }
            while (numero != 0){
                if ((numero % 10) == 0){
                    contadorCeros ++;
                }
                numero /= 10;
            }
        }   
       System.out.println("Los numeros que ingresaste son: " + lista_numeros);
       System.out.println("La cantidad de numeros pares es de: " + contadorPares);
       System.out.println("La cantidad de ceros es de: " + contadorCeros);
       System.out.println("La cantidad de numeros negativos es de: " + contadorNegativos);
}
}        

