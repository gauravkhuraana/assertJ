import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class softAssertions {

    @Test
    public void softAssertionsInAssertJ()
    {
        SoftAssertions softAssert = new SoftAssertions();

        softAssert.assertThat("hare krishna")
                .isNotEmpty()
                .hasSize(5)
                .contains("bol");

        System.out.println("Hari bol");
        softAssert.assertAll();
    }

    @Test
    public void BddStyleAssertions()
    {
        BDDAssertions.then("Hare Krishna")
                .hasSize(12)
                .containsWhitespaces()
                .hasSizeBetween(1,2);
    }
}
