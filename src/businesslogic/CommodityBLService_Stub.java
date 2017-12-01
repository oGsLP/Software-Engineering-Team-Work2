package businesslogic;

import service.blservice.CommodityBLService;
import objects.ResultMessage;
import vo.CommodityVO;
import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class CommodityBLService_Stub implements CommodityBLService{
    String presetTime;      //预设时间
    String date;            //日期
    long deliveryAmount;    //出库数量，金额
    long deliveryMoney;
    long storageAmount;     //入库数量，金额
    long storageMoney;
    long stockAmount;       //进货数量，金额
    long stockMoney;
    long saleAmount;        //销售数量，金额
    long saleMoney;

    public CommodityBLService_Stub(String date, long deliveryAmount, long deliveryMoney, long storageAmount,
                                   long storageMoney, long stockAmount, long stockMoney, long saleAmount, long saleMoney){
        this.date = date;
        this.deliveryAmount = deliveryAmount;
        this.deliveryMoney  = deliveryMoney;
        this.storageAmount  = storageAmount;
        this.storageMoney   = storageMoney;
        this.stockAmount    = stockAmount;
        this.stockMoney     = stockMoney;
        this.saleAmount     = saleAmount;
        this.saleMoney      = saleMoney;
    }


    public ArrayList<CommodityVO> getComInfo(String d){
        CommodityVO vo = new CommodityVO(d, deliveryAmount, deliveryMoney, storageAmount, storageMoney, stockAmount,
                stockMoney, saleAmount, saleMoney);
        ArrayList<CommodityVO> list = new ArrayList<>();
        list.add(vo);
        return list;
    }
    public ResultMessage inTime(String currentTime){
        return ResultMessage.Success;   //数据库实现后具体实现
    }
    public ArrayList<CommodityVO> checkComInfo(String d){
        ArrayList<CommodityVO> list = new ArrayList<>();
        CommodityVO vo = new CommodityVO(d, deliveryAmount, deliveryMoney, storageAmount, storageMoney, stockAmount,
                stockMoney, saleAmount, saleMoney);
        list.add(vo);
        return list;
    }
    public ArrayList<CommodityVO> createPresentList(String d){
        ArrayList<CommodityVO> list = new ArrayList<>();
        CommodityVO vo = new CommodityVO(d, deliveryAmount, deliveryMoney, storageAmount, storageMoney, stockAmount,
                stockMoney, saleAmount, saleMoney);
        list.add(vo);
        return list;
    }
    public ResultMessage submitPresentOrder(String d, ArrayList<CommodityVO> presentLst){
        CommodityVO vo = new CommodityVO(d, deliveryAmount, deliveryMoney, storageAmount, storageMoney, stockAmount,
                stockMoney, saleAmount, saleMoney);
        if(vo != null)
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
    public ResultMessage submitBreakageRecepit(String date, ArrayList<CommodityVO> brkLst){
        if(brkLst != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage submitOverflowRecepit(String date, ArrayList<CommodityVO> overflowLst){
        if(overflowLst != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
}
