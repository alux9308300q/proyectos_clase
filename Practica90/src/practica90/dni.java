package practica90;

public class dni {
    /**
     * Declarar variable
     */
    private int dni;

    /**
     * Declarar Set
     * @param dni Parametro DNI introducido
     */
    public void setdni(int dni){
        this.dni=dni;
        }   
    /**
     * Declarar Get
     * @return dni
     */
    public int getdni(){
        return dni;
    }
    
    /**
     * Operacion
     * @param dni Parametro DNI
     */
    public void calculo(int dni){
        /**
         * Declaro el if para que arranque el programa al meter un dni válido
         */
        if (dni>99999999)
            System.out.println("Tu DNI es falso ");
        else
            /**
             * Switch
             */
            switch (dni%23){
                case '0':
                    System.out.println("Tu letra del DNI es T ");
                    break;
                case 1:
                    System.out.println("Tu letra del DNI es R ");
                    break;
                case 2:
                    System.out.println("Tu letra del DNI es W ");
                    break;
                case 3:
                    System.out.println("Tu letra del DNI es A ");
                    break;
                case 4:
                    System.out.println("Tu letra del DNI es G ");
                    break;
                case 5:
                    System.out.println("Tu letra del DNI es M ");
                    break;
                case 6:
                    System.out.println("Tu letra del DNI es Y ");
                    break;
                case 7:
                    System.out.println("Tu letra del DNI es F ");
                    break;
                case 8:
                    System.out.println("Tu letra del DNI es P ");
                    break;
                case 9:
                    System.out.println("Tu letra del DNI es D ");
                    break;
                case 10:
                    System.out.println("Tu letra del DNI es X ");
                    break;
                case 11:
                    System.out.println("Tu letra del DNI es B ");
                    break;
                case 12:
                    System.out.println("Tu letra del DNI es N ");
                    break;
                case 13:
                    System.out.println("Tu letra del DNI es J ");
                    break;
                case 14:
                    System.out.println("Tu letra del DNI es Z ");
                    break;
                case 15:
                    System.out.println("Tu letra del DNI es S ");
                    break;
                case 16:
                    System.out.println("Tu letra del DNI es Q ");
                    break;
                case 17:
                    System.out.println("Tu letra del DNI es V ");
                    break;
                case 18:
                    System.out.println("Tu letra del DNI es H ");
                    break;
                case 19:
                    System.out.println("Tu letra del DNI es L ");
                    break;
                case 20:
                    System.out.println("Tu letra del DNI es C ");
                    break;
                case 21:
                    System.out.println("Tu letra del DNI es K ");
                    break;
                case 22:
                    System.out.println("Tu letra del DNI es E ");
                    break;
                default:


    }
}
}
