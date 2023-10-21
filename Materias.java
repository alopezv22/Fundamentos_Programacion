
package materias;
import java.util.Scanner;



public class Materias 
{

    
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in); 
        double promedio=0, cal1,cal2,cal3,cal4,suma;
        String nombre; 
        System.out.print("Ingrese el nombre del estudiante:");
        nombre=teclado.next(); 
        
        System.out.println("Ingrese la calificacion de la primera materia");
        cal1 = teclado.nextDouble(); 
        System.out.println("Ingrese la calificacion de la segunda  materia");
        cal2 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion de la tercera materia");
        cal3 = teclado.nextDouble();
        System.out.println("Ingrese la calificacion de la cuarta  materia");
        cal4 = teclado.nextDouble();
        
        suma = cal1 + cal2 + cal3 + cal4; 
        promedio=suma/4; 
        
        if (promedio>=70)
            {
                System.out.println("\nNombre= "+nombre+"\npromedio= "+promedio+"\nEl estudiante es aprobado");
            }
            else 
            {
                System.out.println("\nNombre= "+nombre+"\npromedio= "+promedio+"\nEl estudiante es reprobado");
            }
            
        
    }
    
}
