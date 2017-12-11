package service.dataservice;

import objects.ResultMessage;
import po.StockPO;

/**
 * Created by py on 2017/10/20.
 * 进货单的数据类
 */
public interface StockDataService {
    /**
     * 增加进货单
     * @param po
     * @return
     */
    public ResultMessage add(StockPO po);

    /**
     * 删除进货单
     * @param po
     * @return
     */
    public ResultMessage delete(StockPO po);

    /**
     * 更新进货单
     * @param po
     * @return
     */
    public ResultMessage update(StockPO po);
}
