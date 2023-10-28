import java.util.ArrayList;

public class Ejercicio2_do_while {

    public static void main(String[] args) {
        int contador = 1000;
        int cantidad = 0;
        ArrayList<Integer> multiplos_tres = new ArrayList<>();
        
        do{
            if ((contador % 3)== 0){
                multiplos_tres.add(contador);
                contador ++;
                cantidad ++;
            }
            else{
                contador ++;
            }
        }
        while(contador < 1500);
        System.out.println("La cantidad de multiplos de 3 comprendidos entre 1000 y 1500 es de: \n" + cantidad + "\ny son: " + multiplos_tres);
    }

}
