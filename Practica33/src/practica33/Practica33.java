
package practica33;
import java.util.Scanner;

public class Practica33 {

    public static void main(String[] args) {
        /*Declarar variables*/
        int contador = 2;
        int dividendo=1;
        int divisor=2;
        int resultado_suma=0;
                
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Operaciones*/
        while(contador<=10000){
            if(dividendo%divisor==0){
                contador=contador+2;
                
                resultado_suma=resultado_suma+dividendo;
                
                dividendo=dividendo+1;
                
            }
            else{  
                dividendo=dividendo+1;
            }
            
            
        }
        System.out.println(resultado_suma);

    }
    
}
