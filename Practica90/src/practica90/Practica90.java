package practica90;
import java.util.*;
public class Practica90 {

    public static void main(String[] args) {
        /**
         * Declarar objeto
         */
        dni c1 = new dni();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * DNI y resultado
         */
        System.out.println("Dime tu numero del DNI");
        c1.setdni(teclado.nextInt());
        c1.calculo(c1.getdni());
    }
    
}

