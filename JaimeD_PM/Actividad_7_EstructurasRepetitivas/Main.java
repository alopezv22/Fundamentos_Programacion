package Actividad_7_EstructurasRepetitivas;

public class Main {
    public static void main(String[] args){
        int Opc;
        Metodos_Escritura Ingresa = new Metodos_Escritura();
        Impares UsImp = new Impares(20);
        Multiplos UsMult = new Multiplos(50);
        Numeros UsNum = new Numeros(20);
        Sueldo UsSld = new Sueldo();

        System.out.println("\u001B[34m_______________________________________________________________________________________________________________\nBienvenido, este programa fue creado para poder realizar diferentes calculos y obtener los resultados deseados.\nIniciando menú.\n_______________________________________________________________________________________________________________\u001B[0m");
        do{
            System.err.print("\u001B[35m\n\nMenú:\u001B[31m\n1. Mostrar los "+UsImp.CantImp+" primeros números naturales impares existentes y su promedio.\u001B[35m\n2. Mostrar la suma de los números múltiplos de 5 menores a "+UsMult.Limit+".\u001B[31m\n3. Ingresar y determinar "+UsNum.CantNum+" números (Mostrara cantidad de: Pares, Negativos y Ceros)\u001B[35m\n4. Calcular aumento de sueldo de acuerdo a la categoria del trabajador.\u001B[31m\n5. Salir del programa.\u001B[35m\nIngresa el número de la opcion a la que quieres ingresar.\n\n\u001B[41m>\u001B[0m");
            Opc=Ingresa.NumEntero();
            switch(Opc){
                case 1->UsImp.NumImpares();
                case 2->UsMult.SumaMultiplos();
                case 3->UsNum.DeterminarNumeros();
                case 4->UsSld.MenúSueldo();
                case 5->System.out.println(">> Saliendo del Programa <<");
                default ->System.out.println("Opción no valida. Por favor, ingresa un número disponible.");
            }
        }while(Opc!=5);
    }
}