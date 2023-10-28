package ejercicio_do_while_;
public class Ejercicio_do_while_ {
    public static void main(String[] args) {
        int Numeros = 20;
        int Lasuma = 0;

        System.out.println("----------------------------------------------");
        System.out.println("Los primeros 20 números naturales impares son:");
        System.out.println("----------------------------------------------");
        
        for (int i = 1; i <= Numeros * 2; i += 2) {
         System.out.println(i + " ");
         Lasuma += i;
        }
         double promedio = (double) Lasuma / Numeros;
        System.out.println("------------------------------------------");
        System.out.println("El Promedio de estos números es: " + promedio);
        System.out.println("------------------------------------------");
        System.out.println("FIN_DEL_PROGRAMA");
        System.out.println("------------------------------------------");
    } 
}
