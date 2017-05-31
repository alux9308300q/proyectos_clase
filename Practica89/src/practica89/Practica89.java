package practica89;
import java.util.*;
public class Practica89 {

    public static void main(String[] args) {
        /**
         * Teclado
         */
        Scanner teclado= new Scanner (System.in);
        /**
         * Declarar objetos
         */
        Menu m = new Menu();
        Fecha c1 = new Fecha();
                       
        /**
         * Boolean
         */
        boolean finalizar=false;
        /**
         * Bucle de finalizacion
         */    
        while(finalizar==false){
            m.setmostrar();
            m.setopcion();
            /**
             * Condicion error
             */
            if(m.getopcion()=='s'){
                finalizar=true;
            }
            else if(m.getopcion()!='m' && m.getopcion()!='v'){
                System.out.println("La opción que pone no es correcta");
                System.out.println();
            }
            else{
                if(m.getopcion()=='m'){
                    c1.fechaactual(c1.getdia(), c1.getmes(), c1.getaño());
                    System.out.println("La fecha actual es:");
                    System.out.println("El "+c1.getdia()+" del "+c1.getmes()+" del "+c1.getaño());
                }
                else{
                    System.out.println("Introduce una fecha");
                    System.out.println("¿Qué dia quieres introducir?");
                    c1.setdia(teclado.nextInt());
                    System.out.println("¿Qué mes quieres introducir?");
                    c1.setmes(teclado.nextInt());
                    System.out.println("¿Qué año quieres introducir?");
                    c1.setaño(teclado.nextInt());
                    
                    c1.fechavalida(c1.getdia(), c1.getmes(), c1.getaño());
                }
            }
    }
    
}
}

