package practica83;
import java.util.*;

public class Practica83 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Declarar variables
         */
        int a;
        int b;
        int c;       
        /**
         * Objeto
         */
        ecuacion2ogrado equation=new ecuacion2ogrado();
         /**
          * Mensaje
          */
        System.out.println("Introduce A");
        a=teclado.nextInt();
        System.out.println("Introduce B");
        b=teclado.nextInt();
        System.out.println("Introduce C");
        c=teclado.nextInt();
        /**
         * Resultado
         */
        equation.SetEcuacion(a,b,c);
        System.out.println("El primer resultado es: "+equation.GetResultado1());
        System.out.println("El segundo resultado es: "+equation.GetResultado2());

    }
    
}
