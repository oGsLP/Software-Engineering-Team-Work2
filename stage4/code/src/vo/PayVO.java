package vo;

import java.util.ArrayList;

public class PayVO extends ReceiptVO {
	//created by peng 
	String number;
	UserVO operator;
	BankVO bank;
	ArrayList<expense> ExpenseList;
	double sum;
	class expense{
		String name;
		double money;;
		String remark;
	}
	
	public PayVO(String number,UserVO operator,BankVO bank,ArrayList<expense> ExpenseList,double sum){
		this.number=number;
		this.operator=operator;
		this.bank=bank;
		this.ExpenseList=ExpenseList;
		this.sum=sum;
	}
	
	public String getNumber(){
		return number;
		
	}
	
	public UserVO getOperator(){
		return operator;
		
	};
	
	public BankVO getBank(){
		return bank;
	}
	
	public ArrayList<expense> getExpenseList(){
		return ExpenseList;
		
	};
	
	public double getSum(){
		return sum;
		
	};
}


