package practicaextra3;
import java.util.Scanner;
public class menu {
    /**
     * Declaracion variables
     */
    private char opciones;
    private Scanner read= new Scanner(System.in);
    
    /**
     * Declarar set 
     */
    public void setMenu(){
        opciones='.';
    }
    
    /**
     * Declarar set 
     */
    public void setmostrar(){
        System.out.println("¿A qué unidad quieres pasar la cantidad?");
        System.out.println("y=yardas");
        System.out.println("p=pulgadas");
        System.out.println("c=centimetros");
    }
    /**
     * Declarar set 
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Declarar get
     * @return opcion
     */
    public char getopcion(){
        return opciones;
    }
}


