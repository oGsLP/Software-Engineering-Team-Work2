package data;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.PayDataService;
import po.BankPO;
import po.PayPO;
import po.UserPO;

public class PayDataServise_Stub implements PayDataService{

	
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
	
	public PayDataServise_Stub(String number,UserPO operator,BankPO bank,ArrayList<expense> ExpenseList,double sum){
		this.number=number;
		this.operator=operator;
		this.bank=bank;
		this.ExpenseList=ExpenseList;
		this.sum=sum;
	}
	
	@Override
	public ResultMessage add(PayPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
	//created by peng 
}
