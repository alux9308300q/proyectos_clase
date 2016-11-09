
package practica18;
/*Importar scanner*/
import java.util.Scanner;

public class Practica18 {

    public static void main(String[] args) {
        /*Declarar variables*/
        int año;
        int mes;
        
        /*Crear scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("¿Qué año es?");
        año=teclado.nextInt();
        
        System.out.println("Introduce numero del mes:");
        mes=teclado.nextInt();
        
        /*Operaciones*/
       if(mes==2 && año%4==0||año%100==0&&año%400==0){
            System.out.println("Este mes tienes 29 dias");
            }
        else{
            if(mes==2 && (año%4!=0 ||año%100!=0 && año%400!=0)) {
        System.out.println("Este mes tiene 28 dias");
        }
            else{
            if(mes==4 || mes==6 || mes==9 || mes==11) {
        System.out.println("Este mes tiene 30 dias");
        } 
            else{
            System.out.println("Este mes tiene 31 dias");
            }
              
            } 
        }

    }
    
}
