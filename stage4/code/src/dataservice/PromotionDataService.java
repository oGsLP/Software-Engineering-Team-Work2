package dataservice;

//created by pg,edited by xyh
import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import po.GoodsPO;
import po.PromotionPO;

public interface PromotionDataService {

	public GoodsPO getGoodsInformation(GoodsPO goods);
	public ArrayList<GoodsPO> getPromotionGoods(ArrayList<PromotionPO> promotionList);
	public ResultMessage deleteInformation(String brand);
	public ResultMessage endInput(PromotionPO promotion);
	
}
