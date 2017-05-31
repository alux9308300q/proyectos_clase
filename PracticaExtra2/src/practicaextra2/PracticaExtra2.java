package practicaextra2;
import java.util.Scanner;
public class PracticaExtra2 {

    public static void main(String[] args) {
        /**
         * Teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Declarar objetos
         */
        operaciones p1 = new operaciones();
                       
        /**
         * Declarar dinero
         */
        System.out.println("Introduce los segundos:");
        p1.setsegundos(teclado.nextInt());

        /**
         * Operacion
         */
        p1.operacion(p1.getsegundos(), p1.gettiemposec(), p1.gettiempoarray());
        
        /**
         * Mostrar resultado/Bucle
         */
        for(int i=0; i<5; i++){
            if(p1.gettiempoarray()[i]>0){
                System.out.println(p1.gettiempoarray()[i]+" "+p1.getnombre()[i]);
            }
        }
    }
    
}

    
    
