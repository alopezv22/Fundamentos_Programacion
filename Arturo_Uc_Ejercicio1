
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Promedio {

    public static void main(String[] args) {
        System.out.println("Bienvenido al calculador de promedios");
        System.out.println("Primero tienes que definir el numero de materias y la cantidad de alumnos\n");
        
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Ingresa el numero de materias");
        int numMaterias = scannerNum.nextInt();
        System.out.println("Ingresa el numero de alumnos");
        int numAlumnos = scannerNum.nextInt();  
        
        System.out.println("Ahora tendras que ingresar el nombre de los alumnos, para posteriormente ingresar las calificaciones de cada alumno por materia \n");
        
        ArrayList<String> listaAlumnos = new ArrayList<>();

    
        System.out.println("Ingresa uno por uno el nombre de los alumnos");
            for (int conteo = 0; conteo < numAlumnos; conteo ++){
                Scanner scannerAlumnos = new Scanner(System.in);
                String nombreAlumno = scannerAlumnos.nextLine();
                listaAlumnos.add(nombreAlumno);
            }
        HashMap<String, Double> mapMaterias = new HashMap<>();
        HashMap<String, Double> promediosMaterias = new HashMap<>();   
            for (int conteo = 0; conteo < numMaterias; conteo ++){
                Scanner scannerMateria = new Scanner(System.in);
                System.out.println("Escribe el nombre de la materia");
                String nombreMateria = scannerMateria.nextLine();
                Scanner scannerCalificacion = new Scanner (System.in);
                    for (String alumno : listaAlumnos) {
                        System.out.println("Ingresa la calificacion de " + alumno);
                        Double califAlumno = scannerCalificacion.nextDouble();        
                        mapMaterias.put(alumno, califAlumno);
                    }
                Double sumaCalificaciones = 0.0;
                    for (String materia : mapMaterias.keySet()) {
                    sumaCalificaciones += mapMaterias.get(materia);}
                    Double promedioGeneral = sumaCalificaciones / numAlumnos;
                    promediosMaterias.put(nombreMateria, promedioGeneral);
            }
        System.out.println("Los promedios generales de las materias son:\n " + promediosMaterias);
    }   
}
    
