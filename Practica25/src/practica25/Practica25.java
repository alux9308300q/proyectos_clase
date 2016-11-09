package practica25;
import java.util.Scanner;

public class Practica25 {

    public static void main(String[] args) {
        /*Variables*/
        int contador=0;
        int dividendo=0;
        int divisor=3;
        int resultado_suma=0;
        
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Problema*/
        while(contador<10){
            if(dividendo%divisor==0){
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
