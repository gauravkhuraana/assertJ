
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class StringTest {

    @Test
    public void stringAssetions() {
        String temp = "Hello Krishna";

        String temp1 = "  ";

        Assertions.assertThat(temp)
                //.isNotBlank()
                .as("Empty string test").isNotEmpty()
                //.isEqualTo("Hello Krishna")
                .contains("Krishna")
                .doesNotContain("Hare")
                .containsWhitespaces()
                .containsIgnoringCase("krishna")
                .matches("\\w.*"+"Krishna")
                .doesNotContainPattern("\\d.*")
                .hasSize(13)
                .hasSizeGreaterThan(10)
                .hasSizeLessThan(20)
                .hasSizeBetween(17,20)
                .endsWith("Krishna")
                .isInstanceOf(String.class);



    }
}
