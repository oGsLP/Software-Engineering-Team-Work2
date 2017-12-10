package service.dataservice;

import objects.ResultMessage;
import po.SalePO;

/**
 * Created by py on 2017/10/20.
 */
public interface SaleDataService {
    /**
     * 增加销售商品
     * @param po
     * @return
     */
   public ResultMessage add(SalePO po);

    /**
     * 减少销售商品
     * @param po
     * @return
     */
   public ResultMessage delete(SalePO po);

    /**
     * 更新销售商品
     * @param po
     * @return
     */
   public ResultMessage update(SalePO po);


    /**
     * 计算销售退货商品价格
     * @param po
     * @return
     */
   public double calculatePrice(SalePO po);

}
