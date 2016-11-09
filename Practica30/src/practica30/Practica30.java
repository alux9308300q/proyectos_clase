
package practica30;
import java.util.Scanner;

public class Practica30 {

    public static void main(String[] args) {
        /*Variables*/
        double numero;
        int contador=2;
        double numerador=1;
        double denominador=2;
        
        /*Teclado y mensajes*/
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un numero:");
        numero=teclado.nextDouble();
        
        /*Operaciones*/
        for(contador=2;contador<=numero;contador++){
            numerador=(denominador*contador)+(numerador*Math.pow(denominador,contador));
            denominador=denominador*Math.pow(denominador,contador);
        }
        System.out.println(numerador+" / "+denominador);

    }
    
}
