package Daniel_Toro_Actividad_7;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        double saldoActual = 1000, ingreso, retiro;
        int opcion;
        boolean continuar = true;
        String confirmacion, respuesta;
        
        Scanner entrada = new Scanner(System.in);

        while (continuar) {
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|                Bienvenido a Banco UNISUR                 |");
            System.out.println("|                                                          |");
            System.out.println("|__________________________________________________________|");
            System.out.println("|                                                          |");
            System.out.println("|         Le presentamos las siguientes opciones:          |");
            System.out.println("|                                                          |");
            System.out.println("|            1. Depositar dinero en Mi Cuenta:             |");
            System.out.println("|                                                          |");
            System.out.println("|             2. Retirar dinero de Mi Cuenta:              |");
            System.out.println("|                                                          |");
            System.out.println("|           3. Consultar el saldo de Mi Cuenta:            |");
            System.out.println("|                                                          |");
            System.out.println("|                       4. Salir:                          |");
            System.out.println("|__________________________________________________________|");
            System.out.println("|__________________________________________________________|");
            System.out.println("|                                                          |");
            System.out.println("|               Ingrese el número que indique              |");
            System.out.println("|            el procedimiento que desea realizar:          |");
            System.out.println("|__________________________________________________________|");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|   Digite la cantidad que desea ingresar en la cuenta     |");
                    System.out.println("|                        en pesos:                         |");
                    System.out.println("|__________________________________________________________|");
                    ingreso = entrada.nextDouble();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                         "+"  $"+ ingreso +"                          |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        saldoActual += ingreso;
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|   El saldo actual de su cuenta es de:  " + saldoActual +  "  pesos       |");
                        System.out.println("|                                                          |");
                        System.out.println("|__________________________________________________________|");
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|            Operacion cancelada exitosamente              |");
                        System.out.println("|                                                          |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 2:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|   Digite la cantidad que desea retirar de su  cuenta:    |");
                    System.out.println("|                                                          |");
                    System.out.println("|__________________________________________________________|");
                    retiro = entrada.nextDouble();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                         "+"  $"+ retiro +"                          |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if (confirmacion.equals("si")){
                        if (retiro <= saldoActual) {
                            saldoActual -= retiro;
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|   Ahora el saldo actual de su cuenta es de:  " + saldoActual + "  pesos  |");
                            System.out.println("|                                                          |");
                            System.out.println("|__________________________________________________________|");
                        } else {
                            System.out.println("____________________________________________________________");
                            System.out.println("|                                                          |");
                            System.out.println("|           - No cuenta con el saldo suficiente            |");
                            System.out.println("|                                                          |");
                            System.out.println("|             - No se puede ejecutar el retiro             |");
                            System.out.println("|                                                          |");
                            System.out.println("|       - Consulte su saldo y repita el procedimeinto      |");
                            System.out.println("|                                                          |");
                            System.out.println("|             - Recuerde ingresar una cantidad             |");
                            System.out.println("|            menor o igual al saldo en su cuenta           |");
                            System.out.println("|__________________________________________________________|");
                        } 
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|            Operacion cancelada exitosamente              |");
                        System.out.println("|                                                          |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 3:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|   El saldo actual de su cuenta es de:  " + saldoActual + "  pesos       |");
                        System.out.println("|                                                          |");
                        System.out.println("|__________________________________________________________|");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|         Por favor seleccione una opcion valida:          |");
                        System.out.println("|                                                          |");
                        System.out.println("|__________________________________________________________|");
                    break;
            }
            if (continuar) {
                System.out.println("____________________________________________________________");
                System.out.println("|                                                          |");
                System.out.println("|       ¿Desea realizar otra operación? (Sí/No):           |");
                System.out.println("|                                                          |");
                System.out.println("|__________________________________________________________|");
                respuesta = entrada.next().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|               Gracias por usar Banco UNISUR              |");
                    System.out.println("|                            :)                            |");
                    System.out.println("|__________________________________________________________|");
                    }
                }
            }
            entrada.close();
        }//Hecho por DaniT0r0 
    }   //Favor de no copiar ;)
