import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.HashMap;
import java.util.Map;

public class mapTests {

@Test
    public void mapAssertJAssertionsTest()
{
    Map<String,String> map = new HashMap<>();

    map.put("name","Krishna");
    map.put("dham","golokVrindawan");
    map.put("designation","bhagwan");

    Assertions.assertThat(map)
       .containsEntry("name","Krishna")
       .hasSize(3)
       .isNotEmpty()
       .doesNotContainEntry("king","dwarka")
       .containsKey("designation")
       .containsValue("bhagwan");


}


}
