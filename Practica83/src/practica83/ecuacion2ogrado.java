package practica83;

public class ecuacion2ogrado {
    private double a;
    private double b;
    private double c;
    private double resultado1;
    private double resultado2;
    
    /**
     * Declaracion Set A
     * @param a Parametro A
     */
    public void SetA(double a){
        this.a=a;
    }
    
    /**
     * Declaracion Set B
     * @param b Parametro B
     */
    public void SetB(double b){
        this.b=b;
    }
    
    /**
     * Declaracion Set C
     * @param c Parametro C
     */
    public void SetC(double c){
        this.c=c;
    }
    
    /**
     * Resolucion Ecuacion
     * @param a A
     * @param b B
     * @param c C
     */
    public void SetEcuacion(double a, double b, double c){
        this.resultado1=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        this.resultado2=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
    }
    
    /**
     * Declaracion Resultado1
     * @return Resultado1
     */
    public double GetResultado1(){
    return resultado1;
    }
    
    /**
     * Declaracion Resultado2
     * @return Resultado2
     */
    public double GetResultado2(){
    return resultado2;
    }
    
    
}
