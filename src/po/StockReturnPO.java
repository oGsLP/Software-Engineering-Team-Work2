package po;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 进货退货数据类
 */
@Entity(name = "StockReturn")
public class StockReturnPO implements Serializable {
    /**
     * 单据编号
     */
    String number;

    /**
     * 当天日期
     */
    String date;

    /**
     * 当天单据号码
     */

    int receiptNum;

    /**
     * 供应商
     */
    String provider;

    /**
     * 仓库
     */
    int commodityNum;

    /**
     * 操作员
     */
    String operator;

    /**
     * 入库商品
     */
    Set<GoodsStockReturnPO> stockSet = new HashSet<>();
    /**
     * 备注
     */
    String remark;

    /**
     * 总额合计
     */
    double totalPrice;

    public StockReturnPO() {
    }

    public StockReturnPO(String number, String date, int receiptNum, String provider, int commodityNum,
                         String operator, Set<GoodsStockReturnPO> stockSet, String remark, double totalPrice) {
        this.number = number;
        this.date = date;
        this.receiptNum = receiptNum;
        this.provider = provider;
        this.commodityNum = commodityNum;
        this.operator = operator;
        this.stockSet = stockSet;
        this.remark = remark;
        this.totalPrice = totalPrice;
    }

    @Id
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(int receiptNum) {
        this.receiptNum = receiptNum;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<GoodsStockReturnPO> getStockSet() {
        return stockSet;
    }

    public void setStockSet(Set<GoodsStockReturnPO> stockSet) {
        this.stockSet = stockSet;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
