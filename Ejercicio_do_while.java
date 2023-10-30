
package ejercicio_do_while;

public class Ejercicio_do_while {

    
    public static void main(String[] args) {
     int Numeros = 20;
     int suma = 0;
     
     System.out.println("Ingrese los 20 numeros naturales impares es:");
     
     for(int i= 1; i<=Numeros *2;i +=2){
     System.out.println(i + "");
     suma +=i;
    }
    double promedio=(double)suma/Numeros;
    System.out.println("El promedio de los números es:" + promedio);
    
    }
    
}
