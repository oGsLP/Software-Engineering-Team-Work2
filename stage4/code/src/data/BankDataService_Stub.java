package data;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.BankDataService;
import po.BankPO;

public class BankDataService_Stub implements BankDataService{

	
	String name;
	double balance;
	
	public BankDataService_Stub(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	@Override
	public ResultMessage add(BankPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage update(BankPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(BankPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public BankPO get(String Key) {
		// TODO Auto-generated method stub
		BankPO po=new BankPO(name,balance);
		return po;
	}

	@Override
	public ArrayList<BankPO> getList() {
		// TODO Auto-generated method stub
		BankPO po=new BankPO(name,balance);
		ArrayList<BankPO> list=new ArrayList<>();
		list.add(po);
		return list;
	}
	//created by peng 
}
