package service.dataservice.Impl;

import objects.ResultMessage;
import po.CommodityPO;
import po.StockPO;
import service.dataservice.StockDataService;

import java.util.ArrayList;

public class StockDataServiceImpl implements StockDataService{
    @Override
    public ResultMessage add(StockPO po) {
        return null;
    }

    @Override
    public ResultMessage remove(StockPO po) {
        return null;
    }

    @Override
    public ResultMessage modify(StockPO po) {
        return null;
    }

    @Override
    public ArrayList<StockPO> getReceipt(StockPO po) {
        return null;
    }

    @Override
    public CommodityPO stockCom(CommodityPO po, ArrayList<StockPO> receipt) {
        return null;
    }
}
