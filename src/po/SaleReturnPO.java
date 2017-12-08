package po;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 销售退货的数据类
 */
@Entity(name = "SaleReturn")
public class SaleReturnPO implements Serializable{
    /**
     * 单据编号（XSTHD-yyyyMMdd-xxxxx）
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
     * 客户（仅显示销售商）
     */
    String retailer;

    /**
     * 业务员
     */
    String salesman;

    /**
     * 操作员（当前登录系统的用户）
     */
    String operator;

    /**
     * 仓库
     */
    int commodityNumber;

    /**
     * 出货商品
     */
    Set<GoodsSaleReturnPO> saleReturnSet = new HashSet<>();

    /**
     * 折让前总额
     */
    private double totalPrice;

    /**
     * 折让金额
     */
    private double discount;


    /**
     * 折让后总额
     */
    private double payPrice;

    /**
     * 备注
     */
    String remark;

    public SaleReturnPO() {
    }

    /**
     *
     * @param number
     * @param date
     * @param receiptNum
     * @param retailer
     * @param salesman
     * @param operator
     * @param commodityNumber
     * @param saleReturnSet
     * @param totalPrice
     * @param discount
     * @param payPrice
     * @param remark
     */
    public SaleReturnPO(String number, String date, int receiptNum, String retailer,
                  String salesman, String operator, int commodityNumber, Set<GoodsSaleReturnPO> saleReturnSet,
                  double totalPrice, double discount, double payPrice, String remark) {
        this.number = number;
        this.date = date;
        this.receiptNum = receiptNum;
        this.retailer = retailer;
        this.salesman = salesman;
        this.operator = operator;
        this.commodityNumber = commodityNumber;
        this.saleReturnSet = saleReturnSet;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.payPrice = payPrice;
        this.remark = remark;
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

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public Set<GoodsSaleReturnPO> getSaleSet() {
        return saleReturnSet;
    }

    public void setSaleSet(Set<GoodsSaleReturnPO> saleSet) {
        this.saleReturnSet = saleSet;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(double payPrice) {
        this.payPrice = payPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
