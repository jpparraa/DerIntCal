//package DerIntCal;

import org.knowm.xchart.*;
import java.util.Vector;
import java.util.Scanner;

public class DerIntCal{
public static void menu(){
	Scanner scan = new Scanner(System.in);
        String opt = "";
	System.out.println("\n1: 4u² + 6");
        System.out.println("2: sin(u)");
        System.out.println("3: 4u");
        System.out.println("4: u");
        System.out.println("5: u² + u");
        System.out.println("6: 1/(3 - 5u)²");
	System.out.println("7: cos(u)");
	System.out.println("8: u² + 2u + 3");
	System.out.println("9: log(u)");
	System.out.println("10: tan(u)/cos(u)");
	System.out.print("\nElija una opción: ");

	opt = scan.nextLine();

	switch(opt){
		case "1":
			f0();
		break;
		case "2":
			f1();
		break;
		case "3":
			f2();
		break;
		case "4":
			f3();
		break;
		case "5":
			f4();
		break;
		case "6":
			f5();
		break;
		case "7":
			f6();
		break;
		case "8":
			f7();
		break;
		case "9":
			f8();
		break;
		case "10":
			f9();
		break;
		default:
			System.out.println("\nNo ha ingresado una opción válida.");
			menu();
	}
}

public static void f0(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();
	Vector dData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f0(i));
	    //dData.add(Derivative.derivate("0"));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("4 * u² + 6", "X", "Y", "y(x)", xData, yData);
	//chart.addSeries("Derivada", dData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = 4 * u² + 6\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("0"));
        System.out.println("Derivada: " + Derivative.derivate("0"));

}

public static void f1(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f1(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("sin(u)", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = sin(u)\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("1"));
        System.out.println("Derivada: " + Derivative.derivate("1"));
}

public static void f2(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f2(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("4 * u", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = 4 * u\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("2"));
        System.out.println("Derivada: " + Derivative.derivate("2"));
}

public static void f3(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f3(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("u", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = u\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("3"));
        System.out.println("Derivada: " + Derivative.derivate("3"));
}

public static void f4(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f4(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("u² + u", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = u² + u\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("4"));
        System.out.println("Derivada: " + Derivative.derivate("4"));
}

public static void f5(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f5(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("1/(3 - 5u)²", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = 1/(3 - 5u)²\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("5"));
        System.out.println("Derivada: " + Derivative.derivate("5"));
}

public static void f6(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f6(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("cos(u)", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = cos(u)\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("6"));
        System.out.println("Derivada: " + Derivative.derivate("6"));
}

public static void f7(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f7(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("u² + 2u + 3", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = u² + 2u + 3\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("7"));
        System.out.println("Derivada: " + Derivative.derivate("7"));
}

public static void f8(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f8(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("log(u)", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = log(u)\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("8"));
        System.out.println("Derivada: " + Derivative.derivate("8"));
}

public static void f9(){
    //XChart
        Vector xData = new Vector();
        Vector yData = new Vector();

        for(double i = -2.0; i <= 2.0; i += 0.2){
            xData.add(i);
            yData.add(Function.f9(i));
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("tan(u)/cos(u)", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
	System.out.println("\n\ty(x) = tan(u)/cos(u)\n");
        System.out.println("Integral entre " + Integral.getA() + " y " + Integral.getB() + " = "+ Integral.trapezoidalRule("9"));
        System.out.println("Derivada: " + Derivative.derivate("9"));
}

public static void main(String[] args){
    menu();
	System.out.println("");
}
}
