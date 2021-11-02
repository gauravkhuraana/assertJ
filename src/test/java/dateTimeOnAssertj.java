
import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.joda.time.LocalDate;
import org.testng.annotations.Test;

import static org.assertj.jodatime.api.Assertions.assertThat;


public class dateTimeOnAssertj {

    @Test
    public void dateTimeTestViaAssertJ()
    {
        LocalDate date = new LocalDate(2021, 11,4);

        assertThat(date)
           .hasYear(2021)
           .hasMonthOfYear(11)
           .hasDayOfMonth(4)
           .isBefore(new LocalDate(2021,11,10))
           .isBefore("2022-05-05")
           .isBeforeOrEqualTo(new LocalDate(2021,11,4))
           .isEqualTo("2021-11-04")
                //.isEqualTo("2021/11/04")
           .isAfter("2012-01-01")
           .isIn(new LocalDate(2020,01,01), new LocalDate(2021,11,4))
           .isNotIn("2021-01-01","2021-05-01");



    }
}
