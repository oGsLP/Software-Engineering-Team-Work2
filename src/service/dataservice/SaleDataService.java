package service.dataservice;

import objects.ResultMessage;
import po.CommodityPO;
import po.SalePO;


import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public interface SaleDataService {
    public ResultMessage add(SalePO po);
    public ResultMessage remove(SalePO po);
    public ResultMessage modify(SalePO po);
    public ArrayList<SalePO> getReceipt(SalePO po);
    public CommodityPO returnCom(CommodityPO po, ArrayList<SalePO> receipt);
    public ResultMessage changeMoney(SalePO po);

}
