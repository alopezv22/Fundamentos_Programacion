package Actividad_8_EstructurasRepeticion;

public class Multiplos {
    int CantMult, Num;final int NumInic, NumFin;

    public Multiplos(int NumInic, int NumFin) {
        this.NumInic = NumInic;
        this.NumFin = NumFin;
    }

    public void Sum_Imp_Multiplos(){
        Num=NumInic;
        do{
            Num++;
            if(Num%3==0){
                System.out.println(Num);
                CantMult++;
            }
        }while(Num<NumFin-1);
        System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~\nLa cantidad de multiplos de 3 entre los números "+NumInic+" y "+NumFin+" son: "+CantMult);
    }
}