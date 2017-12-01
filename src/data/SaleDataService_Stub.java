package data;

import objects.ResultMessage;
import service.dataservice.SaleDataService;
import po.CommodityPO;
import po.GoodsPO;
import po.SalePO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class SaleDataService_Stub implements SaleDataService{
    String number;
    String retailer;
    String salesman;
    String operator;
    ArrayList<GoodsPO> goodsList;
    ArrayList<CommodityPO> commodityList;
    long price;
    int discount;
    int replaceAmount;
    long totalPrice;
    String remark;
    CommodityPO po;
    //生成一个销售出货单，包括：单据编号（XSD-yyyyMMdd-xxxxx），客户（仅显示销售商），业务员（和这个客户打交道的公司员工，可以设置一个客户的默认业务员）
    // ，操作员（当前登录系统的用户），仓库，出货商品清单，折让前总额，折让，使用代金卷金额，折让后总额，备注。出货商品清单中要显示商品的编号，名称（从商品选择界面选择），
    // 型号，数量（手工输入），单价（默认为商品信息里的销售价，可修改），金额（自动生成），商品备注。销售单通过审批后，会更改库存数据和客户的应收应付数据。
    public SaleDataService_Stub(String number, String retailer, String salesman, String operator, ArrayList<GoodsPO> goodsList,
                  ArrayList<CommodityPO> commodityList, long price, int discount, long totalPrice, String remark, CommodityPO po){
        this.number = number;
        this.retailer = retailer;
        this.salesman = salesman;
        this.operator = operator;
        this.goodsList = goodsList;
        this.commodityList = commodityList;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.remark = remark;
        this.po = po;

    }
    public ResultMessage add(SalePO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage remove(SalePO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage modify(SalePO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;

    }    public ArrayList<SalePO> getReceipt(SalePO po){
        ArrayList<SalePO> list = new ArrayList<>();
        list.add(po);
        return list;
    }
    public CommodityPO returnCom(CommodityPO po, ArrayList<SalePO> receipt){
        return po;
    }
    public ResultMessage changeMoney(SalePO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
}
