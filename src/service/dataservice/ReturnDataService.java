package service.dataservice;

import objects.ResultMessage;
import po.CommodityPO;
import po.ReturnPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface ReturnDataService {
    public ResultMessage add(ReturnPO po);
    public ResultMessage remove(ReturnPO po);
    public ResultMessage modify(ReturnPO po);
    public ArrayList<ReturnPO> getReceipt(ReturnPO po);
    public CommodityPO returnCom(CommodityPO po, ArrayList<ReturnPO> receipt);
    public ResultMessage changeMoney(ReturnPO po);
}
