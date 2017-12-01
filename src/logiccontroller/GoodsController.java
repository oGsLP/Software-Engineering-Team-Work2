package logiccontroller;

import service.blservice.GoodsBLService;
import objects.ResultMessage;
import vo.GoodsVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/11/9.
 */
public class GoodsController implements GoodsBLService{
    String number = "0001";
    String name = "lamp";
    String type = "X";
    long commodityNum = 60;
    int purchasePrice = 100;
    int retailPrice = 200;
    int recentPurPrice = 100;
    int recentRetPrice = 170;
    GoodsVO vo0 = new GoodsVO(number, name, type, commodityNum, purchasePrice, retailPrice,
            recentPurPrice, recentRetPrice);
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
        list.add(vo0);
        return list;
    }
    public ArrayList<GoodsVO> getGoods(String node){
        ArrayList<GoodsVO> list = new ArrayList<>();
        list.add(vo0);
        return list;
    }



}
