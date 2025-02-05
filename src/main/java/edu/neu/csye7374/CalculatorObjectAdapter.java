package edu.neu.csye7374;
import java.util.List;
import edu.neu.csye7374.CalculatableAPI.OPERATION;


public class CalculatorObjectAdapter implements AccumulatableAPI {
	
	private final CalculatableAPI calculator;
	private double sum;
	
	public CalculatorObjectAdapter(CalculatableAPI calc) {
		super();
		this.calculator = calc;
		this.sum = 0;
	}

	@Override
	public double accumulation(List<Double> prices) {
		sum = 0;
		for (double itemPrice : prices) {
			sum = this.calculator.operation(OPERATION.ADD, sum, itemPrice);
		}
		return sum;
	}

	@Override
	public double payment(double cash) {
		return this.calculator.operation(OPERATION.SUB, cash, sum);
	}
	

}
