package po;

import java.io.Serializable;

/**
 * Created by py on 2017/10/18.
 */
public class GoodsPO implements Serializable{
    String number;
    String name;
    String type;
    long commodityNum;
    int purchasePrice;
    int retailPrice;
    int recentPurPrice;
    int recentRetPrice;

    public GoodsPO(String number, String name, String type, long commodityNum, int purchasePrice,
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
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
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
}
