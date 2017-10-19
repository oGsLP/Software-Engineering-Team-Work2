package CommodityPO;

/**
 * Created by py on 2017/10/18.
 */


import java.util.ArrayList;
public interface CommodityData {
    public boolean isInTime(String time);
    public ArrayList<CommodityPO> exceptionInTime();
    public ArrayList<CommodityPO> getComInfo(String date);
    public ArrayList<CommodityPO> getGoods(String goodsNode);
    public ArrayList<CommodityPO> createPresentList(String date);
    public boolean submitPresentOrder(String date, ArrayList<CommodityPO> presentLst);
    public boolean removeCom(String date, ArrayList<CommodityPO> presentLst);
    public boolean submitBreakageRecepit(String date, ArrayList<CommodityPO> brkLst);
    public boolean submitOverflowRecepit(String date, ArrayList<CommodityPO> overflowLst);
    public boolean submitWarningRecepit(String date, ArrayList<CommodityPO> overflowLst);
}
