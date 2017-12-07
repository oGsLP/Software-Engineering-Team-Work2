package po;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by py on 2017/10/20.
 */
@Entity(name = "Stock")
public class StockPO implements Serializable{
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
     *供应商
     */
    String provider;

    /**
     * 仓库
     */
    String garbage;

    /**
     * 操作员
     */
    String operator;
    /**
     * 入库商品
     */
    Set<GoodsPO> goodsSet;

    /**
     * 入库商品数量
     */
    Set<Integer> goodsNum;

    /**
     * 备注
     */
    String remark;

    /**
     * 总额合计
     */
    long totalPrice;

    public StockPO() {
    }

    /**
     *
     * @param provider
     * @param garbage
     * @param operator
     * @param goodsSet
     * @param remark
     * @param totalPrice
     */
    public StockPO(String provider, String garbage, String operator, Set<GoodsPO> goodsSet,
                   String remark, long totalPrice) {
        this.provider = provider;
        this.garbage = garbage;
        this.operator = operator;
        this.goodsSet = goodsSet;
        this.remark = remark;
        this.totalPrice = totalPrice;
    }

    /**
     *
     * @param number
     * @param date
     * @param receiptNum
     * @param provider
     * @param garbage
     * @param operator
     * @param goodsSet
     * @param remark
     * @param totalPrice
     */

    public StockPO(String number, String date, int receiptNum, String provider,
                   String garbage, String operator, Set<GoodsPO> goodsSet, String remark, long totalPrice) {
        this.number = number;
        this.date = date;
        this.receiptNum = receiptNum;
        this.provider = provider;
        this.garbage = garbage;
        this.operator = operator;
        this.goodsSet = goodsSet;
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

    public String getGarbage() {
        return garbage;
    }

    public void setGarbage(String garbage) {
        this.garbage = garbage;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
@OneToMany(cascade = CascadeType.ALL)
    public Set<GoodsPO> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<GoodsPO> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
