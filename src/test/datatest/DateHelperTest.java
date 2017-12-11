package test.datatest;

import objects.DateHelper;
import org.junit.Test;
import po.StockPO;

import static junit.framework.TestCase.assertEquals;

public class DateHelperTest {
    DateHelper dateHelper = new DateHelper();
    @Test
    public void addHelper() throws Exception {
    }

    @Test
    public void addHelper1() throws Exception {
    }

    @Test
    public void addHelper2() throws Exception {
        StockPO po1 = new StockPO("JHD-2017-12-11-00001", "2017-12-11", 1, "py", 100,
                "xiao", null,"", 100);
        dateHelper.addHelper(po1);

        assertEquals("JHD-2017-12-11-00001", po1.getNumber());

        StockPO po2 = new StockPO("JHD-2017-12-11-00002", "2017-12-11", 2, "py", 100,
                "xiao", null,"", 100);
        dateHelper.addHelper(po2);
        assertEquals("JHD-2017-12-11-00002", po2.getNumber());

        StockPO po3 = new StockPO("JHD-2017-12-12-00004", "2017-12-12", 4, "py", 100,
                "xiao", null,"", 100);
        dateHelper.addHelper(po3);
        assertEquals("JHD-2017-12-12-00004", po3.getNumber());
        assertEquals(1, po3.getReceiptNumber());
    }

    @Test
    public void addHelper3() throws Exception {
    }

    @Test
    public void isSameDay() throws Exception {
    }

}