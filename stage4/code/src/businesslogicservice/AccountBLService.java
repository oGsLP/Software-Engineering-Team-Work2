package businesslogicservice;

import java.util.ArrayList;
import vo.*;

public interface AccountBLService {
	//created by peng 
	public ArrayList<AccountVO> get ();
	public ResultMessage add (AccountVO account);
	public ResultMessage delete (AccountVO Account);
}
