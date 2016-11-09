
package practica29;
import java.util.Scanner;

public class Practica29 {


    public static void main(String[] args) {
        /*Variables*/
        int numero;
        int contador=2;
        int numerador=1;
        int denominador=1;
        
        /*Teclado y mensajes*/
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();
        
        /*Operaciones*/
        while(contador<=numero){
            numerador=(denominador*1)+(numerador*contador);
            denominador=denominador*contador;
            contador++;
            
        }
        System.out.println(numerador+" / "+denominador);
        

    }
    
}
