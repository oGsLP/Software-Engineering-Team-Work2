package driver;

import businesslogicservice.ResultMessage;
import businesslogicservice.SaleBLService;
import po.CommodityPO;
import po.GoodsPO;
import vo.CommodityVO;
import vo.GoodsVO;
import vo.SaleVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class SaleBLService_driver {
    ArrayList<GoodsVO> goodsList;
    ArrayList<CommodityVO> commodityList;
    String remark;
    public void drive(SaleBLService saleBLService){
        SaleVO vo = new SaleVO("0001", "py", "py", "py", goodsList, commodityList,
                10, 10, 5, "",null);

        ResultMessage msg = saleBLService.createReceipt(vo);
        if(msg == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = saleBLService.cancelReceipt(vo);
        if(msg1 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = saleBLService.finshRecceipt(vo);
        if(msg2 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ArrayList<SaleVO> list = saleBLService.getReceipt(vo);
        for(int i = 0; i < list.size(); i++){
            SaleVO vo1 = list.get(i);
            System.out.println(vo1.getNumber());
            System.out.println(vo1.getDiscount());
            System.out.println(vo1.getCommodityList());
            System.out.println(vo1.getDiscount());
            System.out.println(vo1.getTotalPrice());
            System.out.println(vo1.getRemark());
            System.out.println(vo1.getVo());
            System.out.println(vo1.getSalesman());
            System.out.println(vo1.getOperator());
            System.out.println(vo1.getRetailer());
        }

    }


}
