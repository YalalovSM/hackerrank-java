import java.math.BigInteger;

public class BigIntegerOperations {
    public void isProbablyPrime(int n) {
        System.out.print(new BigInteger(String.valueOf(n)).isProbablePrime(100) ? "prime" : "not prime");
    }
}
