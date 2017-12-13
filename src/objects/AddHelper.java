package objects;

import po.SalePO;
import vo.GoodsStockVO;
import vo.SaleVO;
import vo.StockVO;

import java.util.ArrayList;
import java.util.Set;

public class AddHelper {
    DateHelper dateHelper = new DateHelper();

    public StockVO getStockAddHelp(String provider, String remark, Set<GoodsStockVO> set){
        String operation = "from Sale";
        StockVO vo = new StockVO();
        vo.setP;
        ArrayList<SalePO> list = (ArrayList<SalePO>)HQLTools.find(operation);
        int idx = list.size() - 1;
        if(idx == -1){

        }

    }



    public boolean isNextDay(String lastDate){
        String currentDate = dateHelper.getDate();
        return dateHelper.isSameDay(lastDate, currentDate);
    }
}
