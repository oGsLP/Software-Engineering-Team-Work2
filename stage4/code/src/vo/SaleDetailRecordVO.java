package vo;

import java.util.ArrayList;

public class SaleDetailRecordVO {
	
	ArrayList<GoodsVO> soldList;
	double sum;
	SaleDetailRecordVO(ArrayList<GoodsVO> soldList,double sum){
		this.soldList=soldList;
		this.sum=sum;
	}
	
	ArrayList<GoodsVO> getSoldList(){
		return soldList;
	}
	
	double getSum(){
		return sum;
	}
	
}
