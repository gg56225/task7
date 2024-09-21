import java.util.logging.Logger;

public class LoggingComplexCalculator  implements ComplexCalculator {
    private static final Logger logger = Logger.getLogger(LoggingComplexCalculator.class.getName());
    private final ComplexCalculator calculator;

    public LoggingComplexCalculator(ComplexCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        logger.info("Adding " + a + " and " + b + ": " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.info("Multiplying " + a + " and " + b + ": " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.info("Dividing " + a + " by " + b + ": " + result);
        return result;
    }
}
