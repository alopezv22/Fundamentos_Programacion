package tareaclase14_10;
import java.util.Scanner;
public class Tareadeclase14_10 {

    public static void main(String[] args) {
         int numAlumnos;
        int numeroMaterias;
        String[] nombresAlumnos;
        String[] materias;
        int[][] calificacion;
        float[] promediosxMaterias;
         try (
        var scanner = new Scanner(System.in)) {
            System.out.println("Ingresar numero de alumnos: ");
            numAlumnos = scanner.nextInt();
            System.out.println("Ingresar numero de materias: ");
            numeroMaterias = scanner.nextInt();
            nombresAlumnos = new String[numAlumnos];
            materias = new String[numeroMaterias];
            calificacion = new int[numAlumnos][numeroMaterias];
            promediosxMaterias = new float[numeroMaterias];
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("Ingresar nombre del alumno " + (i + 1) + ": ");
                nombresAlumnos[i] = scanner.next();
                }
            for (int i = 0; i < numeroMaterias; i++) {
                System.out.println("Nombre de la materia " + (i + 1) + ": ");
                materias[i] = scanner.next();
            }
            for (int i = 0; i < numAlumnos; i++) {
                for (int j = 0; j < numeroMaterias; j++) {
                    System.out.println("Ingresa una calificacion del alumno " + nombresAlumnos[i] +  " en la materia " + materias[j] + ": ");
                    calificacion[i][j] = scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < numeroMaterias; i++) {
            int sumaCalificaciones = 0;
            for (int j = 0; j < numAlumnos; j++) {
                sumaCalificaciones += calificacion[j][i];
            }
            promediosxMaterias[i] = sumaCalificaciones / numAlumnos;
        }
        System.out.println("El resultado es:");
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numeroMaterias; j++) {
                System.out.println("Materia de " + materias[j] + " Calificacion: " + calificacion[i][j]);
                System.out.println("    ");
            }
        }
        System.out.println("Promedio por materia:");
        for (int i = 0; i < numeroMaterias; i++) {
            System.out.println("Materia de " + materias[i] + " Calificacion promedio 1de: " + promediosxMaterias[i]);
        }
    }    
}
