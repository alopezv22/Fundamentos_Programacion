

package ejercicio.con.wile;

/**
 *
 * @author Angelou
 */
public class Ejericioconwile {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 5; i < 50; i += 5) {
            suma += i;
        }
        
        System.out.println("La suma de los múltiplos de 5 menores a 50 es: " + suma);
    }
}

