package businesslogic;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import businesslogicservice.PayBLService;
import vo.BankVO;
import vo.PayVO;
import vo.UserVO;

public class PayBLService_Stub implements PayBLService{

	
	String number;
	UserVO operator;
	BankVO bank;
	ArrayList<expense> ExpenseList;
	double sum;
	class expense{
		String name;
		double money;;
		String remark;
	}
	
	public PayBLService_Stub(String number,UserVO operator,BankVO bank,ArrayList<expense> ExpenseList,double sum){
		this.number=number;
		this.operator=operator;
		this.bank=bank;
		this.ExpenseList=ExpenseList;
		this.sum=sum;
	}
	
	@Override
	public ResultMessage add(PayVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
	//created by peng 

	@Override
	public ResultMessage upload(PayVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage execute(PayVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}
}
