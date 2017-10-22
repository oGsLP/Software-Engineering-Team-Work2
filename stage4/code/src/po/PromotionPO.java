package po;

import java.sql.Date;
import java.util.ArrayList;

	public class PromotionPO extends ReceiptPO {
		ArrayList<VipGift> vip;
		ArrayList<PublicGift> _public;
		ArrayList<RichGift> rich;
		
		PromotionPO(ArrayList<VipGift> vip,ArrayList<PublicGift> _public,ArrayList<RichGift> rich){
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
