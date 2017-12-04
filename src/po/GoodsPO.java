package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * Created by py on 2017/10/18.
 */
@Entity(name = "Goods")

public class GoodsPO implements Serializable {

    /**
     *商品编号
     */
    private String number;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品类型
     */
    private String type;
    /**
     * 库存数量
     */
    private long commodityNum;
    /**
     *进价
     */
    private int purchasePrice;
    /**
     * 零售价
     */
    private int retailPrice;
    /**
     *最近进价
     */
    private int recentPurPrice;
    /**
     **最近零售价
     */
    private int recentRetPrice;

    public GoodsPO(String number, String name, String type, long commodityNum, int purchasePrice, int retailPrice,
                   int recentPurPrice, int recentRetPrice) {
        super();
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
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(long commodityNum) {
        this.commodityNum = commodityNum;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getRecentPurPrice() {
        return recentPurPrice;
    }

    public void setRecentPurPrice(int recentPurPrice) {
        this.recentPurPrice = recentPurPrice;
    }

    public int getRecentRetPrice() {
        return recentRetPrice;
    }

    public void setRecentRetPrice(int recentRetPrice) {
        this.recentRetPrice = recentRetPrice;
    }



}