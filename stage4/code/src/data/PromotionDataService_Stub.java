package data;

import java.sql.Date;
import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.PromotionDataService;
import po.*;

public class PromotionDataService_Stub implements PromotionDataService{

	ArrayList<VipGift> vip;
	ArrayList<PublicGift> _public;
	ArrayList<RichGift> rich;
	
	PromotionDataService_Stub(ArrayList<VipGift> vip,ArrayList<PublicGift> _public,ArrayList<RichGift> rich){
		this.vip=vip;
		this._public=_public;
		this.rich=rich;
	}
	
	@Override
	public GoodsPO getGoodsInformation(GoodsPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<GoodsPO> getPromotionGoods(ArrayList<PromotionPO> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage deleteInformation(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage endInput(PromotionPO po) {
		// TODO Auto-generated method stub
		return null;
	}

}

class VipGift{
	ArrayList<Integer> classes;
	ArrayList<GoodsPO> giftList;
	double discount;
	double giftPOucher;
	Date start;
	Date end;
	VipGift(ArrayList<Integer> classes,ArrayList<GoodsPO> giftList,double discount,double giftPOucher,Date start,Date end){
		this.classes=classes;
		this.giftList=giftList;
		this.discount=discount;
		this.giftPOucher=giftPOucher;
		this.start=start;
		this.end=end;
	}
}

class PublicGift{
	ArrayList<GoodsPO> promotionList;
	Date start;
	Date end;
	PublicGift(ArrayList<GoodsPO> promotionList,Date start,Date end){
		this.promotionList=promotionList;
		this.start=start;
		this.end=end;
	}
}
class RichGift{
	double limit;
	ArrayList<GoodsPO> giftList;
	ArrayList<GoodsPO> giftPOucher;
	Date start;
	Date end;
	RichGift(double limit,ArrayList<GoodsPO> giftList,ArrayList<GoodsPO> giftPOucher,Date start,Date end){
		this.limit=limit;
		this.giftList=giftList;
		this.giftPOucher=giftPOucher;
		this.start=start;
		this.end=end;
	}
	}
