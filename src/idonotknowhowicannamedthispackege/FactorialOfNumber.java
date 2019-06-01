package idonotknowhowicannamedthispackege;

import java.math.BigInteger;

public class FactorialOfNumber {
    public static BigInteger factorialOfNumber(int number) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
