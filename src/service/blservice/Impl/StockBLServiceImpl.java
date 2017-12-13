package service.blservice.Impl;

import objects.AddHelper;
import objects.ResultMessage;
import po.StockPO;
import service.VOChangeToPO;
import service.blservice.StockBLService;
import service.datafactory.DataFactory;
import service.datafactory.DataFactoryImpl;
import vo.GoodsStockVO;
import vo.StockVO;

import java.rmi.RemoteException;
import java.util.Set;

public class StockBLServiceImpl implements StockBLService {
    VOChangeToPO voChangeToPO = new VOChangeToPO();
    DataFactory dataFactory = new DataFactoryImpl();
    AddHelper addHelper = new AddHelper();

    @Override
    public ResultMessage add(StockVO vo) throws RemoteException {
        if(vo == null)
            return ResultMessage.Fail;
        StockPO po = voChangeToPO.stockvo_to_stockpo(vo);
        dataFactory.getStockDataService().add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage add(String provider, String remark, Set<GoodsStockVO> set) throws RemoteException {
        StockVO vo = addHelper.getStockAddHelp(provider, remark, set);
        StockPO po = voChangeToPO.stockvo_to_stockpo(vo);
        dataFactory.getStockDataService().add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(StockVO vo) throws RemoteException {
        if(vo == null)
            return ResultMessage.Fail;
        StockPO po = voChangeToPO.stockvo_to_stockpo(vo);
        dataFactory.getStockDataService().delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(StockVO vo) throws RemoteException {
        if(vo == null)
            return ResultMessage.Fail;
        StockPO po = voChangeToPO.stockvo_to_stockpo(vo);
        dataFactory.getStockDataService().update(po);
        return ResultMessage.Success;
    }
}
