package practica15;
/*Importar scanner*/
import java.util.Scanner;

public class Practica15 {


    public static void main(String[] args) {

        /*Declarar variables*/
        int horas;
        int cobrohora;
        int cobrosemanal;
        int horasextra = 0;
        int impuestos;
        
        /*Creacion scanner*/
        Scanner teclado=new Scanner(System.in);
        
         /*Mensaje*/
        System.out.println("Introduce las horas trabajadas:");
        horas=teclado.nextInt();
        
        System.out.println("¿Cuanto cobras por hora?");
        cobrohora=teclado.nextInt();
        
        /*Operaciones*/
        cobrosemanal=horas*cobrohora;
        System.out.println("Cobro total:");
        System.out.println(cobrosemanal);
        
        if(horas>=38){
            horasextra=(cobrosemanal/2)+cobrosemanal;
            System.out.println("Cobra un 50% mas por la horas extra trabajadas:");
            System.out.println(horasextra);
        }
        
        if(cobrosemanal>300){
            impuestos=horasextra-((horasextra*10)/100);
            System.out.println("Se le aplica unos impuestos del 10%:");
            System.out.println(impuestos);
            
        }
        else{
        System.out.println("Los impuestos son de 0%");
        }
    }
            
    
}
