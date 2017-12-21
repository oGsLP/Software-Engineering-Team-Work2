package test.datatest;

import objects.ResultMessage;
import org.junit.Test;
import po.GoodsPO;
import po.GoodsStockPO;
import po.StockPO;
import service.dataservice.Impl.StockDataServiceImpl;
import service.dataservice.StockDataService;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class StockDataServiceImplTest {
    StockDataService stockDataService = new StockDataServiceImpl();
    GoodsPO po = new GoodsPO( 1, "长管台灯", "Lamp-LP",
            200, 15, 100, 18, 200);
    GoodsPO po1 = new GoodsPO( 2, "短管台灯", "Lamp-SP",
            200, 15, 100, 18, 200);

    GoodsStockPO goodsStockPO = new GoodsStockPO( po, 200, "修改备注", 20000);
    GoodsStockPO goodsStockPO1 = new GoodsStockPO(po1, 200, "修改备注", 20000);
    Set<GoodsStockPO> set = new HashSet<>();
    Set<GoodsStockPO> set1 = new HashSet<>();
    @Test
    public void add() throws Exception {
        set.add(goodsStockPO);
        StockPO stockPO = new StockPO("JHD-20171218-00001", "20171218", 1 ,
                "py", 100 , "xiao", set ,"无", 20000);
        ResultMessage msg = stockDataService.add(stockPO);
        assertEquals(ResultMessage.Success, msg);


        set1.add(goodsStockPO1);
        set1.add(goodsStockPO);
        StockPO stockPO1 = new StockPO("JHD-20171218-00002", "20171218", 2,
                "py", 100 , "xiao", set1 ,"无", 20000);
        ResultMessage msg1 = stockDataService.add(stockPO1);
        assertEquals(ResultMessage.Success, msg1);
        assertEquals(2, stockPO1.getStockSet().size());
        Set<GoodsStockPO> set = stockPO1.getStockSet();
       for(GoodsStockPO po: set){
           System.out.print(po.getPo().getName());
           System.out.println(po.getPo().getType());
       }
    }

    @Test
    public void delete() throws Exception {
        StockPO stockPO = new StockPO("JHD-20171218-00001", "20171218", 1 ,
                "py", 100 , "xiao", set ,"无", 20000);
        ResultMessage msg = stockDataService.delete(stockPO);
        assertEquals(ResultMessage.Success, msg);

        StockPO stockPO1 = new StockPO("JHD-20171218-00002", "20171218", 2 ,
                "py", 100 , "xiao", set1 ,"无", 20000);
        ResultMessage msg1 = stockDataService.delete(stockPO1);
        assertEquals(ResultMessage.Success, msg1);
    }

    @Test
    public void update() throws Exception {

        StockPO stockPO = new StockPO("JHD-20171218-00001", "20171218", 1 ,
                "py", 100 , "xiao", set ,"修改备注", 20000);
        ResultMessage msg = stockDataService.update(stockPO);
        assertEquals(ResultMessage.Success, msg);

        StockPO stockPO1 = new StockPO("JHD-20171218-00002", "20171218", 2 ,
                "py", 100 , "xiao", set1 ,"修改备注", 20000);

        ResultMessage msg1 = stockDataService.update(stockPO1);
        assertEquals(ResultMessage.Success, msg1);
    }

}