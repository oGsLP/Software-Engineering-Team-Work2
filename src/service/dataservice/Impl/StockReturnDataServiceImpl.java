package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.StockReturnPO;
import service.dataservice.StockReturnDataService;

/**
 * 库存退货单的数据类
 */
public class StockReturnDataServiceImpl implements StockReturnDataService {

    @Override
    public ResultMessage add(StockReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(StockReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(StockReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.update(po);
        return ResultMessage.Success;
    }
}
