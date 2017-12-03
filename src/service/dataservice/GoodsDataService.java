package service.dataservice;

import objects.ResultMessage;
import po.GoodsPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public interface GoodsDataService {
    /**
     * 增加商品
     * @param po
     * @return
     */
    public ResultMessage add(GoodsPO po);

    /**
     * 删除商品
     * @param po
     * @return
     */
    public ResultMessage delete(GoodsPO po);

    /**
     * 修改商品信息
     * @param po
     * @return
     */
    public ResultMessage update(GoodsPO po);

    /**
     * 显示商品信息，由keywords决定是显示全部还是部分信息
     * @param keywords
     * @return
     */
    public ArrayList<GoodsPO> retrive(String keywords);

    /**
     * 模糊查找商品信息
     * @param keywords
     * @return
     */
    public ArrayList<GoodsPO>find(String keywords);
}
