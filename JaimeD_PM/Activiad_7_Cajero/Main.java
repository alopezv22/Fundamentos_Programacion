package Activiad_7_Cajero;

public class Main {
    public static void main(String[] args){
        DatosCajero Usuario = new DatosCajero(11000);
        Usuario.SldAct=Usuario.SldIni;
        int Opc;
        System.out.println("Saldo en ****************** cuenta: $"+Usuario.SldIni);
        do{
            System.out.print("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\nMenú:\n1. Ingresar dinero a la cuenta.\n2. Retirar dinero de la cuenta.\n3. Salir.\n>");
            Opc=Usuario.NumEntero();
            switch(Opc){
                case 1->Usuario.HacerIngreso();
                case 2->Usuario.HacerRetiro();
                case 3->System.out.println("~ ~ ~ Hasta luego ~ ~ ~");
                default ->System.out.println("Opción no valida. Por favor, ingresa un número disponible.");
            }
        }while(Opc!=3);
    }
}
