package vo;

import java.util.ArrayList;

public class SaleProcessRecordVO {
	ArrayList<SaleVO> saleList;
	ArrayList<StockVO> stockList;
	ArrayList<ReturnVO> returnList;
	ArrayList<CollectVO> collectList;
	ArrayList<PayVO> payList;
	ArrayList<CommodityVO> commodityList;

	SaleProcessRecordVO(ArrayList<SaleVO> saleList,ArrayList<StockVO> stockList,ArrayList<ReturnVO> returnList,ArrayList<CollectVO> collectList,ArrayList<PayVO> payList,ArrayList<CommodityVO> commodityList){
		this.saleList=saleList;
		this.stockList=stockList;
		this.returnList=returnList;
		this.collectList=collectList;
		this.payList=payList;
		this.commodityList=commodityList;
	}
	ArrayList<SaleVO> getSaleList(){
		return saleList;
		
	}
	ArrayList<StockVO> getStockList(){
		return stockList;
		
	}
	ArrayList<CollectVO> getCollectList(){
		return collectList;
		
	}
	ArrayList<PayVO> getPayList(){
		return payList;
		
	}
	ArrayList<CommodityVO> getcommodityList(){
		return commodityList;
		
	}
}
