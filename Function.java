//package Class;
/**
 * Clase que retorna funciones.
 */
public class Function{

    /**
     * Función f0.
     * @param u Variable.
     * @return 4 * u² + 6
     */
    public static double f0(double u){
       return 4 * Math.pow(u, 2) + 6;
    }


    /**
     * Función f1.
     * @param u Variable.
     * @return sin(u)
     */
    public static double f1(double u){
        return Math.sin(u);
    }

    /**
     * Función f2.
     * @param u Variable.
     * @return 4 * u
     */
    public static double f2(double u){
        return 4 * u;
    }

    /**
     * Función f3.
     * @param u Variable.
     * @return u
     */
    public static double f3(double u){
        return u;
    }

    /**
     * Función f4.
     * @param u Variable.
     * @return u² + u
     */
    public static double f4(double u){
        return Math.pow(u, 2) + u;
    }

    /**
     * Función f5.
     * @param u Variable.
     * @return 1/(3 - 5u)²
     */
    public static double f5(double u){
        return 1/Math.pow(3 - 5 * u, 2);
    }
    
    /**
     * Función f6.
     * @param u Variable.
     * @return cos(u)
     */
    public static double f6(double u){
        return Math.cos(u);
    }

    /**
     * Función f7.
     * @param u Variable.
     * @return u² + 2u + 3
     */
    public static double f7(double u){
        return Math.pow(u, 2) + 2 * u + 3;
    }
    
    /**
     * Función f8.
     * @param u Variable.
     * @return log(u)
     */
    public static double f8(double u){
        return Math.log(u);
    }

    /**
     * Función f9.
     * @param u Variable.
     * @return tan(u)/cos(u)
     */
    public static double f9(double u){
        return Math.tan(u)/Math.cos(u);
    }
}
