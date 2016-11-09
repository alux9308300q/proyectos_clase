
package practica28;
import java.util.Scanner;

public class Practica28 {


    public static void main(String[] args) {
        /*Varibles*/
        int numero;
        int resultado = 0;
        int contador;
        
        /*Scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();
        
        /*Operaciones*/
         for(contador=1;contador<(numero+1);contador++){
            if(numero%contador==0){
             resultado++;
            }
         }
            if(resultado!=2){
              System.out.println("No es un numero primo");
            }else{
                System.out.println("Es un numero primo");
         }

    }
    
}
