package vo;

import java.sql.Date;

/**
 * Created by py on 2017/10/19.
 */
public class GoodsVO {
    String number;
    String name;
    String type;
    double quantity;
    long commodityNum;
    int purchasePrice;
    int retailPrice;
    int recentPurPrice;
    int recentRetPrice;
    Date time;

    public GoodsVO(String number, String name, String type,double quantity, long commodityNum, int purchasePrice,
                   int retailPrice, int recentPurPrice, int recentRetPrice,Date time){
        this.number = number;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.commodityNum = commodityNum;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
        this.recentPurPrice = recentPurPrice;
        this.recentRetPrice = recentRetPrice;
        this.time=time;
    }
    
    public GoodsVO(String number, String name, String type, long commodityNum, int purchasePrice,
            int retailPrice, int recentPurPrice, int recentRetPrice){
    	this.number = number;
        this.name = name;
        this.type = type;
        this.quantity = 0;
        this.commodityNum = commodityNum;
        this.purchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
        this.recentPurPrice = recentPurPrice;
        this.recentRetPrice = recentRetPrice;
        this.time=new Date(0);
}
    
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getQuantity(){
    	return quantity;
    }
    public long getCommodityNum(){
        return commodityNum;
    }
    public int getPurchasePrice(){
        return purchasePrice;
    }
    public int getRetailPrice(){
        return retailPrice;
    }
    public int getRecentPurPrice(){
        return recentPurPrice;
    }
    public int getRecentRetPrice(){
        return recentRetPrice;
    }
    public Date getTime(){
    	return time;
    }
}
