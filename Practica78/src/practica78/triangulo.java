/*FORMA POCO CORRECTA DE HACERLO*/
package practica78;

public class triangulo {
    private double base;
    private double altura;
    private double resultado;
    
    /**
     * Declaracion Set Base
     * @param base Este parametro es la introduccion de la base
     */
    public void Setbase(double base){
        this.base=base;
    }
    /**
     * Declaracion Set Altura
     * @param altura Este parametro es la introduccion de la altura
     */
    public void Setaltura(double altura){
        this.altura=altura;
    }
    /**
     * Declaracion Get Area
     * @return Resultado
     */   
    public double GetArea(){
      resultado=(base*altura)/2;
      return resultado;
    }
    
}
