package Daniel_Toro_Actividad_7;

public class  numerosnaturales{
    public static void main(String[] args) {

        int num_suma = 1, suma = 0, cont_terminos = 0, numerador = 1;

        do {
            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println("        ~~  El " + numerador + "° numero natural impar mennor a 20 es:  " + num_suma +"  ~~            ");
            System.out.println("|________________________________________________________________________|");
            suma = suma + num_suma;       
            num_suma = num_suma + 2;               
            cont_terminos++;            
            numerador++;        
        } while (cont_terminos < 20);

        double promedio = (double) suma / cont_terminos;

        System.out.println("__________________________________________________________________________");
        System.out.println("|                                                                        |");
        System.out.println("|         Promedio de los primeros 20 números naturales impares:         |" );
        System.out.println(  "|                                   " + promedio + "                                 |");
        System.out.println("|\"_______________________________________________________________________|");

    }//Hecho por DaniT0r0
}   //Favor de no copiar ;)
