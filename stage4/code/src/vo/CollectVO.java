package vo;

import java.util.ArrayList;

public class CollectVO extends ReceiptVO {
	//created by peng 
	String number;
	ClientVO supplier;
	ClientVO retailer;
	UserVO operator;
	ArrayList<income> incomeList;
	double sum;
	class income{
		BankVO bank;
		double money;;
		String remark;
	}
	
	public CollectVO(String number,ClientVO supplier,ClientVO retailer,UserVO operator,ArrayList<income> incomeList,double sum){
		this.number=number;
		this.supplier=supplier;
		this.retailer=retailer;
		this.operator=operator;
		this.incomeList=incomeList;
		this.sum=sum;
		
	}

	public String getNumber(){
		return number;
		
	}
	
	public ClientVO getSupplier(){
		return supplier;
		
	};
	
	public ClientVO getRetailer(){
		return retailer;
		
	};
	
	public UserVO getOperator(){
		return operator;
		
	};
	
	public ArrayList<income> getIncomeList(){
		return incomeList;
		
	};
	
	public double getSum(){
		return sum;
		
	};
}

