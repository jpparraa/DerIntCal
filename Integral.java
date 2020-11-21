//package Class;
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
     * Retorna el valor de a.
     * @return a.
     */

	public static double getA(){
		return a;
	}

    /**
     * Retorna el valor de b.
     * @return a.
     */

	public static double getB(){
		return b;
	}

    /**
     * Regla del trapecio.
     * @return Área debajo la curva entre a y b.
     */
    public static double trapezoidalRule(String opt){
        double sum = 0;

        for(int i = 1; i < n; i++){
            z += x;
        switch(opt){
                case "0":
                        sum += Function.f0(z);
                break;
                case "1":
                        sum += Function.f1(z);
                break;
                case "2":
                        sum += Function.f2(z);
                break;
                case "3":
                        sum += Function.f3(z);
                break;
                case "4":
                        sum += Function.f4(z);
                break;
                case "5":
                        sum += Function.f5(z);
                break;
                case "6":
                        sum += Function.f6(z);
                break;
                case "7":
                        sum += Function.f7(z);
                break;
                case "8":
                        sum += Function.f8(z);
                break;
                case "9":
                        sum += Function.f9(z);
                break;
            }

        }
        sum *= 2;

                switch(opt){
                case "0":
                        sum += Function.f0(a);
                        sum += Function.f0(b);
                break;
                case "1":
                        sum += Function.f1(a);
                        sum += Function.f1(b);
                break;
                case "2":
                        sum += Function.f2(a);
                        sum += Function.f2(b);
                break;
                case "3":
                        sum += Function.f3(a);
                        sum += Function.f3(b);
                break;
                case "4":
                        sum += Function.f4(a);
                        sum += Function.f4(b);
                break;
                case "5":
                        sum += Function.f5(a);
                        sum += Function.f5(b);
                break;
                case "6":
                        sum += Function.f6(a);
                        sum += Function.f6(b);
                break;
                case "7":
                        sum += Function.f7(a);
                        sum += Function.f7(b);
                break;
                case "8":
                        sum += Function.f8(a);
                        sum += Function.f8(b);
                break;
                case "9":
                        sum += Function.f9(a);
                        sum += Function.f9(b);
                break;
            }
        return (x * 1 / 2) * sum;
    }
}
