package Actividad_8_EstructurasRepeticion;

public class Main {
    public static void main(String[] args){
        Metodos_Escritura UEscr = new Metodos_Escritura();
        Multiplos UMult = new Multiplos(1000, 1500);
        Numeros_Ent_Cuad UNum = new Numeros_Ent_Cuad(0);
        Progresion UProg = new Progresion();
        Dulceria UDulce = new Dulceria("Moderado", "Mediano", "Extra grande", "Full", 45, 50, 75, 120);

        int Opc; String Resp;

        while(true){
            System.out.print("\u001B[35mMenú Programas:\n1. Mostrar los números múltiplos de tres, y la cantidad, comprendidos entre los números "+UMult.NumInic+" y "+UMult.NumFin+".\n2. Calcular y mostrar los números enteros cuadrados perfectos mayores que cero y menores a un número ingresado por teclado.\n3. Determinar y mostrar los términos de una progresión aritmética.\n4. Tienda Dulceria.\n5. Salir.\n~ ~ ~ ~ Ingresa el número del programa al que quieres acceder. ~ ~ ~ ~\n");
            while(true){
                System.out.print("\u001B[41m>\u001B[0m ");
                Opc=UEscr.NumEntero();
                if (Opc==1||Opc==2||Opc==3||Opc==4||Opc==5){
                    break;
                }else{
                    System.out.println("Ingresa una opción valida. (1, 2, 3, 4 o 5)");
                }
            }
            switch (Opc) {
                case 1->UMult.Sum_Imp_Multiplos();
                case 2->UNum.CalculoNum();
                case 3->UProg.ProgArit();
                case 4->{
                    UDulce.MostrarMenu();
                    UDulce.MenuDulceria(UEscr.NumEntero());
                }
                case 5->System.out.println("Saliendo del programa...");
            }
            if (Opc==5){
                break;
            }
            System.out.println("\n¿Quieres ingresar a otro programa?");
            while (true) {
                System.out.print("\u001B[41m>\u001B[0m");
                Resp=UEscr.Oracion().toLowerCase();
                if (Resp.equals("s")||Resp.equals("n")){
                    break;
                }else{
                    System.out.println("\nPara responder ingresa la letra 's' de Si o la letra 'n' de No.\n");
                }
            }
            if (Resp.equals("n")){
                break;
            }
        }
    }
}