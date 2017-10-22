package po;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class SalePO extends ReceiptPO {
    String number;
    String retailer;
    String salesman;
    String operator;
    ArrayList<GoodsPO> goodsList;
    ArrayList<CommodityPO> commodityList;
    long price;
    int discount;
    int replaceAmount;
    long totalPrice;
    String remark;
    CommodityPO po;
    //鐢熸垚涓�涓攢鍞嚭璐у崟锛屽寘鎷細鍗曟嵁缂栧彿锛圶SD-yyyyMMdd-xxxxx锛夛紝瀹㈡埛锛堜粎鏄剧ず閿�鍞晢锛夛紝涓氬姟鍛橈紙鍜岃繖涓鎴锋墦浜ら亾鐨勫叕鍙稿憳宸ワ紝鍙互璁剧疆涓�涓鎴风殑榛樿涓氬姟鍛橈級
    // 锛屾搷浣滃憳锛堝綋鍓嶇櫥褰曠郴缁熺殑鐢ㄦ埛锛夛紝浠撳簱锛屽嚭璐у晢鍝佹竻鍗曪紝鎶樿鍓嶆�婚锛屾姌璁╋紝浣跨敤浠ｉ噾鍗烽噾棰濓紝鎶樿鍚庢�婚锛屽娉ㄣ�傚嚭璐у晢鍝佹竻鍗曚腑瑕佹樉绀哄晢鍝佺殑缂栧彿锛屽悕绉帮紙浠庡晢鍝侀�夋嫨鐣岄潰閫夋嫨锛夛紝
    // 鍨嬪彿锛屾暟閲忥紙鎵嬪伐杈撳叆锛夛紝鍗曚环锛堥粯璁や负鍟嗗搧淇℃伅閲岀殑閿�鍞环锛屽彲淇敼锛夛紝閲戦锛堣嚜鍔ㄧ敓鎴愶級锛屽晢鍝佸娉ㄣ�傞攢鍞崟閫氳繃瀹℃壒鍚庯紝浼氭洿鏀瑰簱瀛樻暟鎹拰瀹㈡埛鐨勫簲鏀跺簲浠樻暟鎹��
    public SalePO(String number, String retailer, String salesman, String operator, ArrayList<GoodsPO> goodsList,
         ArrayList<CommodityPO> commodityList, long price, int discount, long totalPrice, String remark, CommodityPO po){
        this.number = number;
        this.retailer = retailer;
        this.salesman = salesman;
        this.operator = operator;
        this.goodsList = goodsList;
        this.commodityList = commodityList;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.remark = remark;
        this.po = po;

    }
    public String getNumber(){
        return number;
    }
    public String getRetailer(){
        return retailer;
    }
    public String getSalesman(){
        return salesman;
    }
    public String getOperator(){
        return operator;
    }
    public ArrayList<GoodsPO> getGoodsList(){
        return goodsList;
    }
    public ArrayList<CommodityPO> getCommodityList(){
        return commodityList;
    }
    public long getPrice(){
        return price;
    }
    public int getDiscount(){
        return discount;
    }
    public int getReplaceAmount(){
        return replaceAmount;
    }
    public long getTotalPrice(){
        return totalPrice;

    }
    public String getRemark(){
        return remark;
    }
    public CommodityPO getPo(){
        return po;
    }
}

