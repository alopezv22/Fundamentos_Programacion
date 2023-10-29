package Actividad_8_EstructurasRepeticion;

public class Numeros_Ent_Cuad {
    Metodos_Escritura Ing = new Metodos_Escritura();
    int Num, NumFin, Cuadrado=0; final int NumInic;

    public Numeros_Ent_Cuad(int NumInic) {
        this.NumInic = NumInic;
        this.Num=(NumInic+1);
    }

    public void CalculoNum(){
        System.out.println("\nIngresa el número limite.");
        while (true) {
            System.out.print(">");
            NumFin=Ing.NumEntero();
            if (NumFin>0) {
                break;
            }else{
                System.out.println("Ingresa un número mayor a 0.");
            }
        }
        System.out.println("Números enteros cuadrados perfectos mayores que "+NumInic+" y menores que "+NumFin);
        while (Cuadrado<NumFin) {
            Cuadrado=Num*Num;
            if (Num>0&&Cuadrado>0){
                System.out.println(Cuadrado+"="+(Num)+"^2");
            }
            Num++;
            Cuadrado=Num*Num;
        }
    }
}