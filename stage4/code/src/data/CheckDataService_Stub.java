package data;

import businesslogicservice.ResultMessage;
import dataservice.CheckDataService;
import po.ReceiptPO;

public class CheckDataService_Stub implements CheckDataService{

	ReceiptPO receipt;
	CheckDataService_Stub(ReceiptPO po){
		this.receipt=po;
	}
	@Override
	public ResultMessage submit(ReceiptPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage send(ReceiptPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage revise(ReceiptPO po) {
		// TODO Auto-generated method stub
		return null;
	}

}
