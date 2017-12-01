package service.datafactory;

import service.dataservice.ClassifyDataService;
import service.dataservice.CommodityDataService;
import service.dataservice.GoodsDataService;
import service.dataservice.Impl.*;
import service.dataservice.MemberDataService;
import service.dataservice.ReturnDataService;
import service.dataservice.SaleDataService;
import service.dataservice.StockDataService;


public class DataFactoryImpl implements DataFactory{
    @Override
    public ClassifyDataService getClassifyDataService(){
        ClassifyDataService classify = new ClassifyDataServiceImpl();
        return classify;
    }

    @Override
    public CommodityDataService getCommodityDataService(){
        CommodityDataService commodity = new CommodityDataServiceImpl();
        return commodity;
    }

    @Override
    public GoodsDataService getGoodsDataService(){
        GoodsDataService goods = new GoodsDataServiceImpl();
        return goods;
    }

    @Override
    public MemberDataService getMemberDataService(){
        MemberDataService member = new MemberDataServiceImpl();
        return member;
    }

    @Override
    public ReturnDataService getReturnDataService(){
        ReturnDataService returnGoods = new ReturnDataServiceImpl();
        return returnGoods;
    }

    @Override
    public SaleDataService getSaleDataService(){
        SaleDataService sale = new SaleDataServiceDataImpl();
        return sale;
    }

    @Override
    public StockDataService getStockDataService(){
        StockDataService stock = new StockDataServiceImpl();
        return stock;
    }
}
