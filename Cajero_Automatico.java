
package cajero_automatico;
import java.util.Scanner; 



public class Cajero_Automatico {

    
    public static void main(String[] args) {
        int saldo = 5000, retirar, deposito; 
        Scanner s = new Scanner(System.in); 
        while(true)
        { 
            System.out.println("BIENVENIDO AL CAJERO ALLISWELL\n");
            System.out.println("-----------------------------------"); 
            System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
            System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
            System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
            System.out.println("PRESIONE 4 PARA SALIR ");
            System.out.println("-----------------------------------");
            System.out.println("POR FAVOR SELECIIONES LA OPERACION A REALIZAR");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                retirar = s.nextInt();
                if(saldo >= retirar)
                {
                    saldo = saldo - retirar;
                    System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                }
                else
                {
                    System.out.println("\nBALANCE INSUFICIENTE");
                }
 
                System.out.println("");
                break;
 
                case 2:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                deposito = s.nextInt();
                saldo = saldo + deposito;
                System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
 
                break;
 
                case 3:
                System.out.println("SALDO : "+saldo);
 
                break;
 
                case 4:
                System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                System.exit(0);
            }
        }
    }
}
            
            
            
            
                     
        
