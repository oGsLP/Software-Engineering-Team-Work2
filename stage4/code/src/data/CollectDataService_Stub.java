package data;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.CollectDataService;
import po.BankPO;
import po.ClientPO;
import po.CollectPO;
import po.UserPO;

public class CollectDataService_Stub implements CollectDataService {

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
	
	public CollectDataService_Stub(String number,ClientPO supplier,ClientPO retailer,UserPO operator,ArrayList<income> incomeList,double sum){
		this.number=number;
		this.supplier=supplier;
		this.retailer=retailer;
		this.operator=operator;
		this.incomeList=incomeList;
		this.sum=sum;
		
	}
	
	@Override
	public ResultMessage add(CollectPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
	//created by peng 
}
