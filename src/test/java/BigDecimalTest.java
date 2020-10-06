import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BigDecimalTest {
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
    public void testSortInDescendingOrder() {
        BigDecimalOperations operations = new BigDecimalOperations();

        operations.sortInDescendingOrderAndPrint(new String[]{"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"});

        String output = new String(baos.toByteArray());

        assertThat(output, is(equalTo("90\n56.6\n50\n9\n02.34\n0.12\n.12\n0\n000.000\n-100\n")));
    }
}
