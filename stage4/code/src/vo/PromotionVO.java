package vo;

import java.sql.Date;
import java.util.ArrayList;

import po.ClientPO;

public class PromotionVO extends ReceiptVO {
	ArrayList<VipGift> vip;
	ArrayList<PublicGift> _public;
	ArrayList<RichGift> rich;
	
	PromotionVO(ArrayList<VipGift> vip,ArrayList<PublicGift> _public,ArrayList<RichGift> rich){
		this.vip=vip;
		this._public=_public;
		this.rich=rich;
	}
	
	ArrayList<VipGift> getVipGift(){
		return vip;
	}
	ArrayList<PublicGift> getPublicGift(){
		return _public;
	}
	ArrayList<RichGift> getRichGift(){
		return rich;
	}
}
class VipGift{
	ArrayList<Integer> classes;
	ArrayList<GoodsVO> giftList;
	double discount;
	double giftVoucher;
	Date start;
	Date end;
	VipGift(ArrayList<Integer> classes,ArrayList<GoodsVO> giftList,double discount,double giftVoucher,Date start,Date end){
		this.classes=classes;
		this.giftList=giftList;
		this.discount=discount;
		this.giftVoucher=giftVoucher;
		this.start=start;
		this.end=end;
	}
}

class PublicGift{
	ArrayList<GoodsVO> promotionList;
	Date start;
	Date end;
	PublicGift(ArrayList<GoodsVO> promotionList,Date start,Date end){
		this.promotionList=promotionList;
		this.start=start;
		this.end=end;
	}
}
class RichGift{
	double limit;
	ArrayList<GoodsVO> giftList;
	ArrayList<GoodsVO> giftVoucher;
	Date start;
	Date end;
	RichGift(double limit,ArrayList<GoodsVO> giftList,ArrayList<GoodsVO> giftVoucher,Date start,Date end){
		this.limit=limit;
		this.giftList=giftList;
		this.giftVoucher=giftVoucher;
		this.start=start;
		this.end=end;
	}
}