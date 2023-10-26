public class Ejercicio_do_while {

    public static void main(String[] args) {
        
      int numeroNatural = 1;
      int suma = 0;
      int conteo = 1;
      
      do {
         if ((numeroNatural % 2)== 0){
         
           System.out.println(numeroNatural);
           suma += numeroNatural;
           numeroNatural ++;
           conteo ++;
         } else {
             numeroNatural ++;
         }
         

        }
      while (numeroNatural <= 20);
      double promedio = suma/(conteo-1);
      System.out.println("La suma de los primeros 20 numeros naturales impares es de: " + suma);
      System.out.println("El promedio de los primeros 20 numeros naturales impares es de: " + promedio);

    } 
}
