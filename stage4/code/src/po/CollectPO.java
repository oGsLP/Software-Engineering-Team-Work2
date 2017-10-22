package po;

import java.util.ArrayList;
import java.io.Serializable;

public class CollectPO extends ReceiptPO implements Serializable{
	//created by peng 
	String number;
	ClientPO supplier;
	ClientPO retailer;
	UserPO operator;
	ArrayList<income> incomeList;
	double sum;
	class income{
		BankPO bank;
		double money;;
		String remark;
	}
	
	public CollectPO(String number,ClientPO supplier,ClientPO retailer,UserPO operator,ArrayList<income> incomeList,double sum){
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
	
	public ClientPO getSupplier(){
		return supplier;
		
	};
	
	public ClientPO getRetailer(){
		return retailer;
		
	};
	
	public UserPO getOperator(){
		return operator;
		
	};
	
	public ArrayList<income> getIncomeList(){
		return incomeList;
		
	};
	
	public double getSum(){
		return sum;
		
	};
}
