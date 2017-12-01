package driver;

import objects.ResultMessage;
import service.blservice.ReturnBLService;
import vo.CommodityVO;
import vo.GoodsVO;
import vo.ReturnVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class ReturnBLService_driver {
    public void drive(ReturnBLService returnBLService){
        ArrayList<GoodsVO> receipt = null;
        CommodityVO comVo = null;
        ReturnVO vo = new ReturnVO("0001", "py", "0001", receipt,10, 20,
                "remark",  comVo);

        ResultMessage msg = returnBLService.cancelReceipt(vo);
        if(msg == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = returnBLService.createReceipt(vo);
        if(msg1 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = returnBLService.finshReceipt(vo);
        if(msg2 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ArrayList<ReturnVO> list = returnBLService.getReceipt(vo);
        for(int i = 0; i < list.size(); i++){
            ReturnVO vo1 = list.get(i);
            System.out.println(vo1.getNumber());
            System.out.println(vo1.getProvider());
            System.out.println(vo1.getGarbage());
            System.out.println(vo1.getReceipt());
            System.out.println(vo1.getTotalPrice());
            System.out.println(vo1.getRemark());
            System.out.println(vo1.getVo());
        }


    }
}
