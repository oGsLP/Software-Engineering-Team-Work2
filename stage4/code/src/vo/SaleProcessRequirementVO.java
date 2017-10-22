package vo;

import java.sql.Date;

public class SaleProcessRequirementVO {
	
	Date start;
	Date end;
	String type;
	ClientVO client;
	String salesMan;
	String storage;
	SaleProcessRequirementVO(Date start,Date end,String type,ClientVO member,String salesMan,String storage){
		this.start=start;
		this.end=end;
		this.type=type;
		this.client=client;
		this.salesMan=salesMan;
		this.storage=storage;
	}
	
	Date getStart(){
		return start;
		
	}
	Date getEnd(){
		return end;
		
	}
	String getType(){
		return type;
		
	}
	ClientVO getClient(){
		return client;
		
	}
	String getSalesMan(){
		return salesMan;
		
	}
	String getStorage(){
		return storage;
		
	}
}
