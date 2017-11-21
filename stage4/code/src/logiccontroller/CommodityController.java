package logiccontroller;

import businesslogicservice.CommodityBLService;
import businesslogicservice.ResultMessage;
import vo.CommodityVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/11/6.
 */
public class CommodityController implements CommodityBLService {
    String presetTime;
    String date;
    long deliveryAmount;
    long deliveryMoney;
    long storageAmount;
    long storageMoney;
    long stockAmount;
    long stockMoney;
    long saleAmount;
    long saleMoney;
    public ArrayList<CommodityVO> getComInfo(String date){
        ArrayList<CommodityVO> lst = new ArrayList<>();
        return lst;
    }
    public ResultMessage inTime(String currentTime){
        boolean inRange = true;
        if(inRange)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ArrayList<CommodityVO> checkComInfo(String date){
        ArrayList<CommodityVO> lst = new ArrayList<>();
        return lst;
    }
    public ArrayList<CommodityVO> createPresentList(String date){
        ArrayList<CommodityVO> lst = new ArrayList<>();
        return lst;
    }
    public ResultMessage submitPresentOrder(String date, ArrayList<CommodityVO> presentList){
        if(presentList != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage removeCom(ArrayList<CommodityVO> presentList){
        if(presentList != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage submitBreakageRecepit(String date, ArrayList<CommodityVO> brkList){
        if(brkList != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage submitOverflowRecepit(String date, ArrayList<CommodityVO> overflowList){
        if(overflowList != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

}
