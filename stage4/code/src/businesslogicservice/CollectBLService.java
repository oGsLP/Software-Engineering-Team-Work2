package businesslogicservice;

import vo.*;
import businesslogicservice.ResultMessage;

public interface CollectBLService {
	//created by peng 
	public ResultMessage add (CollectVO collect);
	public ResultMessage upload (CollectVO Collect);
}

