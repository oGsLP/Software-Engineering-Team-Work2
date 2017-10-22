package po;

import java.sql.Date;

public class SaleProcessRequirementPO {
	
	Date start;
	Date end;
	String type;
	ClientPO client;
	String salesMan;
	String storage;
	SaleProcessRequirementPO(Date start,Date end,String type,ClientPO member,String salesMan,String storage){
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
	ClientPO getClient(){
		return client;
		
	}
	String getSalesMan(){
		return salesMan;
		
	}
	String getStorage(){
		return storage;
		
	}
}
