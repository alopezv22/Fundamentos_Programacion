import java.util.Scanner;

public class Examen4 {
     public static void main(String[] args) {
        double saldo = 0, total, servicio, propinas, costo;
        int opcion, ingreso;
        boolean continuar = true;
        String confirmacion, respuesta;
        
        Scanner entrada = new Scanner(System.in);

        while (continuar) {
            System.out.println("____________________________________________________________");
            System.out.println("|                                                          |");
            System.out.println("|                Bienvenido a UNISUR-EATS                  |");
            System.out.println("|__________________________________________________________|");
            System.out.println("|                                                          |");
            System.out.println("|               Le presentamos nuestro menu:               |");
            System.out.println("|                                                          |");
            System.out.println("|                   1. Desayuno Moderado                   |");
            System.out.println("|                                                          |");
            System.out.println("|                   2. Desayuno Mediano                    |");
            System.out.println("|                                                          |");
            System.out.println("|                   3. Desayuno Extra Grande               |");
            System.out.println("|                                                          |");
            System.out.println("|                   4. Desayuno Full                       |");
            System.out.println("|                                                          |");
            System.out.println("|                   5. Salir                               |");
            System.out.println("|__________________________________________________________|");
            System.out.println("|__________________________________________________________|");
            System.out.println("|                                                          |");
            System.out.println("|               Ingrese el número que indique              |");
            System.out.println("|                el desayuno que desea pedir:              |");
            System.out.println("|__________________________________________________________|");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|        Digite la cantidad de desayunos Moderados         |");
                    System.out.println("|                        que desea:                        |");
                    System.out.println("|__________________________________________________________|");
                    ingreso = entrada.nextInt();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                                                          |");
                    System.out.println("|                         "+"  "+ ingreso +"                              |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        costo = ingreso * 45;
                        propinas = costo * 0.02;
                        servicio = costo * 0.05;
                        total = costo + propinas + servicio;
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println(  "             El costo total de su pedido es  $" + total + "                                    ");
                        System.out.println("|__________________________________________________________|");
                        saldo = saldo + total;
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|               Pedido cancelado exitosamente              |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 2:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|         Digite la cantidad de desayunos Medianos         |");
                    System.out.println("|                         que desea:                       |");
                    System.out.println("|__________________________________________________________|");
                    ingreso = entrada.nextInt();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                                                          |");
                    System.out.println("|                         "+"  "+ ingreso +"                              |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        costo = ingreso * 50;
                        propinas = costo * 0.02;
                        servicio = costo * 0.05;
                        total = costo + propinas + servicio;
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println(  "             El costo total de su pedido es  $" + total + "                                    ");
                        System.out.println("|__________________________________________________________|");
                        saldo = saldo + total;
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|               Pedido cancelado exitosamente              |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 3:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|      Digite la cantidad de desayunos Extra grandes       |");
                    System.out.println("|                         que desea:                       |");
                    System.out.println("|__________________________________________________________|");
                    ingreso = entrada.nextInt();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                                                          |");
                    System.out.println("|                         "+"  "+ ingreso +"                              |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        costo = ingreso * 75;
                        propinas = costo * 0.02;
                        servicio = costo * 0.05;
                        total = costo + propinas + servicio;
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println(  "             El costo total de su pedido es  $" + total + "                                    ");
                        System.out.println("|__________________________________________________________|");
                        saldo = saldo + total;
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|               Pedido cancelado exitosamente              |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 4:
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|      Digite la cantidad de desayunos Extra grandes       |");
                    System.out.println("|                         que desea:                       |");
                    System.out.println("|__________________________________________________________|");
                    ingreso = entrada.nextInt();
                    System.out.println("____________________________________________________________");
                    System.out.println("|                                                          |");
                    System.out.println("|          ¿Es correcta esta cantidad? (Sí/No):            |");
                    System.out.println("|                                                          |");
                    System.out.println("|                         "+"  "+ ingreso +"                              |");
                    System.out.println("|__________________________________________________________|");
                    confirmacion = entrada.next().toLowerCase();
                    if(confirmacion.equals("si")){
                        costo = ingreso * 120;
                        propinas = costo * 0.02;
                        servicio = costo * 0.05;
                        total = costo + propinas + servicio;
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println(  "             El costo total de su pedido es  $" + total + "                                    ");
                        System.out.println("|__________________________________________________________|");
                        saldo = saldo + total;
                    }else{
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|               Pedido cancelado exitosamente              |");
                        System.out.println("|__________________________________________________________|");
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                        System.out.println("____________________________________________________________");
                        System.out.println("|                                                          |");
                        System.out.println("|     Por favor seleccione una opcion valida del menu      |");
                        System.out.println("|__________________________________________________________|");
                        costo = 0;
                    break;
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
                    System.out.println("|               Gracias por usar  UNISUR-EATS              |");
                    System.out.println("|                            :)                            |");
                    System.out.println("|                                                          |");
                    System.out.println(  "            El saldo total de su pedido es  $" + saldo + "                                    ");
                    System.out.println("|                                                          |");
                    System.out.println("|                   Disfrute su comida!!!                  |");
                    System.out.println("|__________________________________________________________|");
                    }
                }
            }
            entrada.close();
        }
    } //Hecho por DaniT0r0 
     //Favor de no copiar ;)