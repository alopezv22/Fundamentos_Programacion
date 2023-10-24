
package promedowhile;

import java.util.Scanner;
public class PromeDowhile {
int i = 0;
String [] nombre;
double n1, n2 , n3 , prom;
    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int i = 0;
    do{
      System.out.println("Ingrese el nombre del Alumno" +(i+1));
     String nombre = leer.next();
     System.out.println("Ingrese la nota 1 ");
     double n1 = leer.nextDouble();
     System.out.println("Ingrese la nota 2 ");
     double n2 = leer.nextDouble();
     System.out.println("Ingrese la nota 3 ");
     double n3= leer.nextDouble();
     double prom = (n1+n2+n3)/3;
     System.out.println("El promedio de notas de "+nombre+" es "+prom);
     i++;
    
    
         }
         while (i < 30);
    }
    
}
