package service.blservice.Impl;

import objects.AddHelper;
import objects.ResultMessage;
import po.StockReturnPO;
import service.VOChangeToPO;
import service.blservice.StockReturnBLService;
import service.datafactory.DataFactory;
import service.datafactory.DataFactoryImpl;
import vo.GoodsStockReturnVO;
import vo.StockReturnVO;

import java.rmi.RemoteException;
import java.util.Set;

public class StockReturnBLServiceImpl implements StockReturnBLService {

    VOChangeToPO voChangeToPO = new VOChangeToPO();
    DataFactory dataFactory = new DataFactoryImpl();
    AddHelper addHelper = new AddHelper();

    @Override
    public ResultMessage add(String provider, String remark, Set<GoodsStockReturnVO> set) throws RemoteException {
        StockReturnVO vo = addHelper.getStockReturnHelp(provider, remark, set);
        StockReturnPO po = voChangeToPO.stockReturnvo_to_stockReturnpo(vo);
        dataFactory.getStockReturnDataService().add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(StockReturnVO vo) throws RemoteException {
        if(vo == null)
            return ResultMessage.Fail;
        StockReturnPO po = voChangeToPO.stockReturnvo_to_stockReturnpo(vo);
        dataFactory.getStockReturnDataService().delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(StockReturnVO vo) throws RemoteException {
        if(vo == null)
            return ResultMessage.Fail;
        StockReturnPO po = voChangeToPO.stockReturnvo_to_stockReturnpo(vo);
        dataFactory.getStockReturnDataService().update(po);
        return ResultMessage.Success;
    }

}
