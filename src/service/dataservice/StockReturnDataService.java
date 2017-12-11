package service.dataservice;

import objects.ResultMessage;
import po.StockReturnPO;

public interface StockReturnDataService {
    /**
     * 增加库存退货商品
     * @param po
     * @return
     */
    public ResultMessage add(StockReturnPO po);

    /**
     * 删除库存退货商品
     * @param po
     * @return
     */
    public ResultMessage delete(StockReturnPO po);

    /**
     * 更新库存退货商品
     * @param po
     * @return
     */
    public ResultMessage update(StockReturnPO po);
}
