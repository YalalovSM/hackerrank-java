import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AlgorithmsTest {
    ByteArrayOutputStream baos;
    PrintStream oldOut;
    Algorithms algorithms = new Algorithms();

    @Before
    public void init() {
        baos = new ByteArrayOutputStream();
        oldOut = System.out;
        System.setOut(new PrintStream(baos));
    }

    @Test
    public void testPlusMinus() {
        algorithms.plusMinus(new int[]{-4, 3, -9, 0, 4, 1});

        String output = new String(baos.toByteArray());

        assertThat(output.contains("pos=0.500000"), is(true));
        assertThat(output.contains("neg=0.333333"), is(true));
        assertThat(output.contains("zero=0.166667"), is(true));
    }

    @After
    public void post() {
        System.setOut(oldOut);
    }
}
