package po;

import java.util.ArrayList;
import java.io.Serializable;

public class PayPO extends ReceiptPO implements Serializable{
	//created by peng 
	String number;
	UserPO operator;
	BankPO bank;
	ArrayList<expense> ExpenseList;
	double sum;
	class expense{
		String name;
		double money;;
		String remark;
	}
	
	public PayPO(String number,UserPO operator,BankPO bank,ArrayList<expense> ExpenseList,double sum){
		this.number=number;
		this.operator=operator;
		this.bank=bank;
		this.ExpenseList=ExpenseList;
		this.sum=sum;
	}
	
	public String getNumber(){
		return number;
		
	}
	
	public UserPO getOperator(){
		return operator;
		
	};
	
	public BankPO getBank(){
		return bank;
	}
	
	public ArrayList<expense> getExpenseList(){
		return ExpenseList;
		
	};
	
	public double getSum(){
		return sum;
		
	};
}

