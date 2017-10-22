package businesslogic;

import java.io.File;
import java.util.ArrayList;

import businesslogicservice.ManageBLService;
import businesslogicservice.ResultMessage;
import vo.SaleDetailRecordVO;
import vo.SaleDetailRequirementVO;
import vo.SaleProblemInformationVO;
import vo.SaleProcessRecordVO;
import vo.SaleProcessRequirementVO;

public class ManageBLService_Stub implements ManageBLService{

	SaleDetailRecordVO saleDetail;
	SaleDetailRequirementVO saleDetailRequirement;
	SaleProcessRecordVO saleProcess;
	SaleProcessRequirementVO saleProcessRequirement;
	SaleProblemInformationVO SaleInfo;
	
	ManageBLService_Stub(SaleDetailRecordVO saleDetail,SaleDetailRequirementVO saleDetailRequirement
			,SaleProcessRecordVO saleProcess,SaleProcessRequirementVO saleProcessRequirement,SaleProblemInformationVO SaleInfo){
		this.saleDetail=saleDetail;
		this.saleDetailRequirement=saleDetailRequirement;
		this.saleProcess=saleProcess;
		this.saleProcessRequirement=saleProcessRequirement;
		this.SaleInfo=SaleInfo;
	}

	@Override
	public ArrayList<SaleDetailRequirementVO> seeDetail(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleDetailRecordVO> addSaleDetailRequirement(
			ArrayList<SaleDetailRequirementVO> saleDetailRequirementList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleProcessRequirementVO> seeSaleProcess(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleProcessRecordVO> addSaleProcess(
			ArrayList<SaleProcessRequirementVO> saleProcessRequirementList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage operate(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage confirm(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage writeAndCopy(File f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage cancel(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SaleProblemInformationVO> seeSaleProblem(ResultMessage x) {
		// TODO Auto-generated method stub
		return null;
	}
