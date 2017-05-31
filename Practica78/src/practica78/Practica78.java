/*FORMA POCO CORRECTA DE HACERLO*/
package practica78;
import java.util.*;

public class Practica78 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Variables
         */
        double base, altura;
        /**
         * Objeto
         */
        triangulo triangle=new triangulo();
        /**
         * Resolucion Problema
         */
        System.out.println("Introduce la base: ");
        base=teclado.nextDouble();
        
        System.out.println("Introduce la altura: ");
        altura=teclado.nextDouble();
        
        triangle.Setbase(base);
        triangle.Setaltura(altura);
        System.out.println("El area es: "+triangle.GetArea());

    }
    
}
