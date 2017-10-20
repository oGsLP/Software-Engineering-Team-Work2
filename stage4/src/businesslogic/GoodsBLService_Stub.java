package businesslogic;

import businesslogicservice.GoodsBLService;
import businesslogicservice.ResultMessage;
import vo.GoodsVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class GoodsBLService_Stub implements GoodsBLService{
    String number;
    String name;
    String type;
    long commodityNum;
    int purchasePrice;
    int retailPrice;
    int recentPurPrice;
    int recentRetPrice;

    public GoodsBLService_Stub(String number, String name, String type, long commodityNum, int purchasePrice,
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
    public ResultMessage addGoods(GoodsVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage deleteGoods(GoodsVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage modifyGoods(GoodsVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ArrayList<GoodsVO> findGoods(String keywords){
        ArrayList<GoodsVO> list = new ArrayList<>();
        return list;//数据库实现后具体实现
    }
    public ArrayList<GoodsVO> getGoods(String node){
        ArrayList<GoodsVO> list = new ArrayList<>();
        return list;//数据库实现后具体实现
    }
}
