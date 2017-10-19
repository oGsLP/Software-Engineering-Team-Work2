package data;

import businesslogicservice.ResultMessage;
import com.sun.org.apache.regexp.internal.RE;
import dataservice.CommodityDataService;
import po.CommodityPO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class CommodityDataService_Stub implements CommodityDataService{
    String presetTime;      //预设时间
    long deliveryAmount;    //出库数量，金额
    long deliveryMoney;
    long storageAmount;     //入库数量，金额
    long storageMoney;
    long stockAmount;       //进货数量，金额
    long stockMoney;
    long saleAmount;        //销售数量，金额
    long saleMoney;
    public CommodityDataService_Stub(long deliveryAmount, long deliveryMoney, long storageAmount, long storageMoney,
                                     long stockAmount, long stockMoney, long saleAmount, long saleMoney){
        this.deliveryAmount = deliveryAmount;
        this.deliveryMoney  = deliveryMoney;
        this.storageAmount  = storageAmount;
        this.storageMoney   = storageMoney;
        this.stockAmount    = stockAmount;
        this.stockMoney     = stockMoney;
        this.saleAmount     = saleAmount;
        this.saleMoney      = saleMoney;
    }
    public ResultMessage isInTime(String time){
        SimpleDateFormat currentTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        if(isInRange(presetTime, currentTime + ""))
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ArrayList<CommodityPO> getComInfo(String date){
        ArrayList<CommodityPO> list = new ArrayList<>();
        return list; // 数据库实现后具体实现
    }
    public ArrayList<CommodityPO> getGoods(String goodsNode){
        ArrayList<CommodityPO> list = new ArrayList<>();
        return list;// 数据库实现后具体实现
    }
    public ArrayList<CommodityPO> createPresentList(String date){
        ArrayList<CommodityPO> list = new ArrayList<>();
        return list;// 数据库实现后具体实现
    }
    public ResultMessage submitPresentOrder(String date, ArrayList<CommodityPO> presentLst){
       return ResultMessage.Success;// 数据库实现后具体实现
    }
    public ResultMessage removeCom(String date, ArrayList<CommodityPO> presentLst){
        return ResultMessage.Success;// 数据库实现后具体实现
    }
    public ResultMessage submitBreakageRecepit(String date, ArrayList<CommodityPO> brkLst){
        return ResultMessage.Success;// 数据库实现后具体实现
    }
    public ResultMessage submitOverflowRecepit(String date, ArrayList<CommodityPO> overflowLst){
        return ResultMessage.Success;// 数据库实现后具体实现
    }
    public ResultMessage submitWarningRecepit(String date, ArrayList<CommodityPO> overflowLst){
        return ResultMessage.Success;// 数据库实现后具体实现
    }


    public static boolean isInRange(String presetTime, String currentTime){
        boolean result = true;  //数据库实现后具体实现
        return result;
    }
}
