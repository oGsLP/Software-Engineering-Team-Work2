package po;


import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class ReturnPO {
    String number;
    String provider;
    String garbage;
    ArrayList<GoodsPO> receipt;
    long price;
    long totalPrice;
    String remark;
    CommodityPO po;
    //供应商，仓库，操作员，入库商品列表，备注，总额合计。其中入库商品列表包含的信息有：商品编号，名称（从商品选择界面进行选择），型号，数量（手动输入），单
// 价（默认为商品信息中的进价），金额，备注（手动输入）。没有下划线的部分是自动计算并填充进去的。进货单通过审批后，会更改库存数据和客户的应收应付数据。）
    public ReturnPO(String number, String provider, String garbage, ArrayList<GoodsPO> receipt,
                     long price, long totalPrice, String remark, CommodityPO po){
        this.number = number;
        this.provider = provider;
        this.garbage = garbage;
        this.receipt = receipt;
        this.price = price;
        this.totalPrice = totalPrice;
        this.remark = remark;
        this.po = po;
    }
    public String getNumber(){
        return number;
    }
    public String getProvider(){
        return provider;
    }
    public String getGarbage(){
        return garbage;
    }
    public ArrayList<GoodsPO> getReceipt(){
        return receipt;
    }
    public long getPrice(){
        return price;
    }
    public long getTotalPrice(){
        return totalPrice;
    }
    public String getRemark(){
        return remark;
    }
    public CommodityPO getPo(){
        return po;
    }
}
