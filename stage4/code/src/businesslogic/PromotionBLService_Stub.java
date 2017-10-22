package businesslogic;

import java.sql.Date;
import java.util.ArrayList;

import businesslogicservice.PromotionBLService;
import businesslogicservice.ResultMessage;
import po.GoodsPO;
import vo.GoodsVO;
import vo.PromotionVO;

public class PromotionBLService_Stub implements PromotionBLService{

	ArrayList<VipGift> vip;
	ArrayList<PublicGift> _public;
	ArrayList<RichGift> rich;
	
	PromotionBLService_Stub(ArrayList<VipGift> vip,ArrayList<PublicGift> _public,ArrayList<RichGift> rich){
		this.vip=vip;
		this._public=_public;
		this.rich=rich;
	}

	@Override
	public ArrayList<GoodsVO> returnGoodsInformation(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<GoodsVO> returnPromotionList(ArrayList<PromotionVO> promotionList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage removeInformation(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage end(PromotionVO promotion) {
		// TODO Auto-generated method stub
		return null;
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
	}
