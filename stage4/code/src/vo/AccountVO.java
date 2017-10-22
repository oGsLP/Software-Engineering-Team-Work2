package vo;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountVO implements Serializable{
	//created by peng 
	ArrayList<GoodsVO> GoodsList;
	ArrayList<BankVO> BankList;
	ArrayList<ClientVO> ClientList;
	
	public AccountVO(ArrayList<GoodsVO> GoodsList,ArrayList<BankVO> BankList,ArrayList<ClientVO> ClientList){
		this.GoodsList = GoodsList ;
		this.BankList= BankList;
		this.ClientList= ClientList;
	}
	
	public ArrayList<GoodsVO> getGoods(){
		return GoodsList;
		
	}
	
	public ArrayList<BankVO> getBank(){
		return BankList;
			
	}
	
	public ArrayList<ClientVO> getClient(){
		return ClientList;
		
	}
}





