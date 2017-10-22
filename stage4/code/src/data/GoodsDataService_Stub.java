package data;

import businesslogicservice.ResultMessage;
import dataservice.GoodsDataService;
import po.GoodsPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class GoodsDataService_Stub implements GoodsDataService{
    String number;
    String name;
    String type;
    long commodityNum;
    int purchasePrice;
    int retailPrice;
    int recentPurPrice;
    int recentRetPrice;

    public GoodsDataService_Stub(String number, String name, String type, long commodityNum, int purchasePrice,
                   int retailPrice, int recentPurPrice, int recentRetPrice){
        this.number = number;
        this.name = name;
        this.type = type;
        this.commodityNum = commodityNum;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
        this.recentPurPrice = recentPurPrice;
        this.recentRetPrice = recentRetPrice;
    }
    public ResultMessage add(GoodsPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ResultMessage delete(GoodsPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage modify(GoodsPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ArrayList<GoodsPO>find(String keywords){
        GoodsPO po = new GoodsPO(number, name, type, commodityNum, purchasePrice, retailPrice, recentPurPrice, recentRetPrice);
        ArrayList<GoodsPO> list = new ArrayList<>();    //数据库实现后具体实现
        list.add(po);
        return list;
    }
}
