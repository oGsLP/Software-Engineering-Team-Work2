package dataservice;

import java.util.ArrayList;

import po.*;
import businesslogicservice.ResultMessage;

public interface BankDataService {
	//created by peng 
	
	public ResultMessage add (BankPO bank);
	public ResultMessage update(BankPO bank);
	public ResultMessage delete(BankPO bank);
	public BankPO get(String Number);
	public ArrayList<BankPO> getList();

	
	
}
