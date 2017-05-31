package practica86;
import java.util.*;
public class Practica86 {

    public static void main(String[] args) {
        /**
         * Teclado
         */
        Scanner teclado= new Scanner (System.in);
        /**
         * Declarar objetos
         */
        Menu m = new Menu();
        Contador c1 = new Contador();
                       
        /**
         * Boolean
         */
        boolean finalizar=false;
        
        /**
         * Bucle finalizar
         */
        while(finalizar==false){
            m.setmostrar();
            m.setopcion();

            if(m.getopcion()=='s'){
                finalizar=true;
            }

            else if(m.getopcion()!='i' && m.getopcion()!='d'){
                System.out.println("La opción que ha puesto es errónea");
                System.out.println();
            }
            else{
                /**
                 * Switch
                 */
                switch(m.getopcion()){
                    case 'i':
                        System.out.println("¿Hasta que número deseas llegar");
                        c1.setlimite(teclado.nextInt());
                        c1.incrementar(c1.getlimite());
                        break;
                        
                    case 'd':
                        System.out.println("¿Desde que número deseas empezar a bajar?");
                        c1.setlimite(teclado.nextInt());
                        c1.decrementar(c1.getlimite());
                        break;
                }
            }
    }
    
}
}

    
    

