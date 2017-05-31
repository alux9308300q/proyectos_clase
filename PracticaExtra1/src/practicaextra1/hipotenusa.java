package practicaextra1;

public class hipotenusa {
    private double hipotenusa = 0;
    private double cateto1 = 2;
    private double cateto2 = 3;
    private double resultado;
    
    /**
     * Declarar Set
     * @param hipotenusa Parametro hipotenusa
     */
    public void SetHipotenusa(double hipotenusa){
        this.hipotenusa=hipotenusa;
    }
    
    /**
     * Declarar Set
     * @param cateto1 Parametro cateto1
     */
    public void SetCateto1(double cateto1){
        this.cateto1=cateto1;
    }
    /**
     * Declarar Set
     * @param cateto2 Parametro cateto2
     */
    public void SetCateto2(double cateto2){
        this.cateto1=cateto2;
    }
    /**
     * Operacion
     * @param hipotenusa Parametro hipotenusa
     * @param cateto1 Parametro cateto1
     * @param cateto2 Parametro cateto2
     */
    public void SetPitagoras(double hipotenusa, double cateto1, double cateto2){
        this.resultado=Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    /**
     * Declarar Get
     * @return resultado
     */
    public double GetResultado(){
    return resultado;
}
}
