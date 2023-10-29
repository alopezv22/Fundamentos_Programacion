package Actividad_8_EstructurasRepeticion;

import java.util.Scanner;

public class Metodos_Escritura {

    public int NumEntero(){
        int Num=0;
        @SuppressWarnings("resource")
        Scanner Tecl = new Scanner(System.in);
        while(true){
            try{
                Num=Tecl.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Algo fue incorrecto, vuelva a ingresar el número entero\n");
                Tecl.nextLine(); 
            }
        }
        return Num;
    }

    public double NumDecilmal(){
        double Num=0;
        @SuppressWarnings("resource")
        Scanner Tecl = new Scanner(System.in);
        while(true){
            try{
                Num=Tecl.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Algo fue incorrecto, vuelva a ingresar el número\n");
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
}