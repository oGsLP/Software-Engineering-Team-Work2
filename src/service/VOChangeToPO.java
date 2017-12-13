package service;

import po.*;
import vo.*;

import java.util.HashSet;
import java.util.Set;

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


    public ClassifyPO classifyvo_to_classifypo(ClassifyVO vo){
        ClassifyPO po = new ClassifyPO();
        po.setId(vo.getId());
        po.setName(vo.getName());
        Set<GoodsPO> poSet = new HashSet<>();
        Set<GoodsVO> voSet = vo.goodsSet;

        for(GoodsVO goodsVO: voSet) {
            poSet.add(goodsvo_to_goodspo(goodsVO));
        }
        po.setGoodsSet(poSet);

        return po;
    }


    public GoodsStockPO goodsStockvo_to_goodsStockpo(GoodsStockVO vo){
        GoodsStockPO po = new GoodsStockPO();
        po.setId(vo.getId());
        po.setStockNumber(vo.getStockNumber());
        po.setPo(goodsvo_to_goodspo(vo.getVo()));
        po.setRemark(vo.getRemark());
        po.setTotalPrice(vo.getTotalPrice());
        return po;
    }


    public GoodsStockReturnPO goodsStockReturnvo_to_goodsStockReturnpo(GoodsStockReturnVO vo){
        GoodsStockReturnPO po = new GoodsStockReturnPO();
        po.setId(vo.getId());
        po.setPo(goodsvo_to_goodspo(vo.getVo()));
        po.setRemark(vo.getRemark());
        po.setStockReturnNumber(vo.getStockReturnNumber());
        po.setTotalPrice(vo.getTotalPrice());
        return po;
    }


    public GoodsSalePO goodsSalevo_to_goodsSalepo(GoodsSaleVO vo){
        GoodsSalePO po = new GoodsSalePO();
        po.setId(vo.getId());
        po.setPo(goodsvo_to_goodspo(vo.getVo()));
        po.setPrice(vo.getPrice());
        po.setRemark(vo.getRemark());
        po.setSaleNumber(vo.getSaleNumber());
        po.setTotalPrice(vo.getTotalPrice());
        return po;
    }


    public GoodsSaleReturnPO goodsSaleReturnvo_to_goodsSaleReturnpo(GoodsSaleReturnVO vo){
        GoodsSaleReturnPO po = new GoodsSaleReturnPO();
        po.setId(vo.getId());
        po.setPo(goodsvo_to_goodspo(vo.getVo()));
        po.setPrice(vo.getPrice());
        po.setRemark(vo.getRemark());
        po.setSaleReturnNumber(vo.getSaleReturnNumber());
        po.setTotalPrice(vo.getTotalPrice());
        return po;
    }

    public StockPO stockvo_to_stockpo(StockVO vo){
        StockPO po = new StockPO();
        po.setReceiptNumber(vo.getReceiptNumber());
        po.setCommodityNumber(vo.getCommodityNumber());
        po.setDate(vo.getDate());
        po.setNumber(vo.getNumber());
        po.setOperator(vo.getOperator());
        po.setProvider(vo.getProvider());
        po.setRemark(vo.getRemark());
        po.setTotalPrice(vo.getTotalPrice());

        Set<GoodsStockPO> poSet = new HashSet<>();
        Set<GoodsStockVO> voSet = vo.getStockSet();
        for(GoodsStockVO goodsVo :voSet){
            poSet.add(goodsStockvo_to_goodsStockpo(goodsVo));
        }
        po.setStockSet(poSet);
        return po;
    }

    public SalePO salevo_to_salepo(SaleVO vo){
        SalePO po = new SalePO();

        po.setDate(vo.getDate());
        po.setReceiptNumber(vo.getReceiptNumber());
        po.setNumber(vo.getNumber());
        po.setCommodityNumber(vo.getCommodityNumber());
        po.setDiscount(vo.getDiscount());
        po.setOperator(vo.getOperator());
        po.setTotalPrice(vo.getTotalPrice());
        po.setRemark(vo.getRemark());
        po.setPayPrice(vo.getPayPrice());
        po.setRetailer(vo.getRetailer());
        po.setSalesman(vo.getSalesman());
        po.setVoucher(vo.getVoucher());

        Set<GoodsSalePO> set = new HashSet<>();
        for(GoodsSaleVO vo1 : vo.getSaleSet()){
            set.add(goodsSalevo_to_goodsSalepo(vo1));
        }
        po.setSaleSet(set);
        return po;
    }



}
