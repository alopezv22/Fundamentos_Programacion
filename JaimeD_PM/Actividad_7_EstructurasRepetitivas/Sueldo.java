package Actividad_7_EstructurasRepetitivas;

public class Sueldo {
    Metodos_Escritura Ingresa = new Metodos_Escritura();

    String CatA="A", CatB="B", CatC="C", CatD="D", Resp, Job; int Opc;
    double Sueldo, Aumento, A=0.18, B=0.12, C=0.09, D=0.06;

    public void Renombrar(){
        System.out.println("\nEstos son los nombres actiuales:\n1. "+CatA+"\n2. "+CatB+"\n3. "+CatC+"\n4. "+CatD+"\nAhora procederas a cambiar los nombres.\n");
        System.out.print("\nIngresa los nuevos nombres.\n\n1. "+CatA+"\n>");
        CatA=Ingresa.Oracion();
        System.out.print("\n2. "+CatB+"\n>");
        CatB=Ingresa.Oracion();
        System.out.print("\n3. "+CatC+"\n>");
        CatC=Ingresa.Oracion();
        System.out.print("\n4. "+CatD+"\n>");
        CatD=Ingresa.Oracion();
        while(true){
            System.out.println("\nLas categorías quedaron de la siguiente manera: \n1. "+CatA+"\n2. "+CatB+"\n3. "+CatC+"\n4. "+CatD+"\n\n¿Esta todo correcto? y/n");
            while(true){
                System.out.print(">");
                Resp=Ingresa.Oracion().toLowerCase();
                if (Resp.equals("y")||Resp.equals("n")){
                    break;
                }else{
                    System.out.println("\nPara responder ingresa la letra 'y' de Yes o la letra 'n' de No.\n");
                }
            }
            if (Resp.equals("y")){
                break;
            }
            if (Resp.equals("n")){
                System.out.print("\nElije el que deseas corregir. (Ingresa el número de la categoría a corregir)\n>");
                while(true){
                    Opc=Ingresa.NumEntero();
                    if(Opc>0 & Opc<5){
                        break;
                    }else{
                        System.out.println("Ingresa correctamente el número de la categoría a corregir (Del 1 a 4)");
                    }
                }
                switch(Opc){
                    case 1->{
                        System.out.print("\n1. "+CatA+"\n>");
                        CatA=Ingresa.Oracion();
                    }
                    case 2->{
                        System.out.print("\n2. "+CatB+"\n>");
                        CatB=Ingresa.Oracion();
                    }
                    case 3->{
                        System.out.print("\n3. "+CatC+"\n>");
                        CatC=Ingresa.Oracion();
                    }
                    case 4->{
                        System.out.print("\n4. "+CatD+"\n>");
                        CatD=Ingresa.Oracion();
                    }

                }
            }

        }
    }

    public void ChangeAum(){
        System.out.println("\nEstos son los aumentos actuales: \n"+CatA+" -> "+A+"\n"+CatB+" -> "+B+"\n"+CatC+" -> "+C+"\n"+CatD+" -> "+D+"\nAhora procederas a cambiar los aumentos del mayor al menor.");
        System.out.print("\nIngresa los nuevos aumentos.\n\nPara "+CatA+", de "+A+" cambia a \n>");
        A=Ingresa.NumDecilmal();
        System.out.print("\nPara "+CatB+", de "+B+" cambia a \n>");
        B=Ingresa.NumDecilmal();
        System.out.print("\nPara "+CatC+", de "+C+" cambia a \n>");
        C=Ingresa.NumDecilmal();
        System.out.print("\nPara "+CatD+", de "+D+" cambia a \n>");
        D=Ingresa.NumDecilmal();
        while(true){
            System.out.println("\nLos aumentos quedaron de la siguiente manera: \n"+CatA+" -> "+A+"\n"+CatB+" -> "+B+"\n"+CatC+" -> "+C+"\n"+CatD+" -> "+D+"\n\n¿Esta todo correcto? y/n");
            while(true){
                System.out.print(">");
                Resp=Ingresa.Oracion().toLowerCase();
                if (Resp.equals("y")||Resp.equals("n")){
                    break;
                }else{
                    System.out.println("\nPara responder ingresa la letra 'y' de Yes o la letra 'n' de No.\n");
                }
            }
            if (Resp.equals("y")){
                break;
            }
            if (Resp.equals("n")){
                System.out.print("\nElije el que deseas corregir. (Ingresa el número del aumento a corregir)\n>");
                while(true){
                    Opc=Ingresa.NumEntero();
                    if(Opc>0 & Opc<5){
                        break;
                    }else{
                        System.out.println("Ingresa correctamente el número del aumento a corregir (Del 1 a 4)");
                    }
                }
                switch(Opc){
                    case 1->{
                        System.out.print("\nPara "+CatA+", de "+A+" cambia a \n>");
                        A=Ingresa.NumDecilmal();
                    }
                    case 2->{
                        System.out.print("\nPara "+CatB+", de "+B+" cambia a \n>");
                        B=Ingresa.NumDecilmal();
                    }
                    case 3->{
                        System.out.print("\nPara "+CatC+", de "+C+" cambia a \n>");
                        C=Ingresa.NumDecilmal();
                    }
                    case 4->{
                        System.out.print("\nPara "+CatD+", de "+D+" cambia a \n>");
                        D=Ingresa.NumDecilmal();
                    }
                }
            }
        }

    }

