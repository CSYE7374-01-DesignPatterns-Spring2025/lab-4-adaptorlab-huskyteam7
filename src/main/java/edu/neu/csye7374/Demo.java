package edu.neu.csye7374;

import java.util.List;

public class Demo {
    public static void demo() {

        System.out.println("Class Adapter Pattern");
        CalculatorClassAdapter adapter = new CalculatorClassAdapter();

        double total = adapter.accumulation(List.of(30.0, 40.0, 50.0));
        System.out.println("Total accumulated price: " + total);
       double classCash = 150;
        double change = adapter.payment(classCash);
        System.out.println("Cash: " + classCash);
        System.out.println("Remaining Change: " + change);


        CalculatableAPI concreteCal = new ConcreteCalculator();

        System.out.println("Object Adapter Pattern");

        CalculatorObjectAdapter adapterObject = new CalculatorObjectAdapter(concreteCal);

        double objectTotal = adapterObject.accumulation(List.of(30.0, 40.0, 50.0));

        System.out.println("Total accumulated price: " + objectTotal);

        double cash = 400.0;
        double ObjectChange = adapter.payment(cash);
        System.out.println("Cash: " + cash);
        System.out.println("Remaining change: " + ObjectChange);

    }
}

