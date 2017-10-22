package businesslogic;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import businesslogicservice.CollectBLService;
import vo.BankVO;
import vo.ClientVO;
import vo.CollectVO;
import vo.UserVO;

public class CollectBLService_Stub implements CollectBLService {

	String number;
	ClientVO supplier;
	ClientVO retailer;
	UserVO operator;
	ArrayList<income> incomeList;
	double sum;
	class income{
		BankVO bank;
		double money;;
		String remark;
	}
	
	public CollectBLService_Stub(String number,ClientVO supplier,ClientVO retailer,UserVO operator,ArrayList<income> incomeList,double sum){
		this.number=number;
		this.supplier=supplier;
		this.retailer=retailer;
		this.operator=operator;
		this.incomeList=incomeList;
		this.sum=sum;
		
	}
	
	@Override
	public ResultMessage add(CollectVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
	//created by peng 

	@Override
	public ResultMessage upload(CollectVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
}
