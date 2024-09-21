public class ComplexCalculatorFactory {
    public static ComplexCalculator createCalculator() {
        return new LoggingComplexCalculator(new ComplexCalculatorImpl());
    }
}
