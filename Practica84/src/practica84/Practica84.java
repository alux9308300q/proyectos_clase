package practica84;
import java.util.*;
public class Practica84 {

    public static void main(String[] args) {
        /**
         * Teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Declarar objetos
         */
        Menu m = new Menu();
        Cuenta c1 = new Cuenta("George", "Tat", "", "X9308300Q", "26794531", "10%");
        Cuenta c2 = new Cuenta("Carlos", "Clares", "Cucala", "36325562F", "69412578", "5%");
              
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
            else if(m.getopcion()!='a' && m.getopcion()!='b'){
                System.out.println("La cuenta que ha puesto es errónea");
                System.out.println();
            }
            else{
                while(m.getopcion2()!='f'){
                    m.setmostrar2();
                    m.setopcion2();
                    
                    /**
                     * Switch
                     */
                    switch (m.getopcion2()){
                        case 'i':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuánto dinero deseas ingresar?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldoingreso(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuánto dinero deseas ingresar?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldoingreso(c2.getdinero());
                            }
                            break;
                            
                        case 'r':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuánto dinero deseas retirar?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldoreintegro(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuánto dinero deseas retirar?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldoreintegro(c2.getdinero());
                            }
                            break;
                            
                        case 't':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuánto dinero deseas transferir?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldotransferencia(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuánto dinero deseas transferir?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldotransferencia(c2.getdinero());
                            }
                            break;
                            
                        case 'm':
                            if(m.getopcion()=='a'){
                                System.out.println("Tu saldo es de "+c1.getsaldo());
                            }
                            else{
                                System.out.println("Tu saldo es de "+c2.getsaldo());
                            }
                            break;
                            
                        case 'd':
                            if(m.getopcion()=='a'){
                                System.out.println("Nombre: "+c1.getnombre());
                                System.out.println("Apellido: "+c1.getapellido1());
                                System.out.println("2º apellido: "+c1.getapellido2());
                                System.out.println("Dni: "+c1.getdni());
                                System.out.println("Número de cuenta: "+c1.getnumero_cuenta());
                                System.out.println("Tipo de interés: "+c1.gettipo_interes());
                            }
                            else{
                                System.out.println("Nombre: "+c2.getnombre());
                                System.out.println("Apellido: "+c2.getapellido1());
                                System.out.println("2º apellido: "+c2.getapellido2());
                                System.out.println("Dni: "+c2.getdni());
                                System.out.println("Número de cuenta: "+c2.getnumero_cuenta());
                                System.out.println("Tipo de interés: "+c2.gettipo_interes());
                            }
                            break;
                    }
                }
                m.reiniciaropcion2();
            }
        }
        
                
        
        
    }
    
}

