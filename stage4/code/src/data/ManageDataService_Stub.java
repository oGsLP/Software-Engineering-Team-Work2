package data;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import dataservice.ManageDataService;
import po.*;

public class ManageDataService_Stub implements ManageDataService{

	SaleDetailRecordPO saleDetail;
	SaleDetailRequirementPO saleDetailRequirement;
	SaleProcessRecordPO saleProcess;
	SaleProcessRequirementPO saleProcessRequirement;
	SaleProblemInformationPO SaleInfo;
	
	ManageDataService_Stub(SaleDetailRecordPO saleDetail,SaleDetailRequirementPO saleDetailRequirement
			,SaleProcessRecordPO saleProcess,SaleProcessRequirementPO saleProcessRequirement,SaleProblemInformationPO SaleInfo){
		this.saleDetail=saleDetail;
		this.saleDetailRequirement=saleDetailRequirement;
		this.saleProcess=saleProcess;
		this.saleProcessRequirement=saleProcessRequirement;
		this.SaleInfo=SaleInfo;
	}
	@Override
	public ArrayList<SaleDetailRecordPO> addSaleDetail(ArrayList<SaleDetailRequirementPO> saleDetailRequirementList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleProcessRecordPO> addSaleProcess(
			ArrayList<SaleProcessRequirementPO> saleProcessRequirementList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReceiptPO operation(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReceiptPO confirmation(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage writeIn(ReceiptPO receipt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleProblemInformationPO> getSaleProblem(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

}
