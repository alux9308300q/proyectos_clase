package practicaextra3;
import java.util.*;
public class PracticaExtra3 {
    public static void main(String[] args) {
        /**
         * Declarar objetos
         */
        menu p1 = new menu();
        operaciones p2 = new operaciones();
        
        /**
         * Teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Pies
         */
        System.out.println("Introduce tu cantidad en pies: ");
        p2.setpies(teclado.nextDouble());
        
        /**
         * Menu
         */
        p1.setmostrar();
        p1.setopcion();
        
       /**
        * Hacer el switch llamando a cada operación y mostrando resultados
        */
       switch(p1.getopcion()){
           case 'y':
                p2.opeyardas(p2.getpies());
                
                System.out.println("La cantidad en yardas es "+p2.getyardas());
                break;
            
           case 'p':
                p2.opepulgadas(p2.getpies());

                System.out.println("La cantidad en pulgadas es "+p2.getpulgadas());
                break;
            
           case 'c':
                p2.opecentimetros(p2.getpies());
                
                System.out.println("La cantidad en centimetros es "+p2.getcentimetros());
                break;
               
               
       }
    }
    
}