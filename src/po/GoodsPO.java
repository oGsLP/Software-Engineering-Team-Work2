package po;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
/**
 * Created by py on 2017/10/18.
 */
@Entity(name = "Goods")

public class GoodsPO implements Serializable{

    private String number;
    private String name;
    private String type;
    private long commodityNum;
    private int purchasePrice;
    private int retailPrice;
    private int recentPurPrice;
    private int recentRetPrice;

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

    public GoodsPO() {
        super();
    }

    @Id
    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public long getCommodityNum(){
        return commodityNum;
    }
    public void setCommodityNum(long commodityNum){
        this.commodityNum = commodityNum;
    }

    public int getPurchasePrice(){
        return purchasePrice;
    }
    public void setPurchasePrice(int purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public int getRetailPrice(){
        return retailPrice;
    }
    public void setRetailPrice(int retailPrice){
        this.retailPrice = retailPrice;
    }
    public int getRecentPurPrice(){
        return recentPurPrice;
    }
    public void setRecentPurPrice(int recentPurPrice){
        this.recentPurPrice = recentPurPrice;
    }
    public int getRecentRetPrice(){
        return recentRetPrice;
    }
    public void setRecentRetPrice(int recentRetPrice){
        this.recentPurPrice = recentRetPrice;
    }
}

