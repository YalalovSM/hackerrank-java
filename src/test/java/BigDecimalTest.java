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

    @Test
    public void testSortInDescendingOrderCase2() {
        BigDecimalOperations operations = new BigDecimalOperations();

        operations.sortInDescendingOrderAndPrint(new String[]{
                "2430.43147838594253365725375004004519045929780425771465",
                "90174.94594116679594096186120818164666337969628597908837",
                "50889.79753579157982788663432354238995062339475385555633",
                "63728.97132657668187342589248995579868703980846775421699",
                "90320.13815584481563871967756490570773056714275521830128"});

        String output = new String(baos.toByteArray());

        assertThat(output, is(equalTo("90320.13815584481563871967756490570773056714275521830128\n90174.94594116679594096186120818164666337969628597908837\n63728.97132657668187342589248995579868703980846775421699\n50889.79753579157982788663432354238995062339475385555633\n2430.43147838594253365725375004004519045929780425771465\n")));
    }
    
}
