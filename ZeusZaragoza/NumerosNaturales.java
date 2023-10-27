public class NumerosNaturales {

 
 
    
    public static void main(String[] args) {
        // Inicializamos variables
        int contador = 1;  // Iniciamos desde el primer número natural impar
        int sumaImpares = 0;
        int cantidadImpares = 0;

        // Bucle do-while para mostrar los primeros 20 números naturales impares y calcular su promedio
        do {
            System.out.print(contador + " ");

            // Sumamos el número actual al total
            sumaImpares += contador;
            cantidadImpares++;

            // Pasamos al siguiente número impar
            contador += 2;

        } while (cantidadImpares < 20);

        // Calculamos el promedio
        double promedio = 0.0;
        if (cantidadImpares > 0) {
            promedio = (double) sumaImpares / cantidadImpares;
            System.out.println("\nPromedio de los primeros 20 números naturales impares: " + promedio);
        } else {
            System.out.println("\nNo hay números naturales impares para calcular el promedio.");
        }
    }
}
     
  

