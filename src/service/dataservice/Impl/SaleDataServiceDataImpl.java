package service.dataservice.Impl;

import objects.ResultMessage;
import po.CommodityPO;
import po.SalePO;
import service.dataservice.SaleDataService;

import java.util.ArrayList;

public class SaleDataServiceDataImpl implements SaleDataService{

    @Override
    public ResultMessage add(SalePO po) {
        return null;
    }

    @Override
    public ResultMessage remove(SalePO po) {
        return null;
    }

    @Override
    public ResultMessage modify(SalePO po) {
        return null;
    }

    @Override
    public ArrayList<SalePO> getReceipt(SalePO po) {
        return null;
    }

    @Override
    public CommodityPO returnCom(CommodityPO po, ArrayList<SalePO> receipt) {
        return null;
    }

    @Override
    public ResultMessage changeMoney(SalePO po) {
        return null;
    }
}
