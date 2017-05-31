package practica87;
import java.util.*;
public class Menu {
    /**
     * Teclado
     */
    private Scanner read= new Scanner(System.in);
    /**
     * Declaracion variables
     */
    private char opciones;
    private char opciones2;
    /**
     * Declarar Set Menu1(INICIALIZACION)
     */    
    public void setMenu(){
        opciones='.';
    }
    /**
     * Declarar Set Menu1
     */
    public void setmostrar(){
        System.out.println("¿A qué libro desea acceder?");
        System.out.println("a=libro1");
        System.out.println("b=libro2");
        System.out.println("s=salir");
    }
    /**
     * Declarar Set
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Declarar Get
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
    /**
     * Declarar Set Menu2(INICIALIZACION)
     */
    public void setMenu2(){
        opciones='.';
    }
    /**
     * Declarar Set Menu2
     */
    public void setmostrar2(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("p=préstamo");
        System.out.println("d=devolución");
        System.out.println("m=mostrar libro");
        System.out.println("f=finalizar");
    }
    /**
     * Declarar Set Opcion
     */
    public void setopcion2(){
        this.opciones2=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Declarar Get
     * @return opciones2
     */
    public char getopcion2(){
        return opciones2;
    }
    /**
     * Reiniciar
     */
    public void reiniciaropcion2(){
        opciones2='.';
    }
}

