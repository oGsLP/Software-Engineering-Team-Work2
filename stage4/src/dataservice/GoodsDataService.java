package dataservice;

import businesslogicservice.ResultMessage;
import po.GoodsPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public interface GoodsDataService {
    public ResultMessage add(GoodsPO goods);
    public ResultMessage delete(GoodsPO clas);
    public ResultMessage modify(GoodsPO clas);
    public ArrayList<GoodsPO>find(String keywords);
}
