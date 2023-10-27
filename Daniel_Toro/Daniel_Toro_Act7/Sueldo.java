package Daniel_Toro_Actividad_7;

import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {

        double sueldo = 0, sueldo_base;
        int opcion;
        boolean continuar = true;
        String confirmacion, respuesta, nombre;
        
        Scanner entrada = new Scanner(System.in);

        while (continuar) {

            sueldo_base = 0;
            nombre = "";

            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|               Bienvenido a SISTEMA UNISUR                |");
            System.out.println("|                                                          |");
            System.out.println("|__________________________________________________________|");
                
            while (nombre.isEmpty()){
                System.out.println("____________________________________________________________");                    
                System.out.println("|                                                          |");
                System.out.println("|   Por favor ingrese el nombre completo del trabajador:   |");
                System.out.println("|__________________________________________________________|\n");
                nombre = entrada.nextLine();
                }

            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|             Por favor indique la categoría               |");
            System.out.println("|             a la que pertence el trabajador:             |");
            System.out.println("|__________________________________________________________|");
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|             Las categorías disponibles son               |");
            System.out.println("|                                                          |");
            System.out.println("|                         1 = A                            |");
            System.out.println("|                                                          |");
            System.out.println("|                         2 = B                            |");
            System.out.println("|                                                          |");
            System.out.println("|                         3 = C                            |");
            System.out.println("|                                                          |");
            System.out.println("|                         4 = D                            |");
            System.out.println("|__________________________________________________________|");
            opcion = entrada.nextInt();
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|           ¿Es correcta la categoria? (Sí/No):            |");
            System.out.println("|                         "+"  "+ opcion +"                              |");
            System.out.println("|__________________________________________________________|");
            confirmacion = entrada.next().toLowerCase();
            if(confirmacion.equals("si")){
            switch (opcion) {
                case 1:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|     Por favor ingrese el sueldo base del trabajador:     |");
                    System.out.println("|__________________________________________________________|");
                    sueldo_base = entrada.nextDouble();
                    sueldo = sueldo_base + (sueldo_base * .18);
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("   El sueldo total correspondiente al trabajador:           ");
                    System.out.println("|                                                          |");
                    System.out.println(   "   "+ nombre                                                );
                    System.out.println("|                                                          |");
                    System.out.println("   cuyo sueldo base es  "+sueldo_base+"$                      ");
                    System.out.println("|                                                          |");
                    System.out.println("   es igual a:                                              ");
                    System.out.println("|                                                          |");
                    System.out.println(   "   " + sueldo + "$"                                         );                                        
                    System.out.println("|__________________________________________________________|");
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|           ¿Los datos son correctos? (Sí/No):             |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|                       Excelente                          |");
                        System.out.println("|__________________________________________________________|");
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|               Ingrese los datos nuevamente               |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                    case 2:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|     Por favor ingrese el sueldo base del trabajador:     |");
                        System.out.println("|__________________________________________________________|");
                        sueldo_base = entrada.nextDouble();
                        sueldo = sueldo_base + (sueldo_base * .12);
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("   El sueldo total correspondiente al trabajador:           ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   "+ nombre                                                );
                        System.out.println("|                                                          |");
                        System.out.println("   cuyo sueldo base es  "+sueldo_base+"$                      ");
                        System.out.println("|                                                          |");
                        System.out.println("   es igual a:                                              ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   " + sueldo + "$"                                         );                                        
                        System.out.println("|__________________________________________________________|");
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|           ¿Los datos son correctos? (Sí/No):             |");
                        System.out.println("|__________________________________________________________|");
                        confirmacion = entrada.next().toLowerCase();
                        if(confirmacion.equals("si")){
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|                       Excelente                          |");
                            System.out.println("|__________________________________________________________|");
                        }else{
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|               Ingrese los datos nuevamente               |");
                            System.out.println("|__________________________________________________________|");
                        }
                    break;
                    case 3:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|     Por favor ingrese el sueldo base del trabajador:     |");
                        System.out.println("|__________________________________________________________|");
                        sueldo_base = entrada.nextDouble();
                        sueldo = sueldo_base + (sueldo_base * .09);
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("   El sueldo total correspondiente al trabajador:           ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   "+ nombre                                                );
                        System.out.println("|                                                          |");
                        System.out.println("   cuyo sueldo base es  "+sueldo_base+"$                      ");
                        System.out.println("|                                                          |");
                        System.out.println("   es igual a:                                              ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   " + sueldo + "$"                                         );                                        
                        System.out.println("|__________________________________________________________|");
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|           ¿Los datos son correctos? (Sí/No):             |");
                        System.out.println("|__________________________________________________________|");
                        confirmacion = entrada.next().toLowerCase();
                        if(confirmacion.equals("si")){
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|                       Excelente                          |");
                            System.out.println("|__________________________________________________________|");
                        }else{
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|               Ingrese los datos nuevamente               |");
                            System.out.println("|__________________________________________________________|");
                        }
                    break;  
                    case 4:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|     Por favor ingrese el sueldo base del trabajador:     |");
                        System.out.println("|__________________________________________________________|");
                        sueldo_base = entrada.nextDouble();
                        sueldo = sueldo_base + (sueldo_base * .06);
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("   El sueldo total correspondiente al trabajador:           ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   "+ nombre                                                );
                        System.out.println("|                                                          |");
                        System.out.println("   cuyo sueldo base es  "+sueldo_base+"$                      ");
                        System.out.println("|                                                          |");
                        System.out.println("   es igual a:                                              ");
                        System.out.println("|                                                          |");
                        System.out.println(   "   " + sueldo + "$"                                         );                                        
                        System.out.println("|__________________________________________________________|");
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|           ¿Los datos son correctos? (Sí/No):             |");
                        System.out.println("|__________________________________________________________|");
                        confirmacion = entrada.next().toLowerCase();
                        if(confirmacion.equals("si")){
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|                       Excelente                          |");
                            System.out.println("|__________________________________________________________|");
                        }else{
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|               Ingrese los datos nuevamente               |");
                            System.out.println("|__________________________________________________________|");
                        }
                    break;                  
                
                default:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|         Por favor seleccione una opcion valida:          |");
                        System.out.println("|__________________________________________________________|");
                    break;
                }
            }
            if (continuar) {
                System.out.println("____________________________________________________________");
                System.out.println("|                                                          |");
                System.out.println("|       ¿Desea realizar otra operación? (Sí/No):           |");
                System.out.println("|__________________________________________________________|");
                respuesta = entrada.next().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|            Gracias por usar SISTEMA UNISUR               |");
                    System.out.println("|                            :)                            |");
                    System.out.println("|__________________________________________________________|");
                    }else{
                        nombre = "";
                    }
                }
            }
            entrada.close();
        }//Hecho por DaniT0r0 
       }//Favor de no copiar ;)
