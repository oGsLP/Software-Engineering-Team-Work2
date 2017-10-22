package po;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountPO implements Serializable{
	//created by peng 
	ArrayList<GoodsPO> GoodsList;
	ArrayList<BankPO> BankList;
	ArrayList<ClientPO> ClientList;
	
	public AccountPO(ArrayList<GoodsPO> GoodsList,ArrayList<BankPO> BankList,ArrayList<ClientPO> ClientList){
		this.GoodsList = GoodsList ;
		this.BankList= BankList;
		this.ClientList= ClientList;
	}
	
	public ArrayList<GoodsPO> getGoods(){
		return GoodsList;
		
	}
	
	public ArrayList<BankPO> getBank(){
		return BankList;
			
	}
	
	public ArrayList<ClientPO> getClient(){
		return ClientList;
		
	}
}






