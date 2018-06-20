import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * github.com/improuv/StringCalculatorKata
 */
public class StringCalculatorTest {

    private StringCalculator calculator;

    @Ignore
    @Test
    public void dummyTest1() {
        assertThat("2", is("2"));
    }

    @Ignore
    @Test
    public void dummyTest2() {
        assertThat(true, is(not(false)));
    }

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyString_shouldReturn0() {
        assertThat(calculator.add(""), is(0));
    }

    @Test
    public void singleNumber_shouldBeReturnedAsIs() {
        assertThat(calculator.add("77"), is(77));
    }
}
