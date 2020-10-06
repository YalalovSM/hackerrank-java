import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BigIntegerTest {
    ByteArrayOutputStream baos;
    PrintStream oldOut;

    @Before
    public void init() {
        baos = new ByteArrayOutputStream();
        oldOut = System.out;
        System.setOut(new PrintStream(baos));
    }

    @After
    public void post() {
        System.setOut(oldOut);
    }

    @Test
    public void testIsPrime() {
        BigIntegerOperations bigIntegerOperations = new BigIntegerOperations();

        bigIntegerOperations.isProbablyPrime(13);
        String output = new String(baos.toByteArray());

        assertThat(output, is(equalTo("prime")));
    }
}
