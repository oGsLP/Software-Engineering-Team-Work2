package vo;

import po.CommodityPO;
import po.GoodsPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class ReturnVO extends ReceiptVO {
    String number;
    String provider;
    String garbage;
    ArrayList<GoodsVO> receipt;
    long price;
    long totalPrice;
    String remark;
    CommodityVO vo;
    //渚涘簲鍟嗭紝浠撳簱锛屾搷浣滃憳锛屽叆搴撳晢鍝佸垪琛紝澶囨敞锛屾�婚鍚堣銆傚叾涓叆搴撳晢鍝佸垪琛ㄥ寘鍚殑淇℃伅鏈夛細鍟嗗搧缂栧彿锛屽悕绉帮紙浠庡晢鍝侀�夋嫨鐣岄潰杩涜閫夋嫨锛夛紝鍨嬪彿锛屾暟閲忥紙鎵嬪姩杈撳叆锛夛紝鍗�
// 浠凤紙榛樿涓哄晢鍝佷俊鎭腑鐨勮繘浠凤級锛岄噾棰濓紝澶囨敞锛堟墜鍔ㄨ緭鍏ワ級銆傛病鏈変笅鍒掔嚎鐨勯儴鍒嗘槸鑷姩璁＄畻骞跺～鍏呰繘鍘荤殑銆傝繘璐у崟閫氳繃瀹℃壒鍚庯紝浼氭洿鏀瑰簱瀛樻暟鎹拰瀹㈡埛鐨勫簲鏀跺簲浠樻暟鎹�傦級
    public ReturnVO(String number, String provider, String garbage, ArrayList<GoodsVO> receipt,
                    long price, long totalPrice, String remark, CommodityVO vo){
        this.number = number;
        this.provider = provider;
        this.garbage = garbage;
        this.receipt = receipt;
        this.price = price;
        this.totalPrice = totalPrice;
        this.remark = remark;
        this.vo = vo;
    }
    public String getNumber(){
        return number;
    }
    public String getProvider(){
        return provider;
    }
    public String getGarbage(){
        return garbage;
    }
    public ArrayList<GoodsVO> getReceipt(){
        return receipt;
    }
    public long getPrice(){
        return price;
    }
    public long getTotalPrice(){
        return totalPrice;
    }
    public String getRemark(){
        return remark;
    }
    public CommodityVO getVo(){
        return vo;
    }
}
