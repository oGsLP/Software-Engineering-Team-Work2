package rmi;

/**
 * Created by py on 2017/10/19.
 */

import service.blservice.*;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RemoteHelper {
    private Remote remote;
    private static RemoteHelper remoteHelper = new RemoteHelper();

    public static RemoteHelper getInstance(){
        return remoteHelper;
    }

    public RemoteHelper(){
        initServer();
    }

    public void initServer(){
        DataRemoteObject dataRemoteObject;
        try {
            dataRemoteObject = new DataRemoteObject();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/DataRemoteObject",
                    (Remote) dataRemoteObject);
            System.out.println("ready");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }

    public void setRemote(Remote remote){
        this.remote = remote;
    }

    public ClassifyBLService getClassifyBLService(){
        return (ClassifyBLService)remote;
    }

    public CommodityBLService getCommodityBLService(){
        return (CommodityBLService)remote;
    }

    public GoodsBLService getGoodsBLService(){
        return (GoodsBLService)remote;
    }

    public MemberBLService getMemberBLService(){
        return (MemberBLService)remote;
    }


    public GoodsStockBLService getGoodsStockBLService(){
        return (GoodsStockBLService)remote;
    }

    public GoodsStockReturnBLService getGoodsStockReturnBLService(){
        return (GoodsStockReturnBLService)remote;
    }

    public GoodsSaleBLService getGoodsSaleBLService(){
        return (GoodsSaleBLService)remote;
    }

    public GoodsSaleReturnBLService getGoodsSaleReturnBLService(){
        return (GoodsSaleReturnBLService)remote;
    }


    public SaleBLService getSaleBLService(){
        return (SaleBLService)remote;
    }

    public SaleReturnBLService getSaleReturnBLService(){
        return (SaleReturnBLService)remote;
    }
    public StockBLService getStockBLService(){
        return (StockBLService)remote;
    }

    public StockReturnBLService getStockReturnBLService(){
        return (StockReturnBLService)remote;
    }

}
