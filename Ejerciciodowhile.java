
package ejercicio_do_while;

public class Ejerciciodowhile {

    public static void main(String[] args) {
        
        int num = 1;
        int cnt = 0;
        double suma = 0;

        do {
           
            if (num % 2 != 0) {
               
                System.out.println(num);
                
                suma += num;
                
                cnt++;
            }

            num++;
        } while (cnt < 20);
       
        double promedio = suma / cnt;
      
        System.out.println("El promedio de los 20 numeros es: " + promedio);
    }
}