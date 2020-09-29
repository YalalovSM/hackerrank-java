import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RepeatedStringTest {
    @Test
    public void testRepeatedString() {
        RepeatedString clazz = new RepeatedString();
        assertThat(clazz.test("aba", 10), is(equalTo(7L)));
        assertThat(clazz.test("abcac", 10), is(equalTo(4L)));
        assertThat(clazz.test("a", 1000000000000L), is(equalTo(1000000000000L)));
        assertThat(clazz.test("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L), is(equalTo(51574523448L)));
    }
}
