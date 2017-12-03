package service.dataservice.Impl;

import objects.ResultMessage;
import po.CommodityPO;
import po.ReturnPO;
import service.dataservice.ReturnDataService;

import java.util.ArrayList;

public class ReturnDataServiceImpl implements ReturnDataService{
    @Override
    public ResultMessage add(ReturnPO po) {
        return null;
    }

    @Override
    public ResultMessage remove(ReturnPO po) {
        return null;
    }

    @Override
    public ResultMessage modify(ReturnPO po) {
        return null;
    }

    @Override
    public ArrayList<ReturnPO> getReceipt(ReturnPO po) {
        return null;
    }

    @Override
    public CommodityPO returnCom(CommodityPO po, ArrayList<ReturnPO> receipt) {
        return null;
    }

    @Override
    public ResultMessage changeMoney(ReturnPO po) {
        return null;
    }
}
