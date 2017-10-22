package po;

import java.sql.Date;

public class SaleDetailRequirementPO {

	Date start;
	Date end;
	String name;
	ClientPO client;
	String salesMan;
	String storage;
	SaleDetailRequirementPO(Date start,Date end,String name,ClientPO client,String salesMan,String storage){
		this.start=start;
		this.end=end;
		this.name=name;
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
	String getName(){
		return name;
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
