import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ArrayOperationsTest {
    @Test
    public void testRotLeft() {
        ArrayOperations clazz = new ArrayOperations();

        assertThat(clazz.rotLeft(new int[]{1, 2, 3, 4, 5}, 2), is(equalTo(new int[]{3, 4, 5, 1, 2})));
        assertThat(clazz.rotLeft(new int[]{1, 2, 3, 4, 5}, 4), is(equalTo(new int[]{5, 1, 2, 3, 4})));
    }

    @Test
    public void testMinimumBribes() {
        ArrayOperations clazz = new ArrayOperations();

        assertThat(clazz.minimumBribes(new int[]{2, 5, 1, 3, 4}), is(equalTo("Too chaotic")));
        assertThat(clazz.minimumBribes(new int[]{2, 1, 5, 3, 4}), is(equalTo("3")));
        assertThat(clazz.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4}), is(equalTo("7")));
    }
}
