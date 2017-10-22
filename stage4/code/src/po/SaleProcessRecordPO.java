package po;

import java.util.ArrayList;

public class SaleProcessRecordPO {
	ArrayList<SalePO> saleList;
	ArrayList<StockPO> stockList;
	ArrayList<ReturnPO> returnList;
	ArrayList<CollectPO> collectList;
	ArrayList<PayPO> payList;
	ArrayList<CommodityPO> commodityList;

	SaleProcessRecordPO(ArrayList<SalePO> saleList,ArrayList<StockPO> stockList,ArrayList<ReturnPO> returnList,ArrayList<CollectPO> collectList,ArrayList<PayPO> payList,ArrayList<CommodityPO> commodityList){
		this.saleList=saleList;
		this.stockList=stockList;
		this.returnList=returnList;
		this.collectList=collectList;
		this.payList=payList;
		this.commodityList=commodityList;
	}
	ArrayList<SalePO> getSaleList(){
		return saleList;
		
	}
	ArrayList<StockPO> getStockList(){
		return stockList;
		
	}
	ArrayList<CollectPO> getCollectList(){
		return collectList;
		
	}
	ArrayList<PayPO> getPayList(){
		return payList;
		
	}
	ArrayList<CommodityPO> getcommodityList(){
		return commodityList;
		
	}
}
