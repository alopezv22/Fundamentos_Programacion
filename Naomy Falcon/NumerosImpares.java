import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        // Declaramos las variables
        int numero = 1;
        int contador = 0;
        double suma = 0;

        do {
           
            if (numero % 2 != 0) {
               
                System.out.println(numero);
                
                suma += numero;
                
                contador++;
            }

            numero++;
        } while (contador < 20);
       
        double promedio = suma / contador;
      
        System.out.println("El promedio de los 20 primeros números naturales impares es: " + promedio);
    }
}