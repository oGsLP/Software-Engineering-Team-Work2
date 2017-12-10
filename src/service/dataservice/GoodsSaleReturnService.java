package service.dataservice;

import objects.ResultMessage;
import po.GoodsSaleReturnPO;

public interface GoodsSaleReturnService {
    /**
     * 增加销售退货商品
     * @param po
     * @return
     */
    public ResultMessage add(GoodsSaleReturnPO po);

    /**
     * 删除销售退货商品
     * @param po
     * @return
     */
    public ResultMessage delete(GoodsSaleReturnPO po);

    /**
     * 更新销售退货商品
     * @param po
     * @return
     */
    public ResultMessage update(GoodsSaleReturnPO po);

    /**
     * 计算销售退货商品价格
     * @param po
     * @return
     */
    public double calculatePrice(GoodsSaleReturnPO po);

}
