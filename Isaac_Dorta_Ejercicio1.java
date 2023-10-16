import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        List<String> Materias = new ArrayList<>();
        Materias.add("Física");
        Materias.add("Programación");
        Materias.add("Literatura");

        System.out.println("\u001B[35mUni\u001B[33mSur \u001B[30m| \u001B[0mCalificaciones\n");

        System.out.print("Ingrese la cantidad de los alumnos: \u001B[32m");
        int NumAlumnos = scanner.nextInt();
        scanner.nextLine();

        List<String> nombres = new ArrayList();
        
        Map<String, Map<String, Double>> Calificaciones = new HashMap<>();

        System.out.println("\n\u001B[0m----------------------------------------------------------------");

        for (int i = 1; i <= NumAlumnos; i++) {
            System.out.print("\n\u001B[0mIngrese el nombre del alumno \u001B[36m" + i + "\u001B[0m: \u001B[31m");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        Map<String, Double> calificacionesAlumno = new HashMap<>();

            for (String materia : Materias) {
                System.out.print("\u001B[0mCalificación de \u001B[34m" + materia + "\u001B[0m: \u001B[32m");
                double calificacion = scanner.nextDouble();
                scanner.nextLine();
                calificacionesAlumno.put(materia, calificacion);
            }

            Calificaciones.put(nombre, calificacionesAlumno);
        }

        System.out.println("\n\u001B[0m----------------------------------------------------------------\n\nCalificacion general por materia\n");

        for (String Materia : Materias) {
            double suma = 0;
            for (String nombre : nombres) {
                suma += Calificaciones.get(nombre).get(Materia);
            }
            double promedio = suma / nombres.size();
            System.out.println("\u001B[0mPromedio en \u001B[34m" + Materia + "\u001B[0m: \u001B[32m" + promedio);
        }

        scanner.close();
    }
}