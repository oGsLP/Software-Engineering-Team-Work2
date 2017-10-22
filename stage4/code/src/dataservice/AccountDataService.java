package dataservice;

import java.util.ArrayList;
import businesslogicservice.ResultMessage;
import po.*;

public interface AccountDataService {
	//created by peng 
	public ArrayList<AccountPO> get ();
	public ResultMessage add (AccountPO account);
	public ResultMessage delete (AccountPO Account);

	
}
