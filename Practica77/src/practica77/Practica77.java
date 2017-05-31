/*FORMA POCO CORRECTA DE HACERLO*/
package practica77;
import java.util.*;

public class Practica77 {


    public static void main(String[] args) {       
        Scanner teclado=new Scanner(System.in);
        /**
         * Variables
         */
        double radio;        
        /**
         * Objeto
         */
        circunferencia circumference=new circunferencia();
        /**
         * Resolucion problema
         */
        System.out.println("Introduce el radio: ");
        radio=teclado.nextDouble();
        
        circumference.Setradio(radio);
        System.out.println("La longitud es de: "+circumference.GetLongitud());
        
        circumference.Setradio(radio);
        System.out.println("El area es de: "+circumference.GetArea());

    }
    
}
