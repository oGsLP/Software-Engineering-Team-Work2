package service.dataservice.Impl;

import objects.HQLTools;
import objects.ResultMessage;
import po.GoodsSalePO;
import service.dataservice.GoodsSaleService;

public class GoodsSaleServiceImpl implements GoodsSaleService{
    @Override
    public ResultMessage add(GoodsSalePO po) {
        if(po == null)
            return ResultMessage.Fail;
        HQLTools.add(po);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(GoodsSalePO po) {
        return null;
    }

    @Override
    public ResultMessage update(GoodsSalePO po) {
        return null;
    }


}
