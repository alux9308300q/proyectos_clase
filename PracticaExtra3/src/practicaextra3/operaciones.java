package practicaextra3;
import java.util.Scanner;
public class operaciones {
    /**
     * Declarar variables
     */
    private double pies;
    private double yardas;
    private double pulgadas;
    private double centimetros;
    
    /**
     * Declarar Set
     * @param pies Parametro pies
     */
    public void setpies(double pies){
        this.pies=pies;
    }
    /**
     * Declarar Set
     * @param yardas Parametro yardas
     */
    public void setyardas(double yardas){
        this.yardas=yardas;
    }
    /**
     * Declarar Set
     * @param pulgadas Parametro pulgadas
     */
    public void setpulgadas(double pulgadas){
        this.pulgadas=pulgadas;
    }
    /**
     * Declarar Set
     * @param centimetros Parametro centimetros
     */
    public void setcentimetros(double centimetros){
        this.centimetros=centimetros;
    }
    
    /**
     * Operacion
     * @param pies Parametro pies
     */
    public void opeyardas(double pies){
        yardas=pies/0.33;
    }
    /**
     * Operacion
     * @param pies Parametro pies
     */
    public void opepulgadas(double pies){
        pulgadas=pies/12;
    }
    /**
     * Operacion
     * @param pies Parametro pies
     */
    public void opecentimetros(double pies){
        centimetros=pies*30.48;
    }
    
    /**
     * Declarar Get
     * @return pies
     */
    public double getpies(){
        return pies;
    } 
    /**
     * Declarar Get
     * @return yardas
     */
    public double getyardas(){
        return yardas;
    }
    /**
     * Declarar Get
     * @return pulgadas
     */
    public double getpulgadas(){
        return pulgadas;
    }
    /**
     * Declarar Get
     * @return centimetros
     */
    public double getcentimetros(){
        return centimetros;
    }
}


