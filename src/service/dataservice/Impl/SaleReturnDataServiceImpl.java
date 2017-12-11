package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.SaleReturnPO;
import service.dataservice.SaleReturnDataService;

public class SaleReturnDataServiceImpl implements SaleReturnDataService{
    @Override
    public ResultMessage add(SaleReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(SaleReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(SaleReturnPO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.update(po);
        return ResultMessage.Success;
    }
}
