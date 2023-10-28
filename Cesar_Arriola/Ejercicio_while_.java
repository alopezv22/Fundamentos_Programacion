package ejercicio_while_;
public class Ejercicio_while_ {
    
    public static void main(String[] args) {
    int suma = 0;
    for (int i = 5; 
       i < 50; i += 5) {
        suma += i;
     }
        System.out.println("----------------------------------------------------");
        System.out.println("La suma de los múltiplos de 5 menores a 50 es: " + suma);
        System.out.println("----------------------------------------------------");       
    }
}
