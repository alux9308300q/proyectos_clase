
package practica13;
/*Importar scanner*/
import java.util.Scanner;

public class Practica13 {

    public static void main(String[] args) {

        /*Declarar variables*/
        int a;
        int b;
        int c;
        double resultado1;
        double resultado2;
        
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        
         /*Mensaje*/
        System.out.println("Introduce A");
        
        /*Lectura por teclado*/
        a=teclado.nextInt();
        
        /*Mensaje*/
        System.out.println("Introduce B");
        
        /*Lectura por teclado*/
        b=teclado.nextInt();
        
        /*Mensaje*/
        System.out.println("Introduce C");
        
        /*Lectura por teclado*/
        c=teclado.nextInt();
        
        /*Operacion*/
        resultado1= (b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        resultado2= (b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        /*Mostrar resultado*/
        System.out.println("Mostrar resultado :");
        System.out.println(resultado1);
        System.out.println(resultado2);
       
    }
    
}
