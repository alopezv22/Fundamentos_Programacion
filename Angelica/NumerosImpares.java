
public class NumerosImpares {
    public static void main(String[] args) {
        int cantidadNumeros = 20;
        int suma = 0;

        System.out.println("Los primeros 20 números naturales impares son:");
        for (int i = 1; i <= cantidadNumeros * 2; i += 2) {
            System.out.print(i + " ");
            suma += i;
        }

        double promedio = (double) suma / cantidadNumeros;
        System.out.println("\nEl promedio de los 20 números impares es: " + promedio);
    }
}