package Activiad_7_Cajero;

import java.util.Scanner;

public class DatosCajero {
    public int NumEntero(){
        int Num=0;
        @SuppressWarnings("resource")
        Scanner Tecl = new Scanner(System.in);
        while(true){
            try{
                Num=Tecl.nextInt();
                break;
            }catch (Exception e){
                System.out.print("Algo fue incorrecto, vuelva a dijitar la cantidad en números enteros\n>");
                Tecl.nextLine(); 
            }
        }
        return Num;
    }
    public String Oracion(){
        String Orc;
        @SuppressWarnings("resource")
        Scanner Tecl = new Scanner(System.in);
        Orc=Tecl.nextLine();
        return Orc;
    }

    final int SldIni; //Saldo Inicial, Opcion
    double Ingrs,Ret,SldAct; //Ingreso, Retiro, Saldo Actual

    public DatosCajero(final int SldIni) {
        this.SldIni = SldIni;
    }

    public void HacerIngreso(){
        System.out.print("Digite la cantidad que desea ingresar en ****************** cuenta:\n>");
        Ingrs=NumEntero();
        SldAct+=Ingrs;
        System.out.println("\nEl saldo Actual es: "+SldAct);
    }

    public void HacerRetiro(){
        System.out.print("Digite la cantidad que desea retirar: \n>");
        Ret=NumEntero();
        if(Ret<=SldAct){
            SldAct-=Ret;
            System.out.println("\nDinero en cuenta: "+SldAct);
        }else{
            System.out.println("\nNo cuenta con el saldo suficiente");
        }
    }
}
