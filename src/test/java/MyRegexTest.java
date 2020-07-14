import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class MyRegexTest {
    // https://www.hackerrank.com/challenges/java-regex/problem
    @Test
    public void testMyRegexOk() {
        assertThat("000.12.12.034".matches(new MyRegex().pattern), is(true));
        assertThat("121.234.12.12".matches(new MyRegex().pattern), is(true));
        assertThat("23.45.12.56".matches(new MyRegex().pattern), is(true));

        assertThat("00.12.123.123123.123".matches(new MyRegex().pattern), is(false));
        assertThat("122.23".matches(new MyRegex().pattern), is(false));
        assertThat("Hello.IP".matches(new MyRegex().pattern), is(false));
    }

    // https://www.hackerrank.com/challenges/duplicate-word/problem
    @Test
    public void testDuplicateWords() {
        DuplicateWords duplicateWords = new DuplicateWords();

        assertThat(duplicateWords.transform("Goodbye bye bye world world world"), is(equalTo("Goodbye bye world")));
        assertThat(duplicateWords.transform("Sam went went to to to his business"), is(equalTo("Sam went to his business")));
        assertThat(duplicateWords.transform("Reya is is the the best player in eye eye game"), is(equalTo("Reya is the best player in eye game")));
        assertThat(duplicateWords.transform("in inthe"), is(equalTo("in inthe")));
        assertThat(duplicateWords.transform("Hello hello Ab aB"), is(equalTo("Hello Ab")));
    }

    // https://www.hackerrank.com/challenges/valid-username-checker/problem
    @Test
    public void testValidUserName() {
        assertThat("Julia".matches(UsernameValidator.regularExpression), is(false));
        assertThat("Samantha".matches(UsernameValidator.regularExpression), is(true));
        assertThat("Samantha_21".matches(UsernameValidator.regularExpression), is(true));
        assertThat("1Samantha".matches(UsernameValidator.regularExpression), is(false));
        assertThat("Samantha?10_2A".matches(UsernameValidator.regularExpression), is(false));
        assertThat("JuliaZ007".matches(UsernameValidator.regularExpression), is(true));
        assertThat("Julia@007".matches(UsernameValidator.regularExpression), is(false));
        assertThat("_Julia007".matches(UsernameValidator.regularExpression), is(false));
    }
}
