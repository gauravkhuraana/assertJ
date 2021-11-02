import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class NumbersTest {


    @Test
    public void numbersTestViaAssertJ()
    {
        int a =10;

        // As Applies to all of the
        Assertions.assertThat(a)
                .as("Equality test").isEqualTo(10)
                .isLessThan(20)
                .isGreaterThan(9)
                .isBetween(10,30)
                .isInstanceOf(Integer.class)
                .isPositive()
                .isNotCloseTo(100, Percentage.withPercentage(89))
                .isEven()
                .isGreaterThan(5)
                .isLessThan(1);


    }
}
