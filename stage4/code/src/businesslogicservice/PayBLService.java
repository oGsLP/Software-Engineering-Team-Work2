package businesslogicservice;

import vo.*;
import businesslogicservice.ResultMessage;

public interface PayBLService {
	//created by peng 
	public ResultMessage add (PayVO pay);
	public ResultMessage upload (PayVO pay);
	public ResultMessage execute (PayVO colllect);
}
