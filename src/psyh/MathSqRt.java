package psyh;

public class MathSqRt {
    public static double mathSqRt(double number) {

        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
    }
}
