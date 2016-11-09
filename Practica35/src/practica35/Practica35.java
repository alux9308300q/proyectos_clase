package practica35;
import java.util.Scanner;

public class Practica35 {

    public static void main(String[] args) {
        /*Variable*/
        double pi=0;
        
        /*Operacion*/
        for(int i=0; i<50000; i++){
            pi +=(4*Math.pow(-1, i))/(2*i+1);
        }
        System.out.println(pi);
    }
    
}
