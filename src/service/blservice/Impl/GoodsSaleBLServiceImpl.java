package service.blservice.Impl;

import objects.ResultMessage;
import service.VOChangeToPO;
import service.blservice.GoodsSaleBLService;
import service.datafactory.DataFactory;
import service.datafactory.DataFactoryImpl;
import vo.GoodsSaleVO;
import vo.GoodsVO;

import java.rmi.RemoteException;

public class GoodsSaleBLServiceImpl implements GoodsSaleBLService {
    VOChangeToPO voChangeToPO = new VOChangeToPO();
    DataFactory dataFactory = new DataFactoryImpl();

    @Override
    public ResultMessage add(GoodsVO vo, int saleNumber, double price, String remark) throws RemoteException {
        GoodsSaleVO goodsSaleVO = new GoodsSaleVO();

        return null;
    }

    @Override
    public ResultMessage delete(GoodsSaleVO vo) throws RemoteException {
        return null;
    }

    @Override
    public ResultMessage update(GoodsSaleVO vo) throws RemoteException {
        return null;
    }
}
