
import java.util.Scanner;




public class CalculadoraPromedio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el número de alumnos:");
            int numeroAlumnos = scanner.nextInt();
            for (int i = 1; i <= numeroAlumnos; i++) {
                System.out.println("\nIngrese el nombre del alumno " + i + ":");
                scanner.nextLine();
                String nombre = scanner.nextLine();
                
                double fisica = obtenerCalificacion("Física", scanner);
                double ingles = obtenerCalificacion("Inglés", scanner);
                double programacion = obtenerCalificacion("Programación", scanner);
                
              
                double promedioGeneral = (fisica + ingles + programacion) / 3;
                
               
                System.out.println("\nResultados para el alumno " + nombre + ":");
                System.out.println("Calificación en Física: " + fisica);
                System.out.println("Calificación en Inglés: " + ingles);
                System.out.println("Calificación en Programación: " + programacion);
                System.out.println("Promedio general: " + promedioGeneral);
            }
            
        }
    }

    private static double obtenerCalificacion(String materia, Scanner scanner) {
        double calificacion;

        while (true) {
            try {
                System.out.println("Ingrese la calificación en " + materia + ":");
                calificacion = scanner.nextDouble();

                if (calificacion < 0 || calificacion > 10) {
                    throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
                }

                break; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        return calificacion;
    }
}

    
    
