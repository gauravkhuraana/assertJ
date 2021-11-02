import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListsTests {

    @Test
    public void listAssertionTests() {
        List<String> l1 = Arrays.asList("Hare", "Krishna", "Ram");
        List<String> l2 = Arrays.asList("Krishna", "Hare");
        List<String> l3 = Arrays.asList("Hare");

        Assertions.assertThat(l1)
                .hasAtLeastOneElementOfType(String.class)
                .hasSize(3)
                .hasSizeBetween(2,9)
                .isNotEmpty()
                .contains("Krishna")
                .startsWith("Hare")
                .containsExactlyInAnyOrder("Krishna","Ram","Hare")
                .containsExactly("Hare","Krishna","Ram")
                .doesNotContain("NitaiGaur")
                .containsAll(l3)
                //.doesNotContainAnyElementsOf(l2)
        //()-> makes it lazy load
                .withFailMessage(()-> "String is not having size less than 3").allMatch(s->s.length()>=3);


    }
}
