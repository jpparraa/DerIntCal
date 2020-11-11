//package DerIntCal

/**
 * Clase para hallar la derivada de una función
 */
public class Derivative{

    static double x = 1.0;
    static double h = 0.0001;

    /**
     * Retorna la recta tangente a la función.
     * @return (f(x+h)-f(x))/h
     */
    public static double derivate(){
        return (Function.f0(x+h)-Function.f0(x))/h;
    }
}
