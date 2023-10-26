import java.util.ArrayList;

public class Ejercicio_do_while {

    public static void main(String[] args) {
      ArrayList<Integer> numeros_impares = new ArrayList<>();  
      int numero_natural = 1;
      int suma = 0;
      int conteo = 1;
      
      do {
         if ((numero_natural % 2)== 0){
            numero_natural ++;

         } else {
           suma += numero_natural;
           numeros_impares.add(numero_natural);
           numero_natural ++;
           conteo ++;
         }
        }
      while (conteo <= 20);
      double promedio = suma/(conteo-1);
      System.out.println("Los primeros 20 numeros naturales impares son: " + numeros_impares);
      System.out.println("La suma de los primeros 20 numeros naturales impares es de: " + suma);
      System.out.println("El promedio de los primeros 20 numeros naturales impares es de: " + promedio);

    } 
}
