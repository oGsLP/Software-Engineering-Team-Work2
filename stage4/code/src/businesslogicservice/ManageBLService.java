package businesslogicservice;

//created by pg,edited by xyh
import java.io.File;
import java.util.ArrayList;

import vo.SaleDetailRecordVO;
import vo.SaleDetailRequirementVO;
import vo.SaleProblemInformationVO;
import vo.SaleProcessRecordVO;
import vo.SaleProcessRequirementVO;

public interface ManageBLService {

	public ArrayList<SaleDetailRequirementVO> seeDetail(ResultMessage x);
	public ArrayList<SaleDetailRecordVO> addSaleDetailRequirement(ArrayList<SaleDetailRequirementVO> saleDetailRequirementList);
	public ArrayList<SaleProcessRequirementVO> seeSaleProcess(ResultMessage x);
	public ArrayList<SaleProcessRecordVO> addSaleProcess(ArrayList<SaleProcessRequirementVO> saleProcessRequirementList);
	public ResultMessage operate(ResultMessage x);
	public ResultMessage confirm(ResultMessage x);
	public ResultMessage writeAndCopy(File f );
	public ResultMessage cancel(ResultMessage x);
	public ArrayList<SaleProblemInformationVO> seeSaleProblem(ResultMessage x);
	
}
