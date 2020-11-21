//package Class;
/**
 * Clase para hallar la derivada de una función
 */
public class Derivative{

    static double x = 1.0;
    static double h = 1e-10;

    /**
     * Retorna la recta tangente a la función.
     * @return(f(x+h)-f(x))/h
     */
    public static double derivate(String opt){
	double result = 0;
        switch(opt){
            case "0":
                    result = (Function.f0(x+h)-Function.f0(x))/h;
            break;
            case "1":
                    result = (Function.f1(x+h)-Function.f1(x))/h;
            break;
            case "2":
                    result = (Function.f2(x+h)-Function.f2(x))/h;
            break;
            case "3":
                    result = (Function.f3(x+h)-Function.f3(x))/h;
            break;
            case "4":
                    result = (Function.f4(x+h)-Function.f4(x))/h;
            break;
            case "5":
                    result = (Function.f5(x+h)-Function.f5(x))/h;
            break;
            case "6":
                    result = (Function.f6(x+h)-Function.f6(x))/h;
            break;
            case "7":
                    result = (Function.f7(x+h)-Function.f7(x))/h;
            break;
            case "8":
                    result = (Function.f8(x+h)-Function.f8(x))/h;
            break;
            case "9":
                    result = (Function.f9(x+h)-Function.f9(x))/h;
            break;
        	}
        return result;
    }
}
