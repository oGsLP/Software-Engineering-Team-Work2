package driver;

import businesslogicservice.CommodityBLService;
import businesslogicservice.ResultMessage;
import vo.CommodityVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public class CommodityBLService_driver {
    public void drive(CommodityBLService commodityBLService){
        String date = "2017-10-20";
        ArrayList<CommodityVO> list = commodityBLService.getComInfo(date);
        for(int i = 0; i < list.size(); i++){
            CommodityVO vo = list.get(i);
            System.out.println(vo.getDate());
            System.out.println(vo.getPresetTime());
            System.out.println(vo.getDeliveryAmount());
            System.out.println(vo.getDeliveryMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
            System.out.println(vo.getStockAmount());
            System.out.println(vo.getStockMoney());
            System.out.println(vo.getStorageAmount());
            System.out.println(vo.getStorageMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
        }

        ResultMessage msg = commodityBLService.inTime(date);
        if(msg == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ArrayList<CommodityVO> list1 = commodityBLService.checkComInfo(date);
        for(int i = 0; i < list1.size(); i++){
            CommodityVO vo = list.get(i);
            System.out.println(vo.getDate());
            System.out.println(vo.getPresetTime());
            System.out.println(vo.getDeliveryAmount());
            System.out.println(vo.getDeliveryMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
            System.out.println(vo.getStockAmount());
            System.out.println(vo.getStockMoney());
            System.out.println(vo.getStorageAmount());
            System.out.println(vo.getStorageMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
        }

        ArrayList<CommodityVO> list2 = commodityBLService.createPresentList(date);
        for(int i = 0; i < list2.size(); i++){
            CommodityVO vo = list.get(i);
            System.out.println(vo.getDate());
            System.out.println(vo.getPresetTime());
            System.out.println(vo.getDeliveryAmount());
            System.out.println(vo.getDeliveryMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
            System.out.println(vo.getStockAmount());
            System.out.println(vo.getStockMoney());
            System.out.println(vo.getStorageAmount());
            System.out.println(vo.getStorageMoney());
            System.out.println(vo.getSaleAmount());
            System.out.println(vo.getSaleMoney());
        }

        ResultMessage msg1 = commodityBLService.submitBreakageRecepit(date, list2);
        if(msg1 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg2 = commodityBLService.removeCom(list2);
        if(msg2 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg3 = commodityBLService.submitPresentOrder(date, list2);
        if(msg3 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg4 = commodityBLService.submitOverflowRecepit(date, list2); // No
        if(msg3 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");
    }

}
