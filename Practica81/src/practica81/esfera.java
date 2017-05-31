package practica81;

public class esfera {
    private double radio;
    private double resultadoA;
    private double resultadoV;
    /**
     * Declaracion Setter
     * @param radio Paramatro del radio
     */
    public void Setradio(double radio){
        this.radio=radio;
    }
    /**
     * Area
     * @param radio Dato para resolucion area 
     */
    public void SetArea(double radio){
        this.radio=radio;
        this.resultadoA=4*Math.PI*Math.pow(radio,2);
    }
    /**
     * Volumen
     * @param radio Dato para resolucion volumen 
     */
    public void SetVolumen(double radio){
        this.radio=radio;
        this.resultadoV=Math.PI*Math.pow(radio,3)*4/3;
    }
    /**
     * Declaracion Get Area
     * @return Resultado
     */
    public double GetArea(){
        return resultadoA;
    }
    /**
     * Declaracion Volumen
     * @return Resultado
     */
    public double GetVolumen(){
        return resultadoV;
    }
    
}
