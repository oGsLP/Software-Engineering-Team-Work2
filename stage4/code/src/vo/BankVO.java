package vo;


public class BankVO {
	//created by peng 
	String name;
	double balance;
	

	public BankVO(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
}
