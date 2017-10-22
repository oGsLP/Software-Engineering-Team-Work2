package businesslogicservice;

import java.util.ArrayList;

import vo.GoodsVO;
import vo.PromotionVO;

//created by pg,edited by xyh
public interface PromotionBLService {

	public ArrayList<GoodsVO> returnGoodsInformation(String brand);
	public ArrayList<GoodsVO> returnPromotionList(ArrayList<PromotionVO> promotionList);
	public ResultMessage removeInformation(String brand);
	public ResultMessage end(PromotionVO promotion);
	
	
}
