import java.util.ArrayList;

public class Ejercicio_while {
    public static void main(String[] args) {
        
        ArrayList<Integer> multiplos_cinco = new ArrayList<>();
        int contador = 1;
        int suma = 0;
        while (contador < 50){
            if ((contador % 5)== 0){
                suma += contador;
                multiplos_cinco.add(contador);
                contador ++;
            }else {
             contador ++;
            }
        }
        System.out.println("Los multiplos de 5 menores a 50 son: " + multiplos_cinco);
        System.out.println("La suma de los números múltiplos de 5 menores a 50 es de:\n" + suma);
}
}
