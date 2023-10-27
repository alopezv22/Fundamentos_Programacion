package Daniel_Toro_Actividad_7;

import java.util.Scanner;

public class numerosyceros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            int Pares = 0, Ceros = 0, Negativos = 0, Num_ceros = 0, contador = 1, numero, Nuevonumero;

            for (int i = 0; i < 20; i++) {

                System.out.println("____________________________________________________________");
                System.out.println("|                                                          |");
                System.out.println("               Ingrese el "+contador+" numero                     ");
                System.out.println("|__________________________________________________________|");
                numero = entrada.nextInt();

                Nuevonumero = numero;

                while (Nuevonumero != 0) {
                    if (Nuevonumero % 10 == 0) {
                        Num_ceros++;
                    }
                    Nuevonumero /= 10;
                }

                if (numero % 2 == 0) {
                    Pares++;
                }

                if (numero < 0) {
                    Negativos++;
                }

                Ceros = Ceros + Num_ceros;
                contador++;
            }

            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("           La cantidad de números pares es:  "+ Pares +"               ");
            System.out.println("|__________________________________________________________|");   
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("           La cantidad de números negativos es:  "+ Negativos +"               ");
            System.out.println("|__________________________________________________________|"); 
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("              La cantidad de ceros es:  "+ Ceros +"               ");
            System.out.println("|__________________________________________________________|");         

            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|    ¿Desea ejecutar el programa nuevamente? (Sí/No):      |");
            System.out.println("|__________________________________________________________|");         
            String respuesta = entrada.next().toLowerCase();
            continuar = respuesta.equals("si");
        }

            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|            Espero le haya sido de utilidad ;)            |");
            System.out.println("|__________________________________________________________|");   

        entrada.close();
    }
}
