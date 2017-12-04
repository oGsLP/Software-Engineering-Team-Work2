package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.GoodsPO;
import service.dataservice.GoodsDataService;

import java.util.ArrayList;

public class GoodsDataServiceImpl implements GoodsDataService  {
    String operation = "from Goods";
    private ArrayList<GoodsPO> goodsList = (ArrayList<GoodsPO>)HQLTools.find(operation);
    //goodsList 用于保存所有商品并更新
    private ArrayList<GoodsPO> resultList = new ArrayList<>();

    @Override
    public ResultMessage add(GoodsPO po) {
        if(contains(po))
            return ResultMessage.Fail;
        HQLTools.add(po);
        goodsList.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(GoodsPO po) {
        if(!contains(po))
            return ResultMessage.Fail;
        HQLTools.delete(po);
        goodsList.remove(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(GoodsPO po) {
        // throw warning
        if(!contains(po))
            return ResultMessage.Fail;
        HQLTools.update(po);
        goodsList = (ArrayList<GoodsPO>)HQLTools.find(operation);
        return ResultMessage.Success;
    }

    @Override
    public ArrayList<GoodsPO> retrive(String keywords) {
        return null;
    }

    @Override
    public ArrayList<GoodsPO> find(String number, String name, String type) {
        String operation = "from Goods where number = '" + number +
                "' and name like '%" + name + "%' and type like '%" + type + "%'";
        resultList = (ArrayList<GoodsPO>) HQLTools.find(operation);
        // Ought to be discussed
        return resultList;
    }
    public boolean contains(GoodsPO po){
        if(goodsList.size() > 0){
            for(int i = 0; i < goodsList.size(); i++){
                if(goodsList.get(i).getNumber().equals(po.getNumber()))
                    return true;
            }
        }
        return false;
    }

}
