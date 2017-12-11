package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.SalePO;
import service.dataservice.SaleDataService;

public class SaleDataServiceImpl implements SaleDataService {

    @Override
    public ResultMessage add(SalePO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(SalePO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.delete(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage update(SalePO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.update(po);
        return ResultMessage.Success;
    }
}
