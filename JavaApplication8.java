
package javaapplication8;
import java.util.Scanner;


public class JavaApplication8 {

    
    public static void main(String[] args) {
        // 1.- Pide la cantidad de alumnos
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos alumnos hay en el salón? ");
        int cantidadAlumnos = sc.nextInt();

        // 2.- Pide los nombres de los alumnos
        String[] nombresAlumnos = new String[cantidadAlumnos];
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("¿Cuál es el nombre del alumno " + (i + 1) + "? ");
            nombresAlumnos[i] = sc.next();
        }

        // 3.- Pide la cantidad de materias
        System.out.print("¿Cuántas materias hay en el salón? ");
        int cantidadMaterias = sc.nextInt();

        // 4.- Pide los nombres de las materias
        String[] nombresMaterias = new String[cantidadMaterias];
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.print("¿Cuál es el nombre de la materia " + (i + 1) + "? ");
            nombresMaterias[i] = sc.next();
        }

        // 5.- Pide las calificaciones de cada materia y alumno
        int[][] calificaciones = new int[cantidadAlumnos][cantidadMaterias];
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < cantidadMaterias; j++) {
                System.out.print("¿Cuál es la calificación del alumno " + nombresAlumnos[i] + " en la materia " + nombresMaterias[j] + "? ");
                calificaciones[i][j] = sc.nextInt();
            }
        }

        // Calcula el promedio de cada alumno
        for (int i = 0; i < cantidadAlumnos; i++) {
            int sumaCalificaciones = 0;
            for (int j = 0; j < cantidadMaterias; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            double promedioAlumno = sumaCalificaciones / cantidadMaterias;
            System.out.println("El promedio del alumno " + nombresAlumnos[i] + " es " + promedioAlumno);
        }

        // Calcula el promedio del salón
        int sumaCalificacionesSalon = 0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < cantidadMaterias; j++) {
                sumaCalificacionesSalon += calificaciones[i][j];
            }
        }
        double promedioSalon = sumaCalificacionesSalon / (cantidadAlumnos * cantidadMaterias);
        System.out.println("El promedio del salón es " + promedioSalon);
        
         // Calcula el promedio de cada materia
        int[] sumaCalificacionesMaterias = new int[cantidadMaterias];
        for (int i = 0; i < cantidadMaterias; i++) {
            for (int j = 0; j < cantidadAlumnos; j++) {
                sumaCalificacionesMaterias[i] += calificaciones[j][i];
            }
        }
        double[] promedioMaterias = new double[cantidadMaterias];
        for (int i = 0; i < cantidadMaterias; i++) {
            promedioMaterias[i] = sumaCalificacionesMaterias[i] / cantidadAlumnos;
        }

        // Imprime el promedio de cada materia
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("El promedio de la materia " + nombresMaterias[i] + " es " + promedioMaterias[i]);
        }
        
        
       
    }
    
}
