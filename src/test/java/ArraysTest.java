import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ArraysTest {
    @Test
    public void testRotLeft() {
        Arrays clazz = new Arrays();

        assertThat(clazz.rotLeft(new int[]{1, 2, 3, 4, 5}, 2), is(equalTo(new int[]{3, 4, 5, 1, 2})));
        assertThat(clazz.rotLeft(new int[]{1, 2, 3, 4, 5}, 4), is(equalTo(new int[]{5, 1, 2, 3, 4})));
    }
}
