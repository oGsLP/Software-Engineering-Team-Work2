package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.GoodsPO;
import service.dataservice.GoodsDataService;

import java.util.ArrayList;

public class GoodsDataServiceImpl implements GoodsDataService  {
    String operation = "select * from Goods";
    private ArrayList<GoodsPO> goodsList = (ArrayList<GoodsPO>)HQLTools.find(operation);

    private ArrayList<String> resultList = new ArrayList<>();

    @Override
    public ResultMessage add(GoodsPO po) {
        if(!goodsList.contains(po))
            return ResultMessage.Fail;
        HQLTools.add(po);
        goodsList.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(GoodsPO po) {
        if(!goodsList.contains(po))
            return ResultMessage.Fail;
        HQLTools.delete(po);
        goodsList.remove(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(GoodsPO po) {
        // throw warning
        HQLTools.update(po);
        goodsList = (ArrayList<GoodsPO>)HQLTools.find(operation);
        return ResultMessage.Success;
    }

    @Override
    public ArrayList<GoodsPO> retrive(String keywords) {
        return null;
    }

    @Override
    public ArrayList<GoodsPO> find(String keywords) {
        // Ought to be discussed
        return null;
    }
    

}
