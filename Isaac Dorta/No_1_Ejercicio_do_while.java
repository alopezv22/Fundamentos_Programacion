public class No_1_Ejercicio_do_while {
    public static void main(String[] args){
        int num = 20;
        int contador = 1; 
        int suma = 0; 
        int imparesIM = 0;

        System.out.println("Los primeros "+num+" numeros naturales impares son:\n");

        do {
            if (contador %2 != 0){
                System.out.println(contador);
                suma += contador;
                imparesIM++;
            }
            contador++;
        } while (imparesIM < num);

        double promedio = (double) suma / num;

        System.out.println("\nEl promedio de los numeros impares es: "+promedio);
    }
}