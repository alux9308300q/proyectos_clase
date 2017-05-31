
package practica76;

public class calculadora {
    private int num1;
    private int num2;
    private int resultado;
    
    /**
     * Declaracion set
     * @param num1 Este parametro es la introduccion del primer numero
     */
    public void Setnum1(int num1){   
        this.num1=num1;
    }
    
    /**
     * Declaracion set
     * @param num2 Este parametro es la introduccion del segundo numero
     */
    public void Setnum2(int num2){        
        this.num2=num2;
    }
    
    /**
     * Declaracion get
     * @return Resultado
     */
    public int GetSuma(){
        resultado=num1+num2;
        return resultado;
    }
    
    /**
     * Declaracion get
     * @return Resultado
     */
    public int GetResta(){
        resultado=num1-num2;
        return resultado;
    }
    
    /**
     * Declaracion get
     * @return Resultado
     */
    public int GetMultiplicacion(){
        resultado=num1*num2;
        return resultado;
    }
    
    /**
     * Declaracion get
     * @return Resultado
     */
    public int GetDivision(){
        resultado=num1/num2;
        return resultado;
    }
    
}