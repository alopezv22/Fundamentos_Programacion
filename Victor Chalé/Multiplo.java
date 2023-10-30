
package multiplo;


public class Multiplo {

    
    public static void main(String[] args) {
        int c = 1000, i=1,cont=0;
        String lista="";
        do{
        if(c%3==0){
           lista=lista+c+"";
           cont++;
           if(i%5==0){
           lista=lista+"\n";
           } i++;
        
        }
        c++;
       }while (c<=1500);
       System.out.println(lista);
       System.out.println("Hay " +cont+ "numero");
    }
    
}
