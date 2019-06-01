package idonotknowhowicannamedthispackege;

public class MathSqRt {
    public static double mathSqRt(double number) {

        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got - " + number);
        }
        return Math.sqrt(number);
    }
}
