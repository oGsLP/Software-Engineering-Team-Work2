package driver;

import service.blservice.GoodsBLService;
import objects.ResultMessage;
import vo.GoodsVO;
import java.util.ArrayList;
/**
 * Created by py on 2017/10/19.
 */
public class GoodsBLService_driver {
    public void drive(GoodsBLService goodsBLService){
        GoodsVO vo = new GoodsVO("0001", "goods1", "type1", 100,
                10, 12, 12, 12);
        ResultMessage msg = goodsBLService.addGoods(vo);

        if(msg == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ResultMessage msg1 = goodsBLService.modifyGoods(vo);
        if(msg1 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");
        ResultMessage msg2 = goodsBLService.deleteGoods(vo);

        if(msg2 == ResultMessage.Success)
            System.out.println("Success");
        else
            System.out.println("Fail");

        ArrayList<GoodsVO> list = new ArrayList<>();
        list = goodsBLService.findGoods("00001");
        for(int i = 0; i < list.size(); i++){
            GoodsVO vo1 = list.get(i);
            System.out.println(vo1.getNumber());
            System.out.println(vo1.getName());
            System.out.println(vo1.getType());
            System.out.println(vo1.getCommodityNum());
            System.out.println(vo1.getPurchasePrice());
            System.out.println(vo1.getRetailPrice());
            System.out.println(vo1.getRecentPurPrice());
            System.out.println(vo1.getRecentPurPrice());
        }

        ArrayList<GoodsVO> list1 = goodsBLService.getGoods("node");
        list1 = goodsBLService.findGoods("00001");
        for(int i = 0; i < list1.size(); i++){
            GoodsVO vo1 = list.get(i);
            System.out.println(vo1.getNumber());
            System.out.println(vo1.getName());
            System.out.println(vo1.getType());
            System.out.println(vo1.getCommodityNum());
            System.out.println(vo1.getPurchasePrice());
            System.out.println(vo1.getRetailPrice());
            System.out.println(vo1.getRecentPurPrice());
            System.out.println(vo1.getRecentPurPrice());
        }
    }

}
