import java.util.Scanner;

public class Examen3{

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num_terminos; 
        double terminouno, razon;
        String operacion;
        
        System.out.println("____________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|                Ingrese el primer termino:                |");
        System.out.println("|__________________________________________________________|");
        terminouno = scanner.nextDouble();
        System.out.println("____________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|            Ingrese la razon de la sucesion:              |");
        System.out.println("|__________________________________________________________|");
        razon = scanner.nextDouble();
        System.out.println("____________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|             Ingrese el numero de terminos:               |");
        System.out.println("|__________________________________________________________|");
        num_terminos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("____________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|             Ingrese la operacion matemática              |");
        System.out.println("|                   que desea realizar:                    |");
        System.out.println("|__________________________________________________________|");
        System.out.println("|                                                          |");
        System.out.println("|         Le presentamos las siguientes opciones:          |");
        System.out.println("|                                                          |");
        System.out.println("|                  Para adicion ponga un +                 |");
        System.out.println("|                                                          |");
        System.out.println("|                   Para resta ponga un -                  |");
        System.out.println("|                                                          |");
        System.out.println("|               Para multiplicacion ponga un *             |");
        System.out.println("|                                                          |");
        System.out.println("|                  Para division ponga un /                |");
        System.out.println("|__________________________________________________________|");
        operacion = scanner.nextLine();
        System.out.println("____________________________________________________________");
        System.out.println("|                                                          |");
        System.out.println("|                   Esta es su suceción:                   |");
        System.out.println("|__________________________________________________________|");

        for (int i = 0; i < num_terminos; i++) {
            
            double sucesion = 0;

            if (operacion.equals("+")) {
                sucesion = terminouno + (i * razon);
            } else if (operacion.equals("-")) {
                sucesion = terminouno - (i * razon);
            } else if (operacion.equals("*")) {
                sucesion = terminouno * Math.pow(razon, i);
            } else if (operacion.equals("/")) {
                if (razon != 0) {
                    sucesion = terminouno / Math.pow(razon, i);
                } else {
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|               No se puede dividir entre 0:               |");
                    System.out.println("|__________________________________________________________|");
                    break;
                }
            } else {
                System.out.println("____________________________________________________________");
                System.out.println("|                                                          |");
                System.out.println("|                          ERROR                           |");
                System.out.println("|                   Operación no válida:                   |");
                System.out.println("|              Por favor reinicie el programa              |");
                System.out.println("|     Asegurese de usar una de las opciones disponibles.   |");
                System.out.println("|__________________________________________________________|");
                break;
            }

            System.out.println("__________________________________________________________________________");
            System.out.println("|                                                                        |");
            System.out.println(  "                                  " + sucesion + "                                    ");
            System.out.println("|________________________________________________________________________|");
        }
        scanner.close();
    }
}