    public void ImpCategoria(){
        System.out.println("Categorías  |   Aumento\n1. "+CatA+"   ->   "+A+"\n2. "+CatB+"   ->   "+B+"\n3. "+CatC+"   ->   "+C+"\n4. "+CatD+"   ->   "+D);
    }

    public void MenúCambio(){
        System.out.println("A continuacion se mostraran las categorías y los aumentos predefinidos:\n");
        while(true){
            ImpCategoria();
            System.out.println("\n~ ~ ~ ~ ~ ~ ~\nDeseas editarlo? y/n");
            while(true){
                System.out.print(">");
                Resp=Ingresa.Oracion().toLowerCase();
                if (Resp.equals("y")||Resp.equals("n")){
                    break;
                }else{
                    System.out.println("\nPara responder ingresa la letra 'y' de Yes o la letra 'n' de No.\n");
                }
            }
            if (Resp.equals("y")){
                    System.out.println("\n>> ¿Qué deseas editar? <<\nC -> Categorías\nA -> Aumento");
                    while(true){
                        System.out.print(">");
                        Resp=Ingresa.Oracion().toUpperCase();
                        if (Resp.equals("C")||Resp.equals("A")){
                            break;
                        }else{
                            System.out.println("\nPara responder ingresa la letra 'c' o 'C' de Categoría o la letra 'a' o 'A' de Aumento.\n");
                        }
                    }
                    if (Resp.equals("C")){
                        Renombrar();
                    }
                    if (Resp.equals("A")){
                        ChangeAum();
                    }
            }
            if(Resp.equals("n")){
                break;
            }
        }
    }

    public void MenúSueldo(){
        MenúCambio();
        String a=String.valueOf(CatA.toUpperCase().charAt(0)), b=String.valueOf(CatB.toUpperCase().charAt(0)), c=String.valueOf(CatC.toUpperCase().charAt(0)), d=String.valueOf(CatD.toUpperCase().charAt(0));
        do{
            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\nIngresa la categoria del trabajador ("+a+"="+CatA+", "+b+"="+CatB+", "+c+"="+CatC+", "+d+"="+CatD+")");
            while(true){
                System.out.print(">");
                Resp=Ingresa.Oracion().toUpperCase();
                if (Resp.equals(a)||Resp.equals(b)||Resp.equals(c)||Resp.equals(d)){
                    break;
                }else{
                    System.out.println("\nIngresa correctamente la letra de la categoria ("+a+", "+b+", "+c+", "+d+")");
                }
            }
            System.out.print("\n>> Ingrese el sueldo del trabajador. <<\n>");
            Sueldo=Ingresa.NumDecilmal();
            if (Resp.equals(a)){
                Opc=1;
            }else if (Resp.equals(b)){
                Opc=2;
            }else if (Resp.equals(c)){
                Opc=3;
            }else if (Resp.equals(d)){
                Opc=4;
            }
            switch(Opc){
                case 1->{Aumento=Sueldo*A; Job=CatA;}
                case 2->{Aumento=Sueldo*B; Job=CatB;}
                case 3->{Aumento=Sueldo*C; Job=CatC;}
                case 4->{Aumento=Sueldo*D; Job=CatD;}
            }
            Sueldo+=Aumento;
            System.out.println("\nEl nuevo sueldo del trabajador "+Job+" es: "+Sueldo+"\n\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n¿Deseas ingresar a otro trabajador? y/n");
            while(true){
                System.out.print(">");
                Resp=Ingresa.Oracion().toLowerCase();
                if (Resp.equals("y")||Resp.equals("n")){
                    break;
                }else{
                    System.out.println("\nPara responder ingresa la letra 'y' de Yes o la letra 'n' de No.\n");
                }
            }
        }while(!Resp.equals("n"));
    }
}