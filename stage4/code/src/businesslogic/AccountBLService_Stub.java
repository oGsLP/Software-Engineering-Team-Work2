package businesslogic;

import java.util.ArrayList;
import businesslogicservice.AccountBLService;
import businesslogicservice.ResultMessage;
import vo.*;

public class AccountBLService_Stub implements AccountBLService{
	
	ArrayList<GoodsVO> GoodsList;
	ArrayList<BankVO> BankList;
	ArrayList<ClientVO> ClientList;
	
	public AccountBLService_Stub(ArrayList<GoodsVO> GoodsList,ArrayList<BankVO> BankList,ArrayList<ClientVO> ClientList){
		this.GoodsList = GoodsList ;
		this.BankList= BankList;
		this.ClientList= ClientList;
	}
	
	@Override
	public ArrayList<AccountVO> get() {
		// TODO Auto-generated method stub
		AccountVO po=new AccountVO(GoodsList,BankList,ClientList);
		ArrayList<AccountVO> list =new ArrayList<>();
		list.add(po);
		return list;
	}

	@Override
	public ResultMessage add(AccountVO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(AccountVO po) {
		// TODO Auto-generated method stub
		 if(po != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	//created by peng 
	
	
}
