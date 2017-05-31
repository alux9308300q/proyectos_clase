package practica76;
import java.util.*;

public class Practica76 {

    public static void main(String[] args) {     
       Scanner teclado=new Scanner(System.in);  
       /**
        * Declaracion de variables
        */
       int opcion, salir=1, num1, num2;
       /**
        * Declaracion objeto
        */
       calculadora calculator=new calculadora();
       
       /**
        * Menu
        */
       do{
       System.out.println("MENU");  
       System.out.println("1.SUMA");
       System.out.println("2.RESTA");
       System.out.println("3.MULTIPLICACION"); 
       System.out.println("4.DIVISION");  
       System.out.println("5.SALIR"); 
       
       /**
        * Eleccion menu
        */
       do{
       System.out.println("Elige una opcion: ");  
       opcion=teclado.nextInt();
       }while(opcion<1||opcion>5);
       
       switch(opcion){
           case 1: 
               System.out.println("Introduce el primer numero: ");
               num1=teclado.nextInt();
               System.out.println("Introduce el segundo numero: ");
               num2=teclado.nextInt();
               calculator.Setnum1(num1);
               calculator.Setnum2(num2);
               System.out.println(calculator.GetSuma());
               
                   
           break;
           
           case 2: 
               System.out.println("Introduce el primer numero: ");
               num1=teclado.nextInt();
               System.out.println("Introduce el segundo numero: ");
               num2=teclado.nextInt();
               calculator.Setnum1(num1);
               calculator.Setnum2(num2);
               System.out.println(calculator.GetResta());
               
           break;
           
           case 3: 
               System.out.println("Introduce el primer numero: ");
               num1=teclado.nextInt();
               System.out.println("Introduce el segundo numero: ");
               num2=teclado.nextInt();
               calculator.Setnum1(num1);
               calculator.Setnum2(num2);
               System.out.println(calculator.GetMultiplicacion());
               
           break;
           
           case 4: 
               System.out.println("Introduce el primer numero: ");
               num1=teclado.nextInt();
               System.out.println("Introduce el segundo numero: ");
               num2=teclado.nextInt();
               calculator.Setnum1(num1);
               calculator.Setnum2(num2);
               System.out.println(calculator.GetDivision());
               
           break;
           
           case 5:
           salir=0;       
    }
  }
       while(salir==1);
}
    }
    

