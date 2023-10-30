
package ejercicio_con_switch;
import java.util.Scanner;
public class Ejercicio_con_switch {

    public static void main(String[] args) {
    double sueldo;
    char categoria;
    Scanner lectura = new Scanner(System.in);
    System.out.println("Ingrese el sueldo del trabajador");
    sueldo=lectura.nextDouble();
    System.out.println("Ingrese la categoría del trabajador");
    categoria=lectura.next().charAt(0);
    switch(categoria){
        case'A':
        case'a':
          sueldo=sueldo*1.18;
           break;
        case'B':
        case'b':
          sueldo=sueldo*1.12;
          break;
        case'C':
        case'c':
          sueldo=sueldo*1.09;
          break;
        case'D':
        case'd':
          sueldo=sueldo*1.06;
          break;
        default:
          System.out.println("Categoría no valida");
        }    
        System.out.println("El sueldo incremento es:" +sueldo);
    }
}
