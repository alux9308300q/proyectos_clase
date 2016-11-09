
package practica31;
import java.util.Scanner;

public class Practica31 {


    public static void main(String[] args) {
        /*Variables*/
        int contador=0;
        int N;
        int resultado=0;
        
        /*Teclado y mensajes*/
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un numero:");
        N=teclado.nextInt();
        
        /*Operaciones*/
        while(resultado<=N){
            resultado=resultado+contador;
            contador++;
        }
        System.out.println(contador);

    }
    
}
