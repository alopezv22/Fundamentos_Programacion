import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JadCoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un mapa para almacenar las calificaciones de los alumnos por materia
        Map<String, List<Double>> materiasCalificaciones = new HashMap<>();

        while (true) {
            System.out.print("Ingrese el nombre del alumno (o escriba 'fin' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("fin")) {
                break;
            }

            System.out.print("Ingrese la materia: ");
            String materia = scanner.nextLine();

            System.out.print("Ingrese la calificación: ");
            double calificacion = scanner.nextDouble();
            scanner.nextLine();  // Consumir el salto de línea

            // Verificar si la materia ya existe en el mapa
            if (materiasCalificaciones.containsKey(materia)) {
                materiasCalificaciones.get(materia).add(calificacion);
            } else {
                List<Double> calificaciones = new ArrayList<>();
                calificaciones.add(calificacion);
                materiasCalificaciones.put(materia, calificaciones);
            }
        }

        // Calcular y mostrar el promedio por materia
        for (Map.Entry<String, List<Double>> entry : materiasCalificaciones.entrySet()) {
            String materia = entry.getKey();
            List<Double> calificaciones = entry.getValue();
            double promedio = calcularPromedio(calificaciones);
            System.out.println("Promedio en " + materia + ": " + promedio);
        }
    }

    public static double calcularPromedio(List<Double> calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
}
