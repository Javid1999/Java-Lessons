package Progres;

public class DivideCalculator implements Calculator {
    @Override
    public double calculate(double a, double b) {
        if (b==0){
            throw new DivisionByZeroException("0-a bolmek olmaz");
        }
        return a/b;
    }
}
