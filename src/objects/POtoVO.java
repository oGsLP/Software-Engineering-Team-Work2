package objects;

import po.GoodsPO;
import vo.GoodsVO;
/**
 * 将pO转化为vO的类，统一方法为po名 + "_to_" + vo名（ vo, po名全小写 ）
 */
public class POtoVO {
     public GoodsVO goodspo_to_goodsvo(GoodsPO po){
        GoodsVO vo = new GoodsVO();
        vo.setNumber(po.getNumber());
        vo.setName(po.getName());
        vo.setType(po.getType());
        vo.setCommodityNum(po.getCommodityNum());
        vo.setPurchasePrice(po.getPurchasePrice());
        vo.setRetailPrice(po.getRetailPrice());
        vo.setRecentPurPrice(po.getPurchasePrice());
        vo.setRecentRetPrice(po.getRecentRetPrice());
        return vo;
    }

}
