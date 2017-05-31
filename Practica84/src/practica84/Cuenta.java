package practica84;
import java.util.*;
public class Cuenta {
    /**
     * Declarar variables
     */
    private String nombre, apellido1, apellido2, dni, numero_cuenta, tipo_interes;
    private double dinero;
    private double saldo=0;
    
    /**
     * Constructor
     */
    public Cuenta(){
        nombre="";
        apellido1="";
        apellido2="";
        dni="";
        numero_cuenta="";
        tipo_interes="";
    }
    
    /**
     * Constructor con parámetros
     * @param nombre Parametro nombre
     * @param apellido1 Parametro 1º apellido
     * @param apellido2 Parametro 2º apellido
     * @param dni Parametro DNI
     * @param numero_cuenta Parametro nºcuenta
     * @param tipo_interes Parametro tipo interes
     */
    public Cuenta(String nombre, String apellido1, String apellido2, String dni, String numero_cuenta, String tipo_interes){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;
        this.numero_cuenta=numero_cuenta;
        this.tipo_interes=tipo_interes;
    }
    
    /**
     * Constructor copia
     * @param c parametro de la copia
     */
    public Cuenta(final Cuenta c){
        nombre=c.nombre;
        apellido1=c.apellido1;
        apellido2=c.apellido2;
        dni=c.dni;
        numero_cuenta=c.numero_cuenta;
        tipo_interes=c.tipo_interes;
    }
    
    /**
     * Declarar Set
     * @param saldo Parametro saldo
     */
    public void setsaldo(double saldo){
        this.saldo=saldo;
    }
    /**
     * Declarar Set
     * @param dinero Parametro dinero
     */
    public void setdinero(double dinero){
        this.dinero=dinero;
    }
    /**
     * Declarar Set
     * @param nombre Parametro nombre
     */
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Declarar Set
     * @param apellido1 Parametro 1º apellido
     */
    public void setapellido1(String apellido1){
        this.apellido1=apellido1;
    }
    /**
     * Declarar Set
     * @param apellido2 Parametro 2º apellido
     */
    public void setapellido2(String apellido2){
        this.apellido2=apellido2;
    }
    /**
     * Declarar Set
     * @param dni Parametro DNI
     */
    public void setdni(String dni){
        this.dni=dni;
    }
    /**
     * Declarar Set
     * @param numero_cuenta Parametro nºcuenta
     */
    public void setnumero_cuenta(String numero_cuenta){
        this.numero_cuenta=numero_cuenta;
    }
    /**
     * Declarar Set
     * @param tipo_interes Parametro tipo interes
     */
    public void settipo_interes(String tipo_interes){
        this.tipo_interes=tipo_interes;
    }
    
    /**
     * Operacion
     * @param dinero Parametro dinero
     */
    public void saldoingreso(double dinero){
        saldo=saldo+dinero;
    }
    /**
     * Operacion
     * @param dinero Parametro dinero
     */
    public void saldoreintegro(double dinero){
        saldo=saldo-dinero;
    }
    /**
     * Operacion
     * @param dinero Parametro dinero
     */
    public void saldotransferencia(double dinero){
        saldo=saldo-dinero;
    }
    
    /**
     * Declarar Get
     * @return saldo
     */
    public double getsaldo(){
        return saldo;
    }
    /**
     * Declarar Get
     * @return dinero
     */
    public double getdinero(){
        return dinero;
    }
    /**
     * Declarar Get
     * @return nombre
     */
    public String getnombre(){
        return nombre;
    }
    /**
     * Declarar Get
     * @return apellido1
     */
    public String getapellido1(){
        return apellido1;
    }
    /**
     * Declarar Get
     * @return apellido2
     */
    public String getapellido2(){
        return apellido2;
    }
    /**
     * Declarar Get
     * @return dni
     */
    public String getdni(){
        return dni;
    }
    /**
     * Declarar Get
     * @return numero de cuenta
     */
    public String getnumero_cuenta(){
        return numero_cuenta;
    }
    /**
     * Declarar Get
     * @return tipo de interes
     */
    public String gettipo_interes(){
        return tipo_interes;
    }
}

