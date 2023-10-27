package Actividad_7_EstructurasRepetitivas;

public class Multiplos {
    final int Limit; int Suma=0; int Num=1;

    public Multiplos(int Limit) {
        this.Limit = Limit;
    }

    public void SumaMultiplos(){
        while(Num!=(Limit)){
            if(Num%5==0){
                Suma+=Num;
                Num++;
            }else{
                Num++;
            }
        }
        System.out.println("La suma de los números múltiplos de 5 menores a "+Limit+" es: "+Suma);
    }
}