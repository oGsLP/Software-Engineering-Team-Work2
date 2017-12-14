package test.datatest;

import objects.DateHelper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DateHelperTest {
    DateHelper dateHelper = new DateHelper();
    @Test
    public void getDate() throws Exception {
    }

    @Test
    public void isSameDay() throws Exception {
        System.out.println(dateHelper.getDate());
        String s1 = "2017-12-12";
        String s2 = "2017-12-12";
        String s3 = "2016-12-12";
        String s4 = "2017-12-13";

        boolean result1 = dateHelper.isSameDay(s1, s2);
        boolean result2 = dateHelper.isSameDay(s1, s3);
        boolean result3 = dateHelper.isSameDay(s1, s4);
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(false, result3);

    }

}