import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class JumpingOnTheCloudsTest {
    @Test
    public void testJumpingOnClouds() {
        JumpingOnTheClouds clazz = new JumpingOnTheClouds();
        assertThat(clazz.test(new int[]{0, 0, 0, 0, 1, 0}), is(equalTo(3)));
        assertThat(clazz.test(new int[]{0, 0, 1, 0, 0, 1, 0}), is(equalTo(4)));
    }
}
