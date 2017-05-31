package practica81;
import java.util.*;
public class Practica81 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Variables
         */
        double radio;
        /**
         * Objeto
         */
        esfera sphera=new esfera();
        /**
         * Problema
         */
        System.out.println("Introduce el radio: ");
        radio=teclado.nextDouble();
        
        sphera.SetArea(radio);
        System.out.println("El area es: "+sphera.GetArea());
        
        sphera.SetVolumen(radio);
        System.out.println("El volumen es "+sphera.GetVolumen());
        
        

    }
    
}
