package test;

import objects.HQLTools;
import org.hibernate.cfg.Configuration;
import po.GoodsPO;
public class GoodsDataServiceImplTest {
    Configuration configuration = new Configuration()
            .addInputStream(HQLTools.class.getResourceAsStream("/hibernate.cfg.xml")).configure();

    @org.junit.Test
    public void add() throws Exception {
        GoodsPO flag = new GoodsPO("0001", "小台灯", "Lamp-S",
                100, 10, 100, 15, 120 );

    }

    @org.junit.Test
    public void delete() throws Exception {
    }

    @org.junit.Test
    public void update() throws Exception {
    }

    @org.junit.Test
    public void retrive() throws Exception {
    }

    @org.junit.Test
    public void find() throws Exception {
    }

}