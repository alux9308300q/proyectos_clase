package practicaextra1;
import java.util.*;

public class PracticaExtra1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /**
         * Declarar variables
         */
        double hipotenusa = 0;
        double cateto1 = 2;
        double cateto2 = 3;
        /**
         * Objeto
         */
        hipotenusa hypo=new hipotenusa();
        /**
         * Resultado
         */
        hypo.SetPitagoras(hipotenusa,cateto1,cateto2);
        System.out.println("El resultado es: "+hypo.GetResultado());
        

    }
    
}
