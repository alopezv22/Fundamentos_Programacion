public class Examen1 {
    public static void main(String[] args) {

        int numero = 1000, numerador = 1, contador = 0; 

        do {
            if (numero % 3 == 0){
            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println("      ~~  El " + numerador + "° numero multiplo de 3 mayor a 1000 y menor a 1500 es:  " + numero +"  ~~            ");
            System.out.println("|________________________________________________________________________|");
                contador++;
                numerador++;
            }
            numero++;
        } while (numero <= 1500);

        System.out.println("__________________________________________________________________________");
        System.out.println("|                                                                        |");
        System.out.println("|          cantidad de numeros multiplos de 3 entre 1000 y 1500:         |");
        System.out.println("                                      "+contador+"" );       
        System.out.println("|________________________________________________________________________|");

    }//Hecho por DaniT0r0
}   //Favor de no copiar ;)
