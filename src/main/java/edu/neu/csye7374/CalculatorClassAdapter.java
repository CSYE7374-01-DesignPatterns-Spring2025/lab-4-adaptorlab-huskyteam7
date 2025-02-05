package edu.neu.csye7374;

import java.util.List;

public class CalculatorClassAdapter extends ConcreteCalculator implements AccumulatableAPI {
	

	private double sum;

	public CalculatorClassAdapter() {
        this.sum = 0;
	}

	@Override
	public double accumulation(List<Double> itemPrices) {
		sum = 0;
		for (double itemPrice : itemPrices) {
			sum = this.operation(OPERATION.ADD, sum, itemPrice);
		}
		return sum;
	}

	@Override
	public double payment(double cash) {
		return this.operation(OPERATION.SUB, cash, sum);
	}
	

}
