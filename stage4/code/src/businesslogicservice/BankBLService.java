package businesslogicservice;

import java.util.ArrayList;
import vo.*;
import businesslogicservice.ResultMessage;

public interface BankBLService {
	//created by peng 
	
	public ResultMessage add (BankVO bank);
	public ResultMessage update(BankVO bank);
	public ResultMessage delete (BankVO bank);
	public BankVO get (String Number);
	public ArrayList<BankVO> getList();

	
	
}
