public class EjercicioConWhile2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int limite = 50;
        int suma = 0;
        int numero = 0;

        while (numero < limite) {
            if (numero % 5 == 0) {
                suma += numero;
            }
            numero++;
        }

        System.out.println("La suma de los múltiplos de 5 menores a 50 es: " + suma);
    }
}

    

