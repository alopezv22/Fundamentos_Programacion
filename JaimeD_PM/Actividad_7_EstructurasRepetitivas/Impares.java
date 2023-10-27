package Actividad_7_EstructurasRepetitivas;

public class Impares {
    int Num=1; final int CantImp; int SumImp=0; int NumAct=1;

    public Impares(int CantImp) {
        this.CantImp = CantImp;
    }

    public void NumImpares(){
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\nLos primeros "+CantImp+" números naturales impares son:");
        do{
            System.out.println("El "+NumAct+"° número es: "+Num);
            SumImp+=Num;
            Num+=2;
            NumAct+=1;
        }while(NumAct!=(CantImp+1));
        double Prom=(double)SumImp/CantImp;
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n>> El promedio de los números impares es: "+Prom+" <<");
    }
}