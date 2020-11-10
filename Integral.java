//package DerIntCal.java

/**
 * Clase que halla la integral de una función utilizando la regla del trapecio.
 */


public class Derivative{

    static int n = 4;
    static double a = 2;
    static double b = 3;
    static double x = (b - a) / n;
    static double y = (b - a) / (n * 2);
    static double z = a;
    public static double f(double u){
       return 4 * Math.pow(u, 2) + 6;
    }

    public static double sum(){
        double sum = 0;

        for(int i = 1; i < n; i++){
            z += x;
            sum += f(z);
            //System.out.println(sum);
        }
        sum *= 2;

        sum += f(a);
        sum += f(b);
        return y * sum;
    }

    public static void main(String[] args){
    
        System.out.println(sum());
    }
}
