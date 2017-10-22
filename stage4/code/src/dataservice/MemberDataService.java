package dataservice;

import businesslogicservice.ResultMessage;
import po.MemberPO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/19.
 */
public interface MemberDataService {
    public ResultMessage add(MemberPO po);
    public ResultMessage delete(MemberPO po);
    public ResultMessage modify(MemberPO po);
    public ArrayList<MemberPO> find(String keywords);
}
