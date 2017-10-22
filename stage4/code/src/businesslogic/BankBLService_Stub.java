package businesslogic;

import java.util.ArrayList;

import businesslogicservice.BankBLService;
import businesslogicservice.ResultMessage;
import dataservice.BankDataService;
import vo.BankVO;

public class BankBLService_Stub implements BankBLService{

	
	String name;
	double balance;
	
	public BankBLService_Stub(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	@Override
	public ResultMessage add(BankVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage update(BankVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public ResultMessage delete(BankVO vo) {
		// TODO Auto-generated method stub
		 if(vo != null)
	            return ResultMessage.Success;
	        else
	            return ResultMessage.Fail;
	}

	@Override
	public BankVO get(String Key) {
		// TODO Auto-generated method stub
		BankVO vo=new BankVO(name,balance);
		return vo;
	}

	@Override
	public ArrayList<BankVO> getList() {
		// TODO Auto-generated method stub
		BankVO vo=new BankVO(name,balance);
		ArrayList<BankVO> list=new ArrayList<>();
		list.add(vo);
		return list;
	}
	//created by peng 
}
