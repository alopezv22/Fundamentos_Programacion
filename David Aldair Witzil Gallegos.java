import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> materias = new HashMap<>();

        while (true) {
            System.out.println("Ingrese el nombre del alumno (o escriba 'fin' para salir):");
            String nombreAlumno = scanner.nextLine();

            if (nombreAlumno.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Ingrese la materia:");
            String materia = scanner.nextLine();

            System.out.println("Ingrese la calificación del alumno para " + materia + ":");
            double calificacion = Double.parseDouble(scanner.nextLine());

            if (materias.containsKey(materia)) {
                materias.get(materia).add(calificacion);
            } else {
                List<Double> calificaciones = new ArrayList<>();
                calificaciones.add(calificacion);
                materias.put(materia, calificaciones);
            }
        }

        System.out.println("Promedio por materia:");
        for (String materia : materias.keySet()) {
            List<Double> calificaciones = materias.get(materia);
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            double promedio = suma / calificaciones.size();
            System.out.println(materia + ": " + promedio);
        }

        scanner.close();
    }
}





