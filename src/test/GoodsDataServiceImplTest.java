package test;

import objects.ResultMessage;
import org.junit.Test;
import po.GoodsPO;
import service.dataservice.Impl.GoodsDataServiceImpl;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GoodsDataServiceImplTest {
    GoodsDataServiceImpl goodsDataServiceImpl = new GoodsDataServiceImpl();

    //@Test
    public void add() throws Exception {
        GoodsPO po = new GoodsPO("0005", "长管台灯", "Lamp-LP",
                200, 15, 100, 18, 200);
        ResultMessage msg = goodsDataServiceImpl.add(po);
        assertEquals(msg, ResultMessage.Fail);

        GoodsPO po1 = new GoodsPO("0006", "短管台灯", "Lamp-SP",
                200, 15, 100, 18, 200);
        GoodsPO po2 = new GoodsPO("0007", "demo", "demo",
                200, 15, 100, 18, 200);
        GoodsPO po3 = new GoodsPO("0009", "demo", "demo",
                200, 15, 100, 18, 200);
        //ResultMessage msg1 = goodsDataServiceImpl.add(po1);
        //ResultMessage msg2 = goodsDataServiceImpl.add(po2);
        ResultMessage msg3 =goodsDataServiceImpl.add(po3);
        assertEquals(msg, ResultMessage.Fail);
        //assertEquals(msg1, ResultMessage.Success);
        //assertEquals(msg2, ResultMessage.Success);
   // 什么情况！
    }

    //@Test
    public void delete() throws Exception {

        GoodsPO po = new GoodsPO("0006", "短管台灯", "Lamp-SP",
                200, 15, 100, 18, 200);
        ResultMessage msg = goodsDataServiceImpl.delete(po);

        GoodsPO po1 = new GoodsPO("0007", "不存在的台灯", "Lamp-NonExist",
                200, 15, 100, 18, 200);
        ResultMessage msg1 = goodsDataServiceImpl.delete(po1);

        assertEquals(ResultMessage.Success, msg);
        assertEquals(ResultMessage.Success, msg1);
    }

    //@Test
    public void update() throws Exception {
        GoodsPO po = new GoodsPO("0005", "长管台灯", "Lamp-LP",
                200, 15, 100, 18, 200);
        GoodsPO po1 = new GoodsPO("0007", "不存在的台灯", "Lamp-NonExist",
                200, 15, 100, 18, 200);
        ResultMessage msg = goodsDataServiceImpl.update(po);
        ResultMessage msg1 = goodsDataServiceImpl.update(po1);
        assertEquals(ResultMessage.Success, msg);
        assertEquals(ResultMessage.Fail, msg1);
    }

    //@Test
    public void retrive() throws Exception {
    }

    @Test
    public void find() throws Exception {单步一下，这个IDE我不会debug啊emmm啥单步单步执行等一下要不这样，我把你的代码拉下来，我到我那给你调一下，保证5分钟搞定！
        好的，谢谢学长，麻烦了orz在你的git上吗我更新一下
                
        String str = "0005 长管台灯 Lamp-LP 200 15 100 18 200";
        ArrayList list2 = goodsDataServiceImpl.find("0009","demo", "demo");
        GoodsPO po = (GoodsPO)list2.get(0);
        String str1= po.getNumber() + " " + po.getName() + " " + po.getType() +" "+ po.getCommodityNum() + " " +
                po.getPurchasePrice() + " " + po.getRetailPrice() + " " + po.getRecentPurPrice()+ " " +
                po.getRecentRetPrice();

        assertEquals(1, list2.size());
        assertEquals(str, str1);
        assertEquals(18, po.getRecentPurPrice());
        assertEquals(200, po.getRecentRetPrice());
    }

}