
package practica26;
import java.util.Scanner;

public class Practica26 {

    public static void main(String[] args) {
        /*Variables*/
        int contador = 0;
        int dividendo=1;
        int divisor=2;
        int resultado_suma=0;
                
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Problema*/
        while(contador<20){
            if(dividendo%divisor==1){
                contador=contador+1;
                
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
