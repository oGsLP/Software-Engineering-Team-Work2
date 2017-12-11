package objects;

import po.SalePO;
import po.SaleReturnPO;
import po.StockPO;
import po.StockReturnPO;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * 辅助增加编号的，重载 * 4，
 */
public class DateHelper {

   public void addHelper(SalePO po){


   }

   public void addHelper(SaleReturnPO po){}

   public void addHelper(StockPO po){
      String operation = "from Stock";
      ArrayList<StockPO> list = (ArrayList<StockPO>)HQLTools.find(operation);
      int idx = list.size() - 1;
      if(idx == -1) {
         HQLTools.add(po);
         return;
      }
      StockPO lastPO = list.get(idx);
      if(!isSameDay(po.getDate(), lastPO.getDate()))
         po.setReceiptNumber(1);
      HQLTools.add(po);

   }

   public void addHelper(StockReturnPO po){

   }

   public static String getDate(){
      Calendar calendar = Calendar.getInstance();
      return null;
   }

   public static boolean isSameDay(String date1, String date2){
      if(date1.equals(date2))
         return true;
      return false;
   }

}
