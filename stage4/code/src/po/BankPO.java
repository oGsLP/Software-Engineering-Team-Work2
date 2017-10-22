package po;

import java.io.Serializable;

public class BankPO implements Serializable{
	//created by peng 
	String name;
	double balance;
	
	public BankPO(String name,double balance){
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
