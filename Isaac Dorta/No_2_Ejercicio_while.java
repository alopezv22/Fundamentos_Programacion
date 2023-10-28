public class No_2_Ejercicio_while {
    public static void main(String[] args){
        int numLimit = 50;
        int num = 5;
        int suma = 0;

        System.out.println("Los multiplos de "+num+" a "+numLimit+" son:\n");

        while (num < numLimit) {
            System.out.println(num);
            suma += num;
            num += 5;
        }
        System.out.println("\nLa suma de los multiplos de "+num+" es: "+suma);
    }
}
