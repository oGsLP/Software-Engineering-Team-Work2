package dataservice;

//created by pg, edited by xyh
import businesslogicservice.ResultMessage;
import po.ReceiptPO;

public interface CheckDataService {

	public ResultMessage submit(ReceiptPO receipt);
	public ResultMessage send(ReceiptPO receipt);
	public ResultMessage revise(ReceiptPO receipt);
	
	
}
