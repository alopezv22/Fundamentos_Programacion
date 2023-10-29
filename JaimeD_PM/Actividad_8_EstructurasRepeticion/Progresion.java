package Actividad_8_EstructurasRepeticion;

public class Progresion {
    Metodos_Escritura Ing = new Metodos_Escritura();
    int PrimTerm, Razon, NumTerm, Term;

    public void ProgArit(){
        System.out.print("\nIngrese el primer término.\n>");
        PrimTerm=Ing.NumEntero();
        System.out.print("\nIngrese la razón o diferencia común.\n>");
        Razon=Ing.NumEntero();
        System.out.print("\nIngrese el número de terminos a mostrar.\n>");
        NumTerm=Ing.NumEntero();
        System.out.println("\nLos terminos de la progresión aritmética son:\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        for (int i=0; i<NumTerm; i++){
            Term=PrimTerm+i*Razon;
            System.out.println((i+1)+"° Término: "+Term);
        }
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
    }
}