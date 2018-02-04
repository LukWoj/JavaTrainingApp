package calc;

public class Calculator {
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public double calculate(double a, double b, String operator) throws ArithmeticException, UnknownOperatorException {
        double result = 0;

        switch (operator) {
        case PLUS:
            result = a + b;
            break;
        case MINUS:
            result = a - b;
            break;
        case MULTIPLY:
            result = a * b;
            break;
        case DIVIDE:
        	if(b==0){
        		throw new ArithmeticException("Nie dziel przez zero");
        	}
            result = a / b;
            break;
        default:
        	throw new UnknownOperatorException("Podany operator arytmetyczny jest nieprawidlowy");
        }

        return result;
    }
}