package practica32;
import java.util.Scanner;

public class Practica32 {

    public static void main(String[] args) {
        /*Variables*/
        double factorial = 1;
        double numero;
                
        /*Teclado y mensajes*/
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();
        
        /*Operaciones*/
            while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
    }

        System.out.println(factorial);

    }
    
}
