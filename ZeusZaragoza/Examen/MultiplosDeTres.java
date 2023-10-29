
package multiplosdetres;


public class MultiplosDeTres {

 
    public static void main(String[] args) {
      

   
        int numeroInicio = 1000;
        int numeroFin = 1500;
        int contador = 0;


        do {
            if (numeroInicio % 3 == 0) {
                System.out.println(numeroInicio);
                contador++;
            }
            numeroInicio++;
        } while (numeroInicio <= numeroFin);

        System.out.println("Cantidad de múltiplos de tres entre 1000 y 1500: " + contador);
    }
}

    

