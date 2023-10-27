public class EjercicioConWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int contador = 1; // Inicializamos el contador en 1
        int sumaImpares = 0; // Inicializamos la suma en 0
        
        while (contador <= 20) {
            if (contador % 2 != 0) {
                System.out.println(contador); // Mostramos el número impar
                sumaImpares += contador; // Sumamos el número impar a la suma
                contador++; // Incrementamos el contador
            }
            else {
                contador++; // Si es par, simplemente incrementamos el contador sin hacer nada más.
            }
        }
        
        // Calculamos el promedio
        double promedio = (double) sumaImpares / 20;
        
        System.out.println("El promedio de los 20 primeros números naturales impares es: " + promedio);
    }
}
