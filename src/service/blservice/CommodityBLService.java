package service.blservice;

import objects.ResultMessage;
import vo.CommodityVO;
import java.util.ArrayList;
/**
 * Created by py on 2017/10/19.
 */
public interface CommodityBLService {
   public ArrayList<CommodityVO> getComInfo(String date);
   public ResultMessage inTime(String currentTime);
   public ArrayList<CommodityVO> checkComInfo(String date);
   public ArrayList<CommodityVO> createPresentList(String date);
   public ResultMessage submitPresentOrder(String date, ArrayList<CommodityVO> presentLst);
   public ResultMessage removeCom(ArrayList<CommodityVO> presentList);
   public ResultMessage submitBreakageRecepit(String date, ArrayList<CommodityVO> brkLst);
   public ResultMessage submitOverflowRecepit(String date, ArrayList<CommodityVO> overflowLst);

}
