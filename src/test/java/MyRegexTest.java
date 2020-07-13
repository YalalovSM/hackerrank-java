import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class MyRegexTest {
    // https://www.hackerrank.com/challenges/java-regex/problem
    // TODO add parameterized tests
    @Test
    public void testMyRegexOk() {
        assertThat("000.12.12.034".matches(new MyRegex().pattern), is(true));
        assertThat("121.234.12.12".matches(new MyRegex().pattern), is(true));
        assertThat("23.45.12.56".matches(new MyRegex().pattern), is(true));

        assertThat("00.12.123.123123.123".matches(new MyRegex().pattern), is(false));
        assertThat("122.23".matches(new MyRegex().pattern), is(false));
        assertThat("Hello.IP".matches(new MyRegex().pattern), is(false));
    }
}
