package practica84;
import java.util.*;
public class Menu {
    /**
     * Declarar las variables
     */
    private char opciones;
    private char opciones2;
    private Scanner read= new Scanner(System.in);
    
    /**
     * Declarar Set
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Declarar Set
     */
    public void setmostrar(){
        System.out.println("Selecciona la cuenta a la que deseas acceder:");
        System.out.println("a=cuenta1");
        System.out.println("b=cuenta2");
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
     * Declarar Get/Eleccion del Menu 1
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
    /**
     * Declarar Set
     */
    public void setMenu2(){
        opciones='.';
    }
    /**
     * Declarar Set/2º menu
     */
    public void setmostrar2(){
        System.out.println("¿Qué desea hacer?: ");
        System.out.println("i=ingresar");
        System.out.println("r=reintegro");
        System.out.println("t=transferencia");
        System.out.println("m=mostrar saldo");
        System.out.println("d=datos personales");
        System.out.println("f=finalizar transacciones");
    }
    /**
     * Declarar Set
     */
    public void setopcion2(){
        this.opciones2=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Declarar Get/Eleccion del Menu 2
     * @return opciones 2
     */
    public char getopcion2(){
        return opciones2;
    }
    /**
     * Variable para reiniciar Menu 2
     */
    public void reiniciaropcion2(){
        opciones2='.';
    }
}


