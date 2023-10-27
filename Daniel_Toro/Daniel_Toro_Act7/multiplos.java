package Daniel_Toro_Actividad_7;

public class multiplos {
    public static void main(String[] args) {

        int num_suma = 5, suma = 0,  numerador = 1;  // Comenzamos con el primer número impar

        while (num_suma<50){
            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println("              ~~  El " + numerador + "° multiplo de 5 mennor a 50 es:  " + num_suma +"  ~~            ");
            System.out.println("|________________________________________________________________________|");
            suma = suma + num_suma;       
            num_suma = num_suma + 5;                           
            numerador++;        
        }


        System.out.println("__________________________________________________________________________");
        System.out.println("|                                                                        |");
        System.out.println("|             La suma de los multiplos de 5 menores a 50 es:             |" );
        System.out.println(  "|                                 " + suma + "                                    |");
        System.out.println("|\"_______________________________________________________________________|");
    }
}
