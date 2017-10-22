package dataservice;

import businesslogicservice.ResultMessage;
import po.GoodsPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public interface GoodsDataService {
    public ResultMessage add(GoodsPO po);
    public ResultMessage delete(GoodsPO po);
    public ResultMessage modify(GoodsPO po);
    public ArrayList<GoodsPO>find(String keywords);
}
