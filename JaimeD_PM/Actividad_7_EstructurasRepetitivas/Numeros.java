package Actividad_7_EstructurasRepetitivas;

public class Numeros {
    Metodos_Escritura Ingresa = new Metodos_Escritura();
    int Num, CantPar, Cant0, CantNe; final int CantNum;

    public Numeros(int CantNum) {
        this.CantNum = CantNum;
    }

    public void DeterminarNumeros(){
        CantPar=0;Cant0=0;CantNe=0;
        System.out.println("\nA continuación ingresaras "+CantNum+" números.\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        for (int i=0;i<CantNum;i++){
            System.out.print("Ingresa el "+(i+1)+"° número.\n>");
            Num=Ingresa.NumEntero();
            if (Num%2==0){
                CantPar++;
            }
            if (Num<0){
                CantNe++;
            }
            if (Num==0){
                Cant0++;
            }
            if (Num!=0){
                while(true){
                    if (Num%10==0){
                        Cant0++;
                    }
                    Num/=10;
                    if (Num>-10 & Num<10){
                        break;
                    }
                }
            }
        }
        System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\nResultado:\nPares: "+CantPar+"\nNegativos: "+CantNe+"\nCeros: "+Cant0+"\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
    }
}