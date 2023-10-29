package Actividad_8_EstructurasRepeticion;

public class Dulceria {
    final String A, B, C, D; final int CostA, CostB, CostC, CostD;
    double Total;

    public Dulceria(String A, String B, String C, String D, int CostA, int CostB, int CostC, int CostD) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.CostA = CostA;
        this.CostB = CostB;
        this.CostC = CostC;
        this.CostD = CostD;
    }

    public void MostrarMenu(){
        System.out.print("\nMenú:\nTipo             |Costo\n1="+A+"       |$"+CostA+"\n2="+B+"        |$"+CostB+"\n3="+C+"   |$"+CostC+"\n4="+D+"           |$"+CostD+"\n~ ~ ~ ~Ingresa el número del desayuno que quieres ~ ~ ~ ~\n>");
    }

    public void MenuDulceria(int Opc){
        switch (Opc) {
            case 1->{
                Total=CostA+(CostA*0.05)+(CostA*0.02);
                System.out.println("Monto total a pagar: "+Total);
            }
            case 2->{
                Total=CostB+(CostB*0.05)+(CostB*0.02);
                System.out.println("Monto total a pagar: "+Total);
            }
            case 3->{
                Total=CostC+(CostC*0.05)+(CostC*0.02);
                System.out.println("Monto total a pagar: "+Total);
            }
            case 4->{
                Total=CostD+(CostD*0.05)+(CostD*0.02);
                System.out.println("Monto total a pagar: "+Total);
            }
            default->{
                Total=0+(0*0.05)+(0*0.02);
                System.out.println("Monto total a pagar: "+Total+"\n\u001B[31m # ~ % $ / & Error, el numero ingresado no tiene precio & / $ % ~ # \u001B[0m");
            }
        }
    }
}