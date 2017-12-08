package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by py on 2017/10/20.
 */
@Entity(name = "Stock")
public class StockPO implements Serializable {
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
    String garbage;

    /**
     * 操作员
     */
    String operator;
    /**
     * 入库商品
     */


    /**
     * 备注
     */
    String remark;

    /**
     * 总额合计
     */
    double totalPrice;

    public StockPO() {
    }

    public StockPO(String number, String date, int receiptNum, String provider, String garbage,
                   String operator, String remark, double totalPrice) {
        this.number = number;
        this.date = date;
        this.receiptNum = receiptNum;
        this.provider = provider;
        this.garbage = garbage;
        this.operator = operator;

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