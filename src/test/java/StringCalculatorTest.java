import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    @Test
    public void dummyTest1() {
        assertThat("reality", is("expected value"));
    }

    @Test
    public void dummyTest2() {
        assertThat(true, is(not(false)));
    }
}
