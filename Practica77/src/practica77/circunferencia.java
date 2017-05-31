/*FORMA POCO CORRECTA DE HACERLO*/
package practica77;

public class circunferencia {
    private double radio;
    private double resultado;
    
    /**
     * Declarar set
     * @param radio Este parametro es la introduccion del radio
     */
    public void Setradio(double radio){
        this.radio=radio;
    }
    
    /**
     * Declaracion Get Longitud
     * @return Resultado
     */
    public double GetLongitud(){
        resultado=radio*2*(Math.PI);
        return resultado;
    }
    
    /**
     * Declaracion Get Area
     * @return Resultado
     */
    public double GetArea(){
        resultado=radio*radio*Math.PI;
        return resultado;
    }
}
