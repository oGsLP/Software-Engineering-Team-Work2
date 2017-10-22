package data;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.AccountDataService;
import po.AccountPO;
import po.BankPO;
import po.ClientPO;
import po.GoodsPO;

public class AccountDataService_Stub implements AccountDataService{
	
	ArrayList<GoodsPO> GoodsList;
	ArrayList<BankPO> BankList;
	ArrayList<ClientPO> ClientList;
	
	public AccountDataService_Stub(ArrayList<GoodsPO> GoodsList,ArrayList<BankPO> BankList,ArrayList<ClientPO> ClientList){
		this.GoodsList = GoodsList ;
		this.BankList= BankList;
		this.ClientList= ClientList;
	}
	
	@Override
	public ArrayList<AccountPO> get() {
		// TODO Auto-generated method stub
		AccountPO po=new AccountPO(GoodsList,BankList,ClientList);
		ArrayList<AccountPO> list =new ArrayList<>();
		list.add(po);
		return list;
	}

	@Override
	public ResultMessage add(AccountPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(AccountPO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	//created by peng 
	
	
}
