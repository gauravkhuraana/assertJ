import com.sun.xml.internal.ws.message.EmptyMessageImpl;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class customClassAssertions {

    @Test
    public void classLevelassertJFluentAssertions()
    {
        Employee emp1  = new Employee(30,"gaurav khurana",100000);
        Employee emp2  = new Employee(30,"gaurav khurana",100000);

        Assertions.assertThat(emp1)
                .isEqualToComparingFieldByField(emp2)
                .isNotNull()
                .isInstanceOf(Employee.class)
                .hasFieldOrProperty("age")
                .hasFieldOrPropertyWithValue("name","gaurav khurana")
                .extracting(e->e.age).isNotEqualTo(24);


    }
}
