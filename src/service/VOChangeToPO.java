package service;

import po.GoodsPO;
import po.MemberPO;
import vo.GoodsVO;
import vo.MemberVO;

/**
 * 将VO转化为PO的类，统一方法为vo名 + "_to_" + po名（ vo, po名全小写 ）
 */
public class VOChangeToPO {
    public GoodsPO goodsvo_to_goodspo(GoodsVO vo){
        GoodsPO po = new GoodsPO();
        po.setNumber(vo.getNumber());
        po.setName(vo.getName());
        po.setType(vo.getType());
        po.setCommodityNum(vo.getCommodityNum());
        po.setPurchasePrice(vo.getPurchasePrice());
        po.setRetailPrice(vo.getRetailPrice());
        po.setRecentPurPrice(vo.getRecentPurPrice());
        po.setRecentRetPrice(vo.getRecentRetPrice());
        return po;
    }

    public MemberPO membervo_to_memberpo(MemberVO vo){
        MemberPO po = new MemberPO();
        po.setNumber(vo.getNumber());
        po.setName(vo.getName());
        po.setMemberClass(vo.getMemberClass());
        po.setLevel(vo.getLevel());
        po.setPhoneNumber(vo.getPhoneNumber());
        po.setAddress(vo.getAddress());
        po.setPostcode(vo.getPostcode());
        po.setMailAddress(vo.getMailAddress());
        po.setCollectionLimit(vo.getCollectionLimit());
        po.setCollection(vo.getCollection());
        po.setPayment(vo.getPayment());
        po.setManagePerson(vo.getManagePerson());
        return po;
    }
}
