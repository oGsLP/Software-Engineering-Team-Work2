package vo;

import java.sql.Date;

public class SaleDetailRequirementVO {

	Date start;
	Date end;
	String name;
	ClientVO client;
	String salesMan;
	String storage;
	SaleDetailRequirementVO(Date start,Date end,String name,ClientVO client,String salesMan,String storage){
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
