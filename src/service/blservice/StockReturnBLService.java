package service.blservice;

import objects.ResultMessage;
import vo.GoodsStockReturnVO;
import vo.StockReturnVO;

import java.rmi.RemoteException;
import java.util.Set;

public interface StockReturnBLService {
    /**
     * 增加库存退货单
     * @param provider
     * @param remark
     * @param set
     * @return
     * @throws RemoteException
     */
    public ResultMessage add(String provider, String remark, Set<GoodsStockReturnVO> set) throws RemoteException;

    /**
     * 删除库存退货单
     * @param vo
     * @return
     * @throws RemoteException
     */
    public ResultMessage delete(StockReturnVO vo) throws RemoteException;


    /**
     * 更新库存退货单
     * @param vo
     * @return
     * @throws RemoteException
     */
    public ResultMessage update(StockReturnVO vo) throws RemoteException;
}
