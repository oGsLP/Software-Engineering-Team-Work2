package dataservice;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import po.*;

//created by pg,edited by xyh
public interface ManageDataService {

	public ArrayList<SaleDetailRecordPO> addSaleDetail(ArrayList<SaleDetailRequirementPO> saleDetailRequirementList);
	public ArrayList<SaleProcessRecordPO> addSaleProcess(ArrayList<SaleProcessRequirementPO> saleProcessRequirementList);
	public ReceiptPO operation(ResultMessage x);
	public ReceiptPO confirmation(ResultMessage x);
	public ResultMessage writeIn(ReceiptPO receipt);
	public ArrayList<SaleProblemInformationPO> getSaleProblem(ResultMessage x);
	
}
