package service.datafactory;

import service.dataservice.ClassifyDataService;
import service.dataservice.CommodityDataService;
import service.dataservice.GoodsDataService;
import service.dataservice.MemberDataService;
import service.dataservice.ReturnDataService;
import service.dataservice.SaleDataService;
import service.dataservice.StockDataService;

public interface DataFactory {
    public ClassifyDataService getClassifyDataService();

    public CommodityDataService getCommodityDataService();

    public GoodsDataService getGoodsDataService();

    public MemberDataService getMemberDataService();

    public ReturnDataService getReturnDataService();

    public SaleDataService getSaleDataService();

    public StockDataService getStockDataService();


}
