package test.datatest;

import objects.ResultMessage;
import org.junit.Test;
import po.ClassifyPO;
import po.GoodsPO;
import service.dataservice.Impl.ClassifyDataServiceImpl;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class ClassifyDataServiceImplTest {
    ClassifyDataServiceImpl classifyDataService = new ClassifyDataServiceImpl();

    @Test
    public void add() throws Exception {
        ClassifyPO po = new ClassifyPO("台灯", null);
        ResultMessage msg = classifyDataService.add(po);
        assertEquals(ResultMessage.Fail, msg);

        ClassifyPO po1 = new ClassifyPO("聚光灯", null);
        ResultMessage msg1 = classifyDataService.add(po1);
        assertEquals(ResultMessage.Success, msg1);

        Set<GoodsPO> set = new HashSet<>();
        GoodsPO po2 = new GoodsPO("0001", "大镁光灯灯", "Flash-L",
                100, 20, 100, 18, 100);
        set.add(po2);
        ClassifyPO po3 = new ClassifyPO("镁光灯", set);
        ResultMessage msg2 = classifyDataService.add(po3);
        assertEquals(ResultMessage.Success, msg2);
       // assertEquals(ResultMessage.Success, );
    }

    @Test
    public void add1() throws Exception {

    }

    @Test
    public void delete() throws Exception {
        ClassifyPO po = new ClassifyPO("聚光灯", null);
        ResultMessage msg = classifyDataService.delete(po);
        assertEquals(ResultMessage.Success, msg);

      //  assertEquals(ResultMessage.Fail, msg);

    }

    @Test
    public void update() throws Exception {
        Set<GoodsPO> set = new HashSet<>();
        GoodsPO po2 = new GoodsPO("0001", "大镁光灯", "Flash-L",
                100, 20, 100, 18, 100);
        set.add(po2);
        ClassifyPO po1 = new ClassifyPO("镁光灯", set);
        ResultMessage msg = classifyDataService.update(po1);
        assertEquals(ResultMessage.Success, msg);
    }

}