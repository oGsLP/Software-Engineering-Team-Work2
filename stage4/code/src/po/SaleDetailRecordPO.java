package po;

import java.util.ArrayList;

public class SaleDetailRecordPO {
	
	ArrayList<GoodsPO> soldList;
	double sum;
	SaleDetailRecordPO(ArrayList<GoodsPO> soldList,double sum){
		this.soldList=soldList;
		this.sum=sum;
	}
	
	ArrayList<GoodsPO> getSoldList(){
		return soldList;
	}
	
	double getSum(){
		return sum;
	}
	
}
