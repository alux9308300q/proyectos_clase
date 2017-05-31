package practica79;
import java.util.*;

public class Practica79 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Variables
         */
        double perimetro, apotema;
        /**
         * Objeto
         */
        pentagono pentagon=new pentagono();
        /**
         * Resolucion Problema
         */
        System.out.println("Introduce el perimetro: ");
        perimetro=teclado.nextDouble();
        
        System.out.println("Introduce la apotema: ");
        apotema=teclado.nextDouble();
        
        pentagon.SetArea(perimetro,apotema);
        System.out.println("El area es: "+pentagon.GetArea());

    }
    
}
