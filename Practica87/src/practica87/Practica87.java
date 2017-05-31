package practica87;
import java.util.*;
public class Practica87 {

    public static void main(String[] args) {
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Creacion objetos
         */
        Menu m = new Menu();
        Libro c1 = new Libro("Metro 2033", "Dimitry Gluvkhosky", 1);
        Libro c2 = new Libro("Cancion de Hielo y Fuego", "George Martin", 1);
                       
        /**
         * Boolean
         */
        boolean finalizar=false;
        
        /**
         * Menu
         */
        while(finalizar==false){ //1º bucle para el 1º menu/Repite la operacion a no ser que se meta el comando establecido para finalizar
            m.setmostrar();
            m.setopcion();
            
            if(m.getopcion()=='s'){//Salir del programa
                finalizar=true;
            }
            else if(m.getopcion()!='a' && m.getopcion()!='b'){//Comando no establecido
                System.out.println("El libro que ha puesto es erróneo");
                System.out.println();
            }
            else{
                while(m.getopcion2()!='f'){//2º bucle para el 1º menu/Repite la operacion a no ser que se meta el comando establecido para finalizar
                    m.setmostrar2();
                    m.setopcion2();
                    /**
                     * Switch
                     */
                    switch (m.getopcion2()){
                        case 'p':
                            if(m.getopcion()=='a'){
                                if(c1.getejemplares()==1){
                                    c1.prestamo();
                                    System.out.println("El prestamo se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("No quedan ejemplares de este libro");
                                }
                            }
                            else{
                                if(c2.getejemplares()==1){
                                    c2.prestamo();
                                    System.out.println("El prestamo se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("No quedan ejemplares de este libro");
                                }
                                
                            }
                            break;
                            
                        case 'd':
                            if(m.getopcion()=='a'){
                                if(c1.getejemplares()==0){
                                    c1.devolucion();
                                    System.out.println("La devolucion se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("Los ejemplares de este libro están completos");
                                }
                            }
                            else{
                                if(c2.getejemplares()==0){
                                    c2.prestamo();
                                    System.out.println("La devolucion se ha finalizado con éxito");
                                }
                                else{
                                    System.out.println("Los ejemplares de este libro están completos");
                                }
                                
                            }
                            break;

                        case 'm':
                            if(m.getopcion()=='a'){
                                System.out.println("Título: "+c1.gettitulo());
                                System.out.println("Autor: "+c1.getautor());
                                System.out.println("Ejemplares: "+c1.getejemplares());
                            }
                            else{
                                System.out.println("Título: "+c2.gettitulo());
                                System.out.println("Autor: "+c2.getautor());
                                System.out.println("Ejemplares: "+c2.getejemplares());
                            }
                            break;
                    }
                }//Fin 2º bucle
                m.reiniciaropcion2();//Reinicio de la 2º eleccion del 2º menu 
            }
        }//Fin 1º bucle
    
}
}
    
    

