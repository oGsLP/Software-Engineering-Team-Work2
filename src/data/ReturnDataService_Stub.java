package data;

import businesslogicservice.ResultMessage;
import dataservice.ReturnDataService;
import po.CommodityPO;
import po.GoodsPO;
import po.ReturnPO;


import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class ReturnDataService_Stub implements ReturnDataService{
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
    public ReturnDataService_Stub(String number, String provider, String garbage,ArrayList<GoodsPO> receipt,
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
    public ResultMessage add(ReturnPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage remove(ReturnPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ResultMessage modify(ReturnPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }
    public ArrayList<ReturnPO> getReceipt(ReturnPO po){
        ArrayList<ReturnPO> list = new ArrayList<>();
        list.add(po);
        return list; //数据库实现后具体实现
    }
    public CommodityPO returnCom(CommodityPO po, ArrayList<ReturnPO> receipt){
        return po;      //数据库实现后具体实现
    }
    public ResultMessage changeMoney(ReturnPO po){
        if(po != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

}
