package service.dataservice;

import objects.ResultMessage;
import po.ClassifyPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public interface ClassifyDataService {
    public ResultMessage add(ClassifyPO po);
    public ResultMessage delete(ClassifyPO po);
    public ResultMessage modify(ClassifyPO po);
    public ArrayList<ClassifyPO> find(String keywords);
}
