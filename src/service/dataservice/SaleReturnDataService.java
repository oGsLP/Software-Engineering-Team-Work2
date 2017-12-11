package service.dataservice;

import objects.ResultMessage;
import po.SaleReturnPO;

/**
 * 销售退货的数据服务类
 */
public interface SaleReturnDataService {
    /**
     * 增加销售退货商品
     * @param po
     * @return
     */
    public ResultMessage add(SaleReturnPO po);

    /**
     * 删除销售退货商品
     * @param po
     * @return
     */
    public ResultMessage delete(SaleReturnPO po);

    /**
     * 更新销售货商品
     * @param po
     * @return
     */
    public ResultMessage update(SaleReturnPO po);
}
