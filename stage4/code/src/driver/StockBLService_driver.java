package driver;

import businesslogicservice.ResultMessage;
import businesslogicservice.StockBLService;
import vo.CommodityVO;
import vo.GoodsVO;
import vo.StockVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class StockBLService_driver {
    public void drive(StockBLService stockBLService){
        ArrayList<GoodsVO> receipt = null;
        CommodityVO comVo = null;
        StockVO vo = new StockVO("0001", "py", "0001", receipt,10, 20,
                "remark",  comVo);

        ResultMessage msg = stockBLService.cancelReceipt(vo);
        if(msg == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = stockBLService.createReceipt(vo);
        if(msg1 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = stockBLService.finshReceipt(vo);
        if(msg2 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ArrayList<StockVO> list = stockBLService.getReceipt(vo);
        for(int i = 0; i < list.size(); i++){
            StockVO vo1 = list.get(i);
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
