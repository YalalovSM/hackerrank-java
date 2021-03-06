import java.math.BigInteger;

public class BigIntegerOperations {
    public void isProbablyPrime(int n) {
        System.out.print(new BigInteger(String.valueOf(n)).isProbablePrime(100) ? "prime" : "not prime");
    }

    public void addAndMultiply(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
    }
}
