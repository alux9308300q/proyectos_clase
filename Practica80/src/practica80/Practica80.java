package practica80;
import java.util.*;

public class Practica80 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Variables
         */
        double arista;
        /**
         * Objeto
         */
        cubo cube=new cubo();
        /**
         * Problema
         */
        System.out.println("Introduce la arista: ");
        arista=teclado.nextDouble();
        
        cube.SetArea(arista);
        System.out.println("El area es: "+cube.GetArea());

    }
    
}
