package businesslogicservice;

//created by pg,edited by xyh
import vo.ReceiptVO;

public interface CheckBLService {

	public ResultMessage submit(ReceiptVO receipt);
	public ResultMessage send(ReceiptVO receipt);
	public ReceiptVO seeReceipt(ResultMessage x);
	public ResultMessage reviseReceipt(ReceiptVO recipt);
	public ResultMessage checkReceipt(ResultMessage x);
	
}
