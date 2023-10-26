import java.util.Scanner;

public class Ejercicio_cajero {
    static int check = 0;
    
     public static void despedida() {
       check = 1;
       String despedida = "\"Gracias por usar el cajero de la Universidad del Sur. Que tenga un buen dia\"";
       System.out.println(despedida);
     }
     
     public static void regresarMenu(){
        System.out.println("""
                                   Desea volver al menu?
                                   1. Si
                                   2. No
                                   """);
                Scanner scannerOpcion2 = new Scanner(System.in);
                int opcion2 = scannerOpcion2.nextInt();
                switch (opcion2){
                    case 1:
                        break;
                    case 2:
                        despedida();
                        break;
                }
     }
    public static void main(String[] args) {
        
        final int saldo_inicial=1000;
        double saldo_Actual = saldo_inicial;
        int opcion;
        
        double ingreso,retiro;
        Scanner entrada=new Scanner(System.in);

        while(check < 1){
        System.out.println("Bienvenido al cajero de la Universidad del Sur, por favor seleccione una opcion del menu: \n");
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("3. Ver saldo actual.");
        System.out.println("4. Salir");         
        System.out.print("Ingresar un numero: ");
        opcion=entrada.nextInt();
        
            switch(opcion){
                case 1 :
                    System.out.println("Digite la cantidad que desea ingresar en la cuenta: ");
                    ingreso=entrada.nextDouble();
                    saldo_Actual += ingreso;
                    System.out.println("El saldo Actual es: " + saldo_Actual);
                    regresarMenu();
                    break;
                case 2 :
                    System.out.print("Digite la cantidad que desea retirar: ");
                    retiro=entrada.nextDouble();
                        if(retiro<=saldo_inicial){
                            saldo_Actual -= retiro;
                            System.out.println("Dinero en cuenta: "+ saldo_Actual);
                            regresarMenu();
                        } 
                        else{
                            System.out.println("No cuenta con el saldo suficiente");
                            regresarMenu();
                        }                
                break;
                case 3:
                    System.out.println("El saldo actual es de: " + saldo_Actual);
                    regresarMenu();
                break;
                case 4:
                    despedida();
                break;
            }    
        }
    }
}
