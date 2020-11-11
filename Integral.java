//package DerIntCal.java

/**
 * Clase que halla la integral de una función utilizando la regla del trapecio.
 */


public class Integral{

    static int n = 4;
    static double a = 2;
    static double b = 3;
    static double x = (b - a) / n;
    static double z = a;

    /**
     * Regla del trapecio.
     * @return Área debajo la curva entre a y b.
     */
    public static double trapezoidalRule(){
        double sum = 0;

        for(int i = 1; i < n; i++){
            z += x;
            sum += Function.f0(z);
        }
        sum *= 2;

        sum += Function.f0(a);
        sum += Function.f0(b);
        return (x * 1 / 2) * sum;
    }
}
