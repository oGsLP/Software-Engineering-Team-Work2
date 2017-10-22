package dataservice;

import businesslogicservice.ResultMessage;
import po.CommodityPO;
import po.GoodsPO;
import po.StockPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface StockDataService {
    public ResultMessage add(StockPO po);
    public ResultMessage remove(StockPO po);
    public ResultMessage modify(StockPO po);
    public ArrayList<StockPO> getReceipt(StockPO po);
    public CommodityPO stockCom(CommodityPO po, ArrayList<StockPO> receipt);


}
