package businesslogic;

import businesslogicservice.CheckBLService;
import businesslogicservice.ResultMessage;
import vo.ReceiptVO;

public class CheckBLService_Stub implements CheckBLService{

	ReceiptVO receipt;
	CheckBLService_Stub(ReceiptVO vo){
		this.receipt=vo;
	}
	@Override
	public ResultMessage submit(ReceiptVO receipt) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultMessage send(ReceiptVO receipt) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ReceiptVO seeReceipt(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultMessage reviseReceipt(ReceiptVO recipt) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultMessage checkReceipt(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

}
