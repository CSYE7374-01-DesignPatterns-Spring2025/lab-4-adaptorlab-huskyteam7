package edu.neu.csye7374;

class ConcreteCalculator implements CalculatableAPI {
    @Override
    public double operation(OPERATION operation, double a, double b) {
        switch (operation) {
            case ADD:
                return a + b;
            case SUB:
                return a - b;
            case MULT:
                return a * b;
            case DIV:
                return a / b;
            default:
                throw new IllegalArgumentException("operation is Invalid");
        }
    }
}
