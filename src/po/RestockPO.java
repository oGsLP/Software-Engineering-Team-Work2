package po;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Restock")
public class RestockPO implements Serializable {
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

    int receiptNumber;

    /**
     * 供应商
     */
    String provider;

    /**
     * 仓库
     */
    int commodityNumber;

    /**
     * 操作员
     */
    String operator;

    /**
     * 入库商品
     */
    Set<GoodsStockReturnPO> stockReturnSet = new HashSet<>();

    /**
     * 备注
     */
    String remark;

    /**
     * 总额
     */
    double totalPrice;

    /**
     *
     * @param number
     * @param date
     * @param receiptNumber
     * @param provider
     * @param commodityNumber
     * @param operator
     * @param stockReturnSet
     * @param remark
     * @param totalPrice
     */
    public RestockPO(String number, String date, int receiptNumber, String provider, int commodityNumber,
                     String operator, Set<GoodsStockReturnPO> stockReturnSet, String remark, double totalPrice) {
        this.number = number;
        this.date = date;
        this.receiptNumber = receiptNumber;
        this.provider = provider;
        this.commodityNumber = commodityNumber;
        this.operator = operator;
        this.stockReturnSet = stockReturnSet;
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

    public int getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<GoodsStockReturnPO> getStockReturnSet() {
        return stockReturnSet;
    }

    public void setStockReturnSet(Set<GoodsStockReturnPO> stockReturnSet) {
        this.stockReturnSet = stockReturnSet;
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
