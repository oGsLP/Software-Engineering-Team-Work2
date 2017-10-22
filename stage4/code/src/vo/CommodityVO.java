package vo;

/**
 * Created by py on 2017/10/19.
 */
public class CommodityVO {
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

    public CommodityVO(String date, long deliveryAmount, long deliveryMoney, long storageAmount, long storageMoney,
                       long stockAmount, long stockMoney, long saleAmount, long saleMoney){
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
    public String getDate(){
        return date;
    }
    public String getPresetTime(){
        return presetTime;
    }
    public long getDeliveryAmount(){
        return deliveryAmount;
    }
    public long getDeliveryMoney(){
        return deliveryMoney;
    }
    public long getStorageAmount(){
        return storageAmount;
    }
    public long getStorageMoney(){
        return storageMoney;
    }
    public long getStockAmount(){
        return stockAmount;
    }
    public long getStockMoney(){
        return stockMoney;
    }
    public long getSaleAmount(){
        return saleAmount;
    }
    public long getSaleMoney(){
        return saleMoney;
    }
}